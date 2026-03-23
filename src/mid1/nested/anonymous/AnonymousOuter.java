package mid1.nested.anonymous;

import java.lang.reflect.Field;
import mid1.nested.local.Printer;

public class AnonymousOuter {

    private int outInstanceVar = 3;

    public Printer process(int paramVar) {
        int localVar = 1;

        // 익명클래스
        Printer printer = new Printer() {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value=" + value);
                System.out.println("localVar=" + localVar);
                System.out.println("paramVar=" + paramVar);
                System.out.println("outInstanceVar=" + outInstanceVar);
            }
        };

        // printer.print();
        return printer;
    }

    public static void main(String[] args) {
        AnonymousOuter outer = new AnonymousOuter();
        Printer printer = outer.process(2);

        printer.print();

        //추가
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}
