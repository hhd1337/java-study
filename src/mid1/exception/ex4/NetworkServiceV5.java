package mid1.exception.ex4;

public class NetworkServiceV5 {

    public void sendMessage(String data) {
        String address = "http://example.com";

        // try 괄호안에 사용할 자원을 명시하면, try 블록이 끝나면 자동으로 AutoCloseable.close()를 호출해서 자원을 해제한다.
        try (NetworkClientV5 client = new NetworkClientV5(address)) {
            client.initError(data);
            client.connect();
            client.send(data);
        } catch (Exception e) {
            System.out.println("[예외 확인]: " + e.getMessage());
            throw e;
        }

    }
}
