package adv1.thread.bounded;

import static adv1.util.MyLogger.log;

import java.util.ArrayDeque;
import java.util.Queue;

// 한정된 버퍼 구현체 3 : Object.wait()으로 락 반납하고 기다리기
// 생산자 스레드가 put()으로 데이터 채우려는데 버퍼가 가득 찼으면
// -> Object.wait() 호출해서 락 반납하고 아무 소비자 스레드가 버퍼에서 데이터 가져가서 자리 나기까지 대기.
// 소비자 스레드가 take()로 데이터 가져가려는데 버퍼가 비었으면,
// -> Object.wait() 호출해서 락 반납하고 아무 생산자 스레드가 채워주길 기다림.
public class BoundedQueueV3 implements BoundedQueue {

    private final Queue<String> bufferQueue = new ArrayDeque<>();
    private final int max;

    public BoundedQueueV3(int max) {
        this.max = max;
    }

    @Override
    public synchronized void put(String data) {
        // 버퍼가 가득 찼으면 빌 때 까지 계속 대기함.
        while (bufferQueue.size() == max) {
            log("[put] 큐가 가득 참, 생산자 대기");

            try {
                wait(); // RUNNABLE -> WAITING, 락 반납
                log("[put] 생산자 깨어남");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        // 버퍼에 자리가 있으면 바로 data 넣고, 대기중인 스레드 중 하나 깨움.
        bufferQueue.offer(data);
        log("[put] 생산자 데이터 저장, notify() 호출");
        notify(); // 대기중(WAITING)인 스레드 중 하나를 깨움.(BLOCKED로 바꿈)
        //notifyAll();
    }

    @Override
    public synchronized String take() {
        // 버퍼가 비었으면 찰 때 까지 계속 대기함.
        // notify()를 받아 깨어나도, 락을 다시 얻는 사이에 다른 스레드가 먼저 상태를 바꿀 수 있기 때문에,
        // if(버퍼가 비었다면) wait(); 이게 아니라
        // while(버퍼 비었다면) wait(); 으로 한다.
        while (bufferQueue.isEmpty()) {
            log("[take] 큐에 데이터가 없음, 소비자 대기");
            try {
                wait(); // RUNNABLE -> WAITING, 락 반납
                log("[take] 소비자 깨어남");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        // 버퍼에 자리가 있으면 바로 data 빼냄
        String data = bufferQueue.poll();
        log("[take] 소비자 데이터 획득, notify() 호출");
        notify(); // 대기중(WAITING)인 스레드 중 하나를 깨움.(BLOCKED로 바꿈)
        //notifyAll();
        return data;
    }

    @Override
    public String toString() {
        return bufferQueue.toString();
    }
}
