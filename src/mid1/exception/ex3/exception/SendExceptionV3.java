package mid1.exception.ex3.exception;

public class SendExceptionV3 extends NetworkClientExceptionV3 { // 전송 실패 시 발생하는 예외
    private final String sendData;

    public SendExceptionV3(String sendData, String message) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }
}
