package adv1.thread.sync.test;

import static adv1.util.MyLogger.log;

public class SyncTest2Main {
    public static void main(String[] args) throws InterruptedException {
        MyCounter myCounter = new MyCounter();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                myCounter.count();
            }
        };

        // 두 스레드는 같은 task를 실행하고, 그 task는 같은 MyCounter 인스턴스의 count()를 호출한다.
        // 하지만, count()는 힙에 있는 공유 필드의 값을 변경시키거나 하는 것이 아니라, 메서드 내부 지역변수의 값만 변경시킨다.
        // 지역 변수는 메서드 호출 시 각 스레드의 스택 프레임 안에 생성되므로, 스레드마다 서로 완전히 별도로 관리된다.
        // 즉 Thread-1의 스택프레임과 Thread-2의 스택프레임은 완전히 분리되어있고, 각각 자기 스택프레임 안의 localValue값을 증가시키는 것.
        // 따라서 이 경우에는 공유자원 경쟁이 없으므로 동시성 문제나 메모리 가시성 문제가 발생하지 않는다.
        Thread thread1 = new Thread(task, "Thread-1");
        Thread thread2 = new Thread(task, "Thread-2");

        thread1.start();
        thread2.start();
    }

    static class MyCounter {

        public void count() {
            int localValue = 0;

            for (int i = 0; i < 1000; i++) {
                localValue = localValue + 1;
            }
            log("결과: " + localValue);
        }
    }
}
