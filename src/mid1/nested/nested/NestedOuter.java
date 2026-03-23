package mid1.nested.nested;

public class NestedOuter {
    // static은 메서드영역에, 인스턴스는 힙영역에 생긴다.
    // static은 인스턴스변수에 인스턴스 참조를 모르 접근할 수 없다.
    private static int outClassValue = 3;
    private int outInstanceValue = 3;

    static class Nested {
        private int nestedInstanceValue = 1;

        public void print() {
            // 자신의 멤버에 접근
            System.out.println(nestedInstanceValue);

            // 바깥 클래스의 인스턴스 멤버에는 바로 접근할 수 없다. (참조가 없으므로)
            // System.out.println(outInstanceValue);

            // 바깥 클래스의 클래스 변수에는 접근할 수 있다.
            System.out.println(outClassValue); // 외부에서 접근 할 때는 NestedOuter.outClassValue 라고 해야 하는데 자바가 문법 편의 제공한다.
        }
    }

}
