package mid2.generic.ex4;

public class GenericMethod {
    public static Object objMethod(Object obj) {
        System.out.println("Object print: " + obj);
        return obj;
    }

    // <T> 로도 (타입) 매개변수 받고 (T t)로도 매개변수 받는거임!!
    public static <T> T genericMethod(T t) {
        System.out.println("Object print: " + t);
        return t;
    }

    public static <T extends Number> T numberMethod(T t) {
        System.out.println("bound print: " + t);
        return t;
    }
}
