package adv1.thread.bounded;

import static adv1.util.MyLogger.log;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// 한정된 버퍼 구현체 5:
// ReentrantLock을 사용하는데, 같은 락에 연결된 스레드 대기집합을 생산자용, 소비자용 이렇게 2개 만들음. (synchronized의 wait set과 달리 Condition별로 대기 공간을 분리할 수 있다.)
// 생산자 스레드가 생산함 -> 소비자 대기집합에서 하나 깨움
// 소비자 스레드가 소비함 -> 생산자 대기집합에서 하나 깨움
// ==> 소비자가 소비자 깨우고, 생산자가 생산자 깨우는 비효율을 없앨 수 있었다.
public class BoundedQueueV5 implements BoundedQueue {

    private final Lock lock = new ReentrantLock();

    // lock.newCondition() 하면 'lock' 과 관련된 스레드 대기집합을 만들 수 있음.
    // 락은 하나라도 그 락에 연결된 대기집합은 여러개 만들 수 있음. 아래는 ReentrantLock 인스턴스 lock에 연결된 대기집합 2개만듦.
    private final Condition producerCond = lock.newCondition(); //생산자 스레드용 대기집합.
    private final Condition consumerCond = lock.newCondition(); //소비자 스레드용 대기집합.

    private final Queue<String> bufferQueue = new ArrayDeque<>();
    private final int max;

    public BoundedQueueV5(int max) {
        this.max = max;
    }

    @Override
    public void put(String data) {
        lock.lock();
        try {
            // 버퍼가 가득 찼으면 빌 때 까지 계속 대기함.
            while (bufferQueue.size() == max) {
                log("[put] 큐가 가득 참, producerCond.await()"); //생산자 스레드 대기집합(Condition)에서 대기
                try {
                    //현재 스레드는 producerCond에서 기다림
                    producerCond.await();
                    log("[put] 생산자 깨어남");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            // 버퍼에 자리가 있으면 바로 data 넣고, 대기중인 소비자스레드 중 하나 깨움.
            bufferQueue.offer(data);
            log("[put] 생산자 데이터 저장, consumerCond.signal() 호출"); // 소비자 스레드 대기집합(consumerCond)에서 하나 깨움
            consumerCond.signal();

        } finally {
            lock.unlock();
        }
    }

    @Override
    public String take() {
        lock.lock();
        try {
            // 버퍼가 비었으면 찰 때 까지 계속 대기함.
            while (bufferQueue.isEmpty()) {
                log("[take] 큐에 데이터가 없음, consumerCond.await()"); //소비자 스레드 대기집합(consumerCond)에서 대기
                try {
                    consumerCond.await();
                    log("[take] 소비자 깨어남");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            // 버퍼에 자리가 있으면 바로 data 빼냄
            String data = bufferQueue.poll();
            log("[take] 소비자 데이터 획득, producerCond.signal() 호출"); //생산자 스레드 대기집합(producerCond)에서 하나 깨움
            producerCond.signal();
            return data;
        } finally {
            lock.unlock();
        }
    }

    @Override
    public String toString() {
        return bufferQueue.toString();
    }
}
