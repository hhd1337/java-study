package mid1.nested.test;

public class AnonymousMain {
    public static void main(String[] args) {
        // 익명 클래스: 클래스 선언과 생성 원큐에.
        Hello hello = new Hello() {
            @Override
            public void hello() {
                System.out.println("Hello.hello");
            }
        };

        hello.hello();
    }
}
