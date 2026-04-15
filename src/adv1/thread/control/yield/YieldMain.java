package adv1.thread.control.yield;

public class YieldMain {

    static final int THREAD_COUNT = 1000;

    public static void main(String[] args) {
        //1000개의 스레드를 만들어서 각 스레드를 실행시킴.
        // 각 스레드는 0부터 9까지 출력을 할것임.
        for (int i = 0; i < THREAD_COUNT; i++) {
            Thread thread = new Thread(new MyRunnable());
            thread.start();
        }
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " - " + i);
                // 1. empty
                // sleep(1); // 2. sleep
                Thread.yield(); // 3. yield
            }
        }
    }
}
