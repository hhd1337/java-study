package adv1.thread.start;

import static adv1.util.MyLogger.log;

public class ManyThreadMainV2 {
    public static void main(String[] args) {
        log("main() start");

        // Runnable 구현체의 run()을 실행하는 스레드 100개 배열 만듦.
        HelloRunnable runnable = new HelloRunnable();

        // 스레드 100개 다 실행
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(runnable);
            thread.start();
        }

        log("main() end");
    }
}
