package adv1.thread.bounded;

import static adv1.util.MyLogger.log;

// 생산자
public class ProducerTask implements Runnable {

    private BoundedQueue queue;
    private String requestData;

    public ProducerTask(BoundedQueue queue, String requestData) {
        this.queue = queue;
        this.requestData = requestData;
    }

    @Override
    public void run() {
        log("[생산 시도] " + requestData + " -> " + queue);
        queue.put(requestData); // 버퍼에 request data 넣어줌.
        log("[생산 완료] " + requestData + " -> " + queue);
    }
}
