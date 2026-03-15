package mid1.lang.immutable.change;

public class ImmutableMain2 {
    public static void main(String[] args) {
        ImmutableObj o1 = new ImmutableObj(10);
        o1.add(20); // add()의 리턴값인 새 ImmutableObj를 안쓰고 버림. -> o1은 불변객체라 원래 아무런 영향 없음.

        System.out.println("o1.getValue() = " + o1.getValue());
    }
}
