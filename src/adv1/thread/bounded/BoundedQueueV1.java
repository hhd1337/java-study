package adv1.thread.bounded;

import static adv1.util.MyLogger.log;

import java.util.ArrayDeque;
import java.util.Queue;

// 한정된 버퍼 구현체 1
public class BoundedQueueV1 implements BoundedQueue {

    private final Queue<String> queue = new ArrayDeque<>();
    private final int max;

    public BoundedQueueV1(int max) {
        this.max = max;
    }

    @Override
    public synchronized void put(String data) {
        if (queue.size() == max) {
            log("[put] 큐가 가득 참, 데이터 못 넣고 버림: " + data);
            return;
        }
        queue.offer(data);
    }

    @Override
    public synchronized String take() {
        if (queue.isEmpty()) {
            log("[take] 큐가 비었음. 꺼낼 데이터 없음.");
            return null;
        }
        return queue.poll();
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
