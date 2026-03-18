package mid1.lang.system;

import java.util.Arrays;
import java.util.Map;

public class SystemMain {
    public static void main(String[] args) {
        // System.currentTimeMillis() : 현재 시간(밀리초)를 가져온다.
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        // System.nanoTime() : 현재 시간(나노초)를 가져온다. (1 나노초 = 10억분의 1초)
        long currentTimeNano = System.nanoTime();
        long currentTimeNano2 = System.nanoTime();
        System.out.println("currentTimeNano = " + (currentTimeNano2 - currentTimeNano));

        // System.getenv() : 시스템의 환경변수를 읽는다. -> 운영체제가 사용하는 시스템 환경설정.
        Map<String, String> getEnv = System.getenv();
        System.out.println("getEnv = " + getEnv);

        // System.getProperties() : 시스템 속성을 읽는다. -> 자바가 사용하는 시스템 환경설정(속성)
        System.out.println("properties = " + System.getProperties());
        System.out.println("Java version: " + System.getProperty("java.version"));

        // 배열을 고속으로 복사 (for문 보다 빠르다. 2배이상은 될거같음. 하지만 많이쓰지는 않음.)
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        // 배열 출력
        System.out.println("copiedArray = " + copiedArray); // 배열의 참조값 나옴.
        System.out.println("copiedArray = " + Arrays.toString(copiedArray)); // Arrays.toString() 사용하여 출력.


    }
}
