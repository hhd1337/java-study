package mid1.nested.nested;

public class NestedOuterMain {
    public static void main(String[] args) {
        NestedOuter outer = new NestedOuter();
        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();

        // 중첩 클래스는 런타임에 보통 Outer$Inner 형태의 클래스 이름으로 출력된다.
        // nestedClass = class mid1.nested.nested.NestedOuter$Nested 출력됨
        System.out.println("nestedClass = " + nested.getClass());
    }
}
