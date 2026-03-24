package mid1.exception.ex1;

public class NetworkServiceV1_1 { // 복잡한 NetworkClient 사용 로직을 처리.

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
