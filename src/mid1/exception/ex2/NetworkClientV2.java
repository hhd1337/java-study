package mid1.exception.ex2;

public class NetworkClientV2 {
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV2(String address) {
        this.address = address;
    }

    public void connect() throws NetworkClientExceptionV2 {
        if (connectError) {
            String message = address + " 서버 연결 실패";
            throw new NetworkClientExceptionV2(message, "connectError");
        }
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) throws NetworkClientExceptionV2 {
        if (sendError) {
            String message = address + " 서버에 데이터 전송 실패: " + data;
            throw new NetworkClientExceptionV2(message, "sendError");
            // 중간에 다른 예외가 발생했다고 가정
            // throw new RuntimeException("ex");
        }
        System.out.println(address + " 서버에 데이터 전송: " + data);
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }
}
