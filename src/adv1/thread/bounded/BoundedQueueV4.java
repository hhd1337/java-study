package adv1.thread.bounded;

import static adv1.util.MyLogger.log;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// 한정된 버퍼 구현체 4:
// ReentrantLock을 사용하여 synchronized와 같은 환경 재현. (스레드 대기집합 하나, Condition condition = lock.newCondition();)
// 1) 모니터 락 역할 -> Lock lock = new ReentrantLock();
// 2) 스레드 대기집합 역할 -> Condition condition = lock.newCondition();
// 3) Object.wait() -> condition.await()
// 4) Object.notify() -> condition.signal()
public class BoundedQueueV4 implements BoundedQueue {

    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();//스레드가 기다리는 대기집합. wait set.

    private final Queue<String> bufferQueue = new ArrayDeque<>();
    private final int max;

    public BoundedQueueV4(int max) {
        this.max = max;
    }

    @Override
    public void put(String data) {
        lock.lock();
        try {
            // 버퍼가 가득 찼으면 빌 때 까지 계속 대기함.
            while (bufferQueue.size() == max) {
                log("[put] 큐가 가득 참, 생산자 대기");
                try {
                    //현재 스레드는 이 Condition의 대기 공간에서 기다림 -> Object.wait()과 대응되는 메서드.
                    condition.await(); //synchronized의 wait set과 달리 Condition별로 대기 공간을 분리할 수 있다.
                    log("[put] 생산자 깨어남");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            // 버퍼에 자리가 있으면 바로 data 넣고, 대기중인 스레드 중 하나 깨움.
            bufferQueue.offer(data);
            log("[put] 생산자 데이터 저장, signal() 호출");
            condition.signal();

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
                log("[take] 큐에 데이터가 없음, 소비자 대기");
                try {
                    condition.await();
                    log("[take] 소비자 깨어남");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            // 버퍼에 자리가 있으면 바로 data 빼냄
            String data = bufferQueue.poll();
            log("[take] 소비자 데이터 획득, signal() 호출");
            condition.signal();
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
