package adv1.thread.sync.lock;

import static adv1.util.MyLogger.log;
import static adv1.util.ThreadUtils.sleep;

import java.util.concurrent.locks.LockSupport;

public class LockSupportMainV1 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ParkTest(), "Thread-1");
        thread1.start();

        //잠시 대기하여 Thread-1이 park 상태에 빠질 시간을 준다.
        sleep(1000);
        log("Thread-1 state: " + thread1.getState());

        // log("main스레드에서 unpark(Thread-1) 함");
        // LockSupport.unpark(thread1); // 1. unpark 사용해서 깨움

        thread1.interrupt(); // 2. interrupt() 사용해서 깨움
    }

    static class ParkTest implements Runnable {
        @Override
        public void run() {
            log("뭘 좀 하다가");

            log("park 시작");
            LockSupport.park();
            log("park 종료, state: " + Thread.currentThread().getState());

            log("인터럽트 상태: " + Thread.currentThread().isInterrupted());
        }
    }
}
