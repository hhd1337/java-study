package basic.static1;

public class Data1 {
    public String name;
    public int count; // 객체가 지금까지 몇개나 생성되었는지 누적된 값

    public Data1(String name) {
        this.name = name;
        count++;
    }
}
