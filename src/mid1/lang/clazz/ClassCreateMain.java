package mid1.lang.clazz;

import java.lang.reflect.InvocationTargetException;

public class ClassCreateMain {
    public static void main(String[] args)
            throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class helloClass = Hello.class; // Hello 클래스의 설명서 객체(Class 객체)를 변수에 저장
        // Class helloClass = Class.forName("mid1.lang.clazz.Hello");

        // Hello의 Class 클래스인 Hello.class 만으로 객체 생성하기
        // (Hello 클래스가 가진 생성자를 얻어서, 객체를 생성한다고 보면 됨.)
        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();

        String result = hello.hello();
        System.out.println("result = " + result);
    }
}
