package adv1.thread.control;

import static adv1.util.MyLogger.log;

import adv1.thread.start.HelloRunnable;

public class ThreadInfoMain {
    public static void main(String[] args) {
        // main 스레드
        Thread mainThread = Thread.currentThread();
        // 스레드객체 자체를 출력
        log("mainThread = " + mainThread);
        // 스레드의 고유 ID. JVM이 스레드 식별하는 값임. 자바가 임의로 만들어주는 값.
        // 스레드 ID는 중복될 수 없지만, 스레드 이름은 중복될 수 있다!!
        log("mainThread.threadId() = " + mainThread.threadId());
        // 스레드 이름출력. 스레드 이름은 스레드 생성 시 두번째 인자로 넣어줄 수 있다. 이름은 스레드끼리 중복 가능하다.
        log("mainThread.getName() = " + mainThread.getName());
        // 스레드 우선순위. 기본이 5이다.
        // "운영체제야. 이 스레드 좀 중요하니까 좀더 자주 실행하자. 시분할을 한다면 좀더 많이 할당해줘" 라고 하는것.
        // 하지만 운영체제가 잘 최적화해서 알아서 스케줄링을 하기 때문에, 자바 애플리케이션을 만들면서 스레드의 우선순위를 조정할 일은 거의 없다.
        log("mainThread.getPriority() = " + mainThread.getPriority());
        //
        log("mainThread.getThreadGroup() = " + mainThread.getThreadGroup());
        // RUNNABLE 출력됨: 스레드가 실행될 수 있는 상태구나. 라고 생각하면됨.
        log("mainThread.getState() = " + mainThread.getState());

        Thread myThread = new Thread(new HelloRunnable(), "myThread");
        log("myThread = " + myThread);
        log("myThread.threadId() = " + myThread.threadId());
        log("myThread.getName() = " + myThread.getName());
        log("myThread.getPriority() = " + myThread.getPriority());
        log("myThread.getThreadGroup() = " + myThread.getThreadGroup());
        // NEW 출력됨: 스레드가 생성하고 실행을 안했음. -> NEW
        log("myThread.getState() = " + myThread.getState());


    }
}
