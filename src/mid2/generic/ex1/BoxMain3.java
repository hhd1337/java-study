package mid2.generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {

        GenericBox<Integer> integerBox = new GenericBox<Integer>(); //생성 시점에 T의 타입 결정: 클래스 내부에 T들이 싹 Integer로 바뀐다!
        integerBox.set(10);
        // integerBox.set("문자100"); // Integer 타입만 허용, 컴파일 오류
        Integer integer = integerBox.get(); // Integer 타입 반환(캐스팅할 필요 없음! get()의 반환타입도 T에서 Integer로 바꼈으니!)
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("hello");
        System.out.println("stringBox.get() = " + stringBox.get());

        // 원하는 모든 타입 사용가능!
        GenericBox<Double> doubleBox = new GenericBox<Double>();
        doubleBox.set(2.3);
        System.out.println("doubleBox.get() = " + doubleBox.get());

        //타입 추론: 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerGenericBox = new GenericBox<>();
    }
}
