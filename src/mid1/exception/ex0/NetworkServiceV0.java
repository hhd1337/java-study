package mid1.exception.ex0;


public class NetworkServiceV0 { // 복잡한 NetworkClient 사용 로직을 처리.

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV0 client = new NetworkClientV0(address);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
