package mid2.generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);

        // 타입 인자(Type Argument) 명시적 전달
        //제네릭 메서드는 호출할 때 메서드 내부에서 사용할 타입을 정해줘야 한다.
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i); // "Integer타입 genericMethod()"라고 구조를 눈에 익히자.
        Integer integerValue = GenericMethod.<Integer>numberMethod(10);// "Integer타입 numberMethod()"
        Double doubleValue = GenericMethod.<Double>numberMethod(10.3); //"Double타입 numberMethod()"

        //제네릭 메서드 타입 추론: 메서드 매개변수의 타입을 보고 추론한다!!
        System.out.println("타입 추론");
        Integer result1 = GenericMethod.genericMethod(i); // i=10을 보고 아, Integer 타입이구나. 추론
        Integer integerValue1 = GenericMethod.numberMethod(10);// 10을 보고 아, Integer 타입이구나. 추론
        Double doubleValue1 = GenericMethod.numberMethod(10.3); // 10.3을 보고 아, Double 타입이구나. 추론
    }
}
