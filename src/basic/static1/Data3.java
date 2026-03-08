package basic.static1;

public class Data3 {
    public String name;
    public static int count; // static -> 여러 인스턴스들에서 공용을 쓰겠다.

    public Data3(String name) {
        this.name = name;
        count++; // 원래는 Data3.count++; 라고 해야 하는데, 자신의 클래스에 있는 정적 변수라면, 클래스명을 생략할 수 있다.
    }
}
