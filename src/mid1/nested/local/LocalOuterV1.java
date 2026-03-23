package mid1.nested.local;

public class LocalOuterV1 {
    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;

        // 지역 클래스
        class LocalPrinter {
            int value = 0;

            public void printData() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar); // 지역클래스가 선언된 스코프(코드블럭)의 지역변수에 접근 가능하다.
                System.out.println("paramVar = " + paramVar); // 매개변수도 지역변수다. 따라서 접근 가능하다.
                System.out.println("outInstanceVar = " + outInstanceVar); // 지역클래스도 내부클래스다. 외부 클래스의 참조를 가진다..
            }
        }

        LocalPrinter localPrinter = new LocalPrinter();
        localPrinter.printData();

    }

    public static void main(String[] args) {
        LocalOuterV1 localOuterV1 = new LocalOuterV1();
        localOuterV1.process(2);
    }
}
