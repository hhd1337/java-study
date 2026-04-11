package adv1.thread.start.test;

import static adv1.util.MyLogger.log;

public class StartTest2Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new CounterRunnable(), "counter");// 이렇게 Runnable뒤에 두번째 인자로 스레드 이름을 넣어줄 수 있다.
        thread.start();
    }

    static class CounterRunnable implements Runnable {

        @Override
        public void run() {

            for (int i = 1; i <= 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                log("value: " + i);
            }
        }
    }
}
