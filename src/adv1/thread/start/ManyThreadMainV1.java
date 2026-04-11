package adv1.thread.start;

import static adv1.util.MyLogger.log;

public class ManyThreadMainV1 {
    public static void main(String[] args) {
        log("main() start");

        HelloRunnable runnable = new HelloRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        Thread thread1 = new Thread(runnable);
        thread1.start();
        Thread thread2 = new Thread(runnable);
        thread2.start();

        log("main() end");
    }
}
