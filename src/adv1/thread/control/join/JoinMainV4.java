package adv1.thread.control.join;

import static adv1.util.MyLogger.log;
import static adv1.util.ThreadUtils.sleep;

public class JoinMainV4 {

    public static void main(String[] args) throws InterruptedException {
        log("Start");

        SumTask task1 = new SumTask(1, 50);
        Thread thread1 = new Thread(task1, "thread-1");

        thread1.start();

        log("join(1000) - main 스레드가 thread1 종료를 1초까지만 대기");
        thread1.join(1000); //스레드가 종료될 때 까지 대기

        log("task1.result = " + task1.result);
        log("End");
    }

    static class SumTask implements Runnable {

        int startValue;
        int endValue;
        int result = 0;

        public SumTask(int startValue, int endValue) {
            this.startValue = startValue;
            this.endValue = endValue;
        }

        @Override
        public void run() {
            log("작업시작");
            sleep(2000);
            int sum = 0;
            for (int i = startValue; i <= endValue; i++) {
                sum += i;
            }
            result = sum;
            log("작업 완료. result = " + result);
        }
    }
}
