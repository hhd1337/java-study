package adv1.thread.control.interrupt;

import static adv1.util.MyLogger.log;
import static adv1.util.ThreadUtils.sleep;

public class ThreadStopMainV4 {

    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread thread = new Thread(task, "work");
        thread.start();

        sleep(100); //0.1초 뒤에 중단지시하도록, thread 실행시간 줄여놓음
        log("작업 중단 지시: [thread.interrupt()] 방식");
        thread.interrupt();
        log("work 스레드 인터럽트 상태1 = " + thread.isInterrupted());
    }

    static class MyTask implements Runnable {

        @Override
        public void run() {
            // 인터럽트상태==false이면 실행, true이면 인터럽트 상태 false로 바꿈
            while (!Thread.interrupted()) {
                log("작업중..");
            }

            // 여기서도 isInterrupted==true 인 상태임.
            log("work 스레드 인터럽트 상태2 = " + Thread.currentThread().isInterrupted());

            try {
                log("자원 정리");
                Thread.sleep(1000);
                log("자원 종료");
            } catch (InterruptedException e) {
                log("자원 정리 실패 - 자원 정리 중 인터럽트 발생");
                log("work 스레드 인터럽트 상태3 = " + Thread.currentThread().isInterrupted());
            }

            log("작업 종료");
        }
    }
}
