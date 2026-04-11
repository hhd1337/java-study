package adv1.thread.start;

public class BadThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");

        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName() + ": start() 호출 전");
        // run() 직접 실행: 메인스레드가 run()을 실행한다. 결과적으로 스레드 병렬작업이 일어나지 않음
        // 그냥 지금까지 일반 메서드들을 전부 이렇게 객체의 public 메서드를 사용하는 식으로 사용했었다!!
        // 그런데, run()을 별도의 다른 스레드가 실행 하도록 하려면 Thread.start() 라고 해야한다.
        helloThread.run();
        System.out.println(Thread.currentThread().getName() + ": start() 호출 후");

        System.out.println(Thread.currentThread().getName() + ": main() end");
    }
}
