package mid1.exception.ex4.exception;

public class ConnectExceptionV4 extends NetworkClientExceptionV4 { // 연결 실패 시 발생하는 예외
    private final String address;

    public ConnectExceptionV4(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
