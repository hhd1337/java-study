package adv1.thread.start;

import static adv1.util.MyLogger.log;

public class InnerRunnableMainV4 {
    public static void main(String[] args) {
        log("main() start");

        // 이후 고급3에서 람다를 배우면 이해할 수 있다. 
        // 어쨌든 코드가 매우매우 간결해진다.
        // -> Runnable 방식 스레드 생성의 단점인 '코드가 약간 복잡해질 수 있다'는 점을 어느정도 해결할 수 있게 되었다.
        Thread thread = new Thread(() -> log("run()"));

        thread.start();

        log("main() end");
    }
}
