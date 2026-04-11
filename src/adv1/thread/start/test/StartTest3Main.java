package adv1.thread.start.test;

import static adv1.util.MyLogger.log;

public class StartTest3Main {
    public static void main(String[] args) {
        // 익명 클래스: 선언과 생성을 동시에 한다.
        Runnable runnable = new Runnable() {
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
        };

        Thread thread = new Thread(runnable, "counter");// 이렇게 Runnable뒤에 두번째 인자로 스레드 이름을 넣어줄 수 있다.
        thread.start();
    }
}
