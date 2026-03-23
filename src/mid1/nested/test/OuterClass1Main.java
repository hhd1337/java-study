package mid1.nested.test;

public class OuterClass1Main {
    public static void main(String[] args) {
        OuterClass1.NestedClass nestedClass = new OuterClass1.NestedClass(); // 자바 내부적으로는 클래스명이 OuterClass1$NestedClass이다.
        // System.out.println(nestedClass.getClass().getName());
        nestedClass.hello();
    }
}
