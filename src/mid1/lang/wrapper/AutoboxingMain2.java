package mid1.lang.wrapper;

public class AutoboxingMain2 {
    public static void main(String[] args) {
        // Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = value; // 오토 박싱 (Auto-boxing): 컴파일러가 개발자 대신 Integer.valueOf() 코드 추가해주는 기능

        // Wrapper -> Primitive
        int unboxedValue = boxedValue; // 오토 언박싱 (Auto-Unboxing): 컴파일러가 대신 .intValue() 코드를 추가해준다.

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);

    }
}
