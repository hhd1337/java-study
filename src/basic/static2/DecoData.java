package basic.static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    // static 메서드에서는 static 요소(변수,메서드)만 접근할 수 있다. 객체 참조값을 모르므로.
    public static void staticCall() {
        //instanceValue++; // 인스턴스 변수 접근 불가
        //instanceMethod(); // 인스턴스메서드 접근불가

        staticValue++; //정적변수 접근가능
        staticMethod(); // 정적 메소드 접근가능.
    }

    // 정적 메소드인데, 인자로 인스턴스 참조값을 받는 경우: 해당 인스턴스변수, 메서드를 사용할 수 있다. 당연.
    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();
    }

    // 인스턴스 메소드에서는 당연히 인스턴스 요소들에 접근 가능하고, 정적 요소들에도 접근할 수 있다.
    public void instanceCall() {
        instanceValue++; // 인스턴스변수 접근 가능
        instanceMethod(); // 인스턴스메서드 접근 가능

        staticValue++; //정적변수도 접근가능
        staticMethod(); // 정적 메소드도 접근가능. -> 정적 요소들은 아무데서나 호출되고 접근할 수 있다.
    }

    private void instanceMethod() {
        System.out.println("인스턴스 변수 값 = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("정적변수 값 = " + staticValue);
    }
}
