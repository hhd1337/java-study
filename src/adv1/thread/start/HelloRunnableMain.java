package adv1.thread.start;

public class HelloRunnableMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");

        HelloRunnable runnable = new HelloRunnable();// Runnable 구현체 생성: 스레드들이 실행할 작업.
        Thread thread = new Thread(runnable); // 스레드 생성할 때 Runnable 구현체(작업) 넣어줌
        thread.start(); //스레드 시작

        System.out.println(Thread.currentThread().getName() + ": main() end");
    }
}
