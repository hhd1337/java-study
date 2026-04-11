package adv1.thread.start;

import static adv1.util.MyLogger.log;

public class InnerRunnableMainV2 {
    public static void main(String[] args) {
        log("main() start");

        // 익명 클래스: 선언과 객체생성 원큐에 함.
        // 특정 메서드 안에서만 간단히 Runnable객체를 정의하고, 사용하고 싶다면 익명클래스를 사용하면 된다.
        Runnable ananymousRunnable = new Runnable() {
            @Override
            public void run() {
                log("run()");
            }
        };

        Thread thread = new Thread(ananymousRunnable);
        thread.start();

        log("main() end");

    }
}
