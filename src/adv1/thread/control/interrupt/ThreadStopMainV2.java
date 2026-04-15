package adv1.thread.control.interrupt;

import static adv1.util.MyLogger.log;
import static adv1.util.ThreadUtils.sleep;

public class ThreadStopMainV2 {

    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread thread = new Thread(task, "work");
        thread.start();

        sleep(4000);
        log("작업 중단 지시: [thread.interrupt()] 방식");
        thread.interrupt();
        log("work 스레드 인터럽트 상태1 = " + thread.isInterrupted());
    }

    static class MyTask implements Runnable {

        @Override
        public void run() {
            try {
                while (true) {
                    log("작업중..");
                    // sleep중인데(TIMED_WAITING) main에서 인터럽트 걸음
                    // -> sleep()은 인터럽트에 반응하는 메서드이므로 즉시 InterruptedException발생
                    // -> 동시에 이 스레드가 RUNNABLE상태로 바뀌면서 깨어버림
                    Thread.sleep(3000);
                }
            } catch (InterruptedException e) {
                // 여기서는 InterruptedException 터지고, RUNNABLE상태로 바뀐 이후다.
                log("work 스레드 인터럽트 상태2 = " + Thread.currentThread().isInterrupted());
                log("interrupt message = " + e.getMessage());
                log("state = " + Thread.currentThread().getState());
            }

            log("자원 정리");
            log("자원 종료");
        }
    }
}
