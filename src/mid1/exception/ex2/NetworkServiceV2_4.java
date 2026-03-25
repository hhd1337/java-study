package mid1.exception.ex2;

public class NetworkServiceV2_4 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        }

        // connect()나 send() 호출 시 NetworkClientExceptionV2와 상관없는 다른 예외가 터진다면?
        // 특히 connect()나 send() 안에 언체크예외가 있는데 컴파일러가 못잡아서 개발자도 실수로 잡는 것을 잊어버렸다면?
        // 런타임에 발생한 언체크 예외를 catch(NetworkClientExceptionV2 e){..}가 못잡게 되고,
        // 그자리에서 바로 상위 호출자로 예외가 던져진다.
        // 그러면 아래 disconnect로 연결해제하는 코드는 절대 실행 안된다...! 항상, 확실하게 연결해제를 보장하는 방법이 없을까?
        client.disconnect();
    }
}
