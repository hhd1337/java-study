package adv1.thread.start;

import static adv1.util.MyLogger.log;

public class InnerRunnableMainV1 {
    public static void main(String[] args) {
        log("main() start");

        Thread thread = new Thread(new InnerRunnable());
        thread.start();

        log("main() end");

    }

    static class InnerRunnable implements Runnable {

        @Override
        public void run() {
            log("run()");
        }
    }
}
