package adv1.thread.start;

import static adv1.util.MyLogger.log;

public class InnerRunnableMainV3 {
    public static void main(String[] args) {
        log("main() start");

        // 익명 클래스인데, 객체를 생성해서 변수에 받지 않고,
        // 변수 인라인화를 해서 익명클래스 객체 생성하자마자 그냥 바로 넘김.
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                log("run()");
            }
        });

        thread.start();

        log("main() end");

    }
}
