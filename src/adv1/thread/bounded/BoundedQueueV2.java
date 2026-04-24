package adv1.thread.bounded;

import static adv1.util.MyLogger.log;
import static adv1.util.ThreadUtils.sleep;

import java.util.ArrayDeque;
import java.util.Queue;

// 한정된 버퍼 구현체 2 :
// while문을 통해서, 버퍼가 가득 찼으면 빌 때 까지 생산자가 계속 대기하도록 하고,
// 버퍼가 비었으면 찰 때까지 소비자가 계속 대기하도록 함.

// 근데 생산자3개, 소비자3개 스레드 상황에서 버퍼 크기가 2라고 해보자.(3보다 적은 수)
// 이 상황에, 생산3번->소비3번 순서로 실행되거나 소비3번->생산3번 순서로 실행되면 생각한 대로 동작하지 않을 수 있음..!
// 왜냐하면 put(), take()에 synchronized를 걸었기 때문에 생산자가 put()메서드를, 소비자가 take()메서드를 실행하려면
// BoundedQueueV2 인스턴스의 모니터락을 획득해야 함. 근데 버퍼가 2로 생산,소비스레드들 수보다 작다면,
// 1)생3->소3순서로 시도한 상황
// 생산 스레드가 3번 연달아 생산시도를 하면 마지막 생산스레드가 락을 획득한 채로(RUNNABLE) while문을 돌며 버퍼가 빌 때 까지 무한대기함.(while문안에 sleep에 걸리면 TIMED_WAITING상태로 무한대기함)
// 그다음으로 소비스레드가 소비를 하기 위해 락을 획득하려는데 락이 없음. 그러면 소비스레드도 BLOCKED로 무한대기함. 똑같이 소비스레드2,3도 BLOCKED로 무한대기.
// 2)소3->생3순서로 시도한 상황
// 첫 소비스레드부터 버퍼가 비었기 때문에 락을 쥔 상태로(RUNNABLE) 버퍼가 찰 때까지 무한대기함.
// 다음 소비스레드부터 모든 생산스레드까지 전부가 BLOCKED 상태가 됨.

// -> 이 문제는 기다리는 스레드가 락을 해제하지 않기 때문에 생긴다. 어떻게 락을 해제하고 기다리게 할까?
public class BoundedQueueV2 implements BoundedQueue {

    private final Queue<String> bufferQueue = new ArrayDeque<>();
    private final int max;

    public BoundedQueueV2(int max) {
        this.max = max;
    }

    @Override
    public synchronized void put(String data) {
        // 버퍼가 가득 찼으면 빌 때 까지 계속 대기함.
        while (bufferQueue.size() == max) {
            log("[put] 큐가 가득 참, 생산자 대기");
            sleep(1000);
        }
        // 버퍼에 자리가 있으면 바로 data 넣음.
        bufferQueue.offer(data);
    }

    @Override
    public synchronized String take() {
        // 버퍼가 비었으면 찰 때 까지 계속 대기함.
        while (bufferQueue.isEmpty()) {
            log("[take] 큐에 데이터가 없음, 소비자 대기");
            sleep(1000);
        }
        // 버퍼에 자리가 있으면 바로 data 빼냄
        return bufferQueue.poll();
    }

    @Override
    public String toString() {
        return bufferQueue.toString();
    }
}
