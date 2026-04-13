package adv1.thread.control;

public class CheckedExceptionMain {
    public static void main(String[] args) throws Exception {
        throw new Exception();
    }

    static class CheckedRunnable implements Runnable {

        // 주석 풀면 예외 발생:
        // Runnable에 체크예외 던지도록 정의되어있지 않으므로 자식인 CheckedRunnable도 체크예외 아무것도 못던진다!!
        @Override
        public void run() /* throws Exception */ {
            // throw new Exception();
        }
    }
}
