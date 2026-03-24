package mid1.exception.basic.unchecked;

public class Client {
    public void call() {
        throw new MyUncheckedException("ex"); // 굳이 throw 하지 않아도 언체크 예외는 알아서 나간다.
    }
}
