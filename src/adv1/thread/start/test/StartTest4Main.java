package adv1.thread.start.test;

import static adv1.util.MyLogger.log;

public class StartTest4Main {
    public static void main(String[] args) {
        Thread threadA = new Thread(new PrintWork(1000, "A"), "Thread-B");
        Thread threadB = new Thread(new PrintWork(500, "B"), "Thread-A");

        threadA.start();
        threadB.start();
    }

    static class PrintWork implements Runnable {
        private int loopMs;
        private String printStr;

        public PrintWork(int loopMs, String printStr) {
            this.loopMs = loopMs;
            this.printStr = printStr;
        }

        @Override
        public void run() {
            while (true) {
                log(printStr);
                try {
                    Thread.sleep(loopMs);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
