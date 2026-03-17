package mid1.lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        // Integer(int)는 앞으로 제거될 문법이다. 대신에 Integer.valueOf()를 사용해라.
        Integer newInteger = new Integer(10);

        //-128 ~ 127범위의 자주 사용하는 Integer 객체를 미리 만들어놓고, 재사용한다.
        Integer integerObj = Integer.valueOf(10);
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);

        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("비교");
        // new 로 생성한 객체, Integer 캐시(배열)에 있는 미리만들어둔 객체 참조값 당연히 다름.
        System.out.println("==: " + (newInteger == integerObj));
        System.out.println("equals(): " + newInteger.equals(integerObj));

    }
}
