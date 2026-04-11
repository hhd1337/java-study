package adv1.thread.start;

public class DaemonThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true);
        daemonThread.start();

        System.out.println(Thread.currentThread().getName() + ": main() end");
    }

    static class DaemonThread extends Thread {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ": run() start");

            try {
                Thread.sleep(10000); // 10초간 로직이 실행됨
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            // 데몬스레드는 JVM이 쌩까고 종료해버린다.
            // 그래서 그냥 종료되어도 상관없는, 이후에 프로그램이 재시작될때 다시 실행되어도 괜찮은 스레드를 데몬스레드로 지정해야 한다.
            // 예: 1초마다 캐시청소/5초마다 상태 모니터링/계속 대기하면서 로그 큐 감시 등등.
            // 이걸 JVM이 전부 기다려버리면 프로그램이 그냥 영원히 안끝나는거다.
            // 그래서 JVM은 이렇게 정한거다: user스레드 다 끝났으면 프로그램 끝. 보조작업(daemon스레드)은 거기서 같이 종료한다.
            System.out.println(Thread.currentThread().getName() + ": run() end");
        }
    }
}
