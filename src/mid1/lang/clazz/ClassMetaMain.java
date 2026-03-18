package mid1.lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    public static void main(String[] args) throws ClassNotFoundException {
        // 1) Class 조회 (3가지 방법)
        Class clazz = String.class; // 1. 클래스에서 조회
        // Class clazz = new String().getClass(); // 2. 인스턴스에서 조회
        // Class clazz = Class.forName("java.lang.String"); // 3. 문자열로 조회

        // 2) 클래스의 모든 필드 출력
        Field[] fields = clazz.getDeclaredFields(); // 클래스의 모든 필드를 조회
        for (Field field : fields) {
            System.out.println("field = " + field);
            System.out.println("field = " + field.getType() + " " + field.getName());
        }

        // 3) 클래스의 모든 메서드 출력
        Method[] methods = clazz.getDeclaredMethods(); // 클래스의 모든 메서드 조회
        for (Method method : methods) {
            System.out.println("method = " + method);
        }

        // 4) 상위 클래스 정보 출력
        System.out.println("Superclass: " + clazz.getSuperclass().getName()); // 클래스의 부모 클래스 조회

        // 5) 인터페이스 정보 출력
        Class[] interfaces = clazz.getInterfaces(); // 클래스의 인터페이스들을 조회
        for (Class i : interfaces) {
            System.out.println("Interfaces: " + i.getName());
        }
        
    }
}
