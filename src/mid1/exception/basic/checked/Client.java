package mid1.exception.basic.checked;

public class Client {

    public void call() throws MyCheckedException { // throws: 나 해결 못해. 하고 밖으로 던지는 것.
        //문제 상황
        throw new MyCheckedException("ex"); // throw: 실제 예외를 터뜨리는것
    }

}
