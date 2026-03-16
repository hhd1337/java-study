package mid1.lang.string.chaining;

public class MethodChainingMain1 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();

        adder.add(1);
        adder.add(2);
        adder.add(3);
        System.out.println("adder.getValue() = " + adder.getValue());

        // 메서드 체이닝 사용:
        // add() 메서드가 this(자기자신 참조값)를 반환하기 때문에 반환된 참조값을 이용해서 또 add()호출...
        int result = adder.add(1).add(2).add(3).getValue();
        System.out.println("result = " + result);
    }
}
