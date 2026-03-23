package mid1.nested.local;

import java.lang.reflect.Field;

public class LocalOuterV2 {
    private int outInstanceVar = 3;

    public Printer process(int paramVar) {
        // 지역변수: process()가 호출되면서 스택프레임에 생성되었다가, 메서드가 종료되는 순간 스택프레임이 사라지면서 함께 제거된다.
        int localVar = 1;

        // 지역 클래스
        class LocalPrinter implements Printer { // 이렇게 interface 구현할 수 있다.
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        return new LocalPrinter();
    }

    public static void main(String[] args) {
        LocalOuterV2 localOuter = new LocalOuterV2();
        // 1. process() 메서드가 여기서 종료됨!
        // 근데 지역클래스 LocalPrinter를 반환받아 참조값을 변수에 할당해서, 해당 인스턴스 힙영역에 GC 안되고 잘 생겨있음.
        Printer printer = localOuter.process(2);

        // 2. localVar = 1 과 paramVar = 2이 잘 출력됨.
        // 왓!? process() 메서드가 종료되어 스택프레임이 제거된 시점인데,
        // LocalPrinter 외부(, process() 내부)의 지역변수 localVar, paramVar 값이 어떻게 출력이 된거지??
        // -> "지역변수 캡쳐" 때문! : 스택영역에서 접근한게 아니라, 우리눈엔 안보이지만 지역클래스안의 캡쳐된 변수에 접근한거다!
        printer.print();

        // 추가
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();

        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}
