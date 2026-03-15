package mid1.lang.immutable.change;

public class ImmutableMain1 {
    public static void main(String[] args) {
        ImmutableObj o1 = new ImmutableObj(10);
        ImmutableObj o2 = o1.add(20);

        //계산이후에도 기존값과 신규값 모두 확인 가능. 서로 참조값이 다름.
        System.out.println("o1.getValue() = " + o1.getValue());
        System.out.println("o2.getValue() = " + o2.getValue());
    }
}
