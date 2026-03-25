package mid1.exception.ex2;

public class NetworkServiceV2_5 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        // [finally 블록] : 정상흐름, 예외 흐름, 마무리흐름에서, 마무리흐름 블록이다.
        // try를 시작하기만 하면 finally 블록은 반드시 실행된다.
        // 심지어 catch로 잡을 수 없는 예외가 발생해도 finally 블록은 반드시 실행된다.
        try { // 정상 흐름
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) { // 예외 흐름
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        } finally { // 마무리 흐름
            client.disconnect();
        }

    }
}
