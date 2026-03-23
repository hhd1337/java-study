package mid1.nested.nested.ex1;

public class NetworkMessage { // Network객체 안에서만 사용 될 클래스
    private String content;

    public NetworkMessage(String content) {
        this.content = content;
    }

    public void print() {
        System.out.println(content);
    }
}
