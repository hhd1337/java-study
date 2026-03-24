package mid1.exception.basic.checked;

/**
 * Exception을 상속받은 예외는 체크 예외가 된다.
 */
public class MyCheckedException extends Exception {

    public MyCheckedException(String message) {
        super(message); // 부모클래스인 Exception의 생성자 호출
    }

}
