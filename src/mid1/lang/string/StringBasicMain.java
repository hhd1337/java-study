package mid1.lang.string;

public class StringBasicMain {

    public static void main(String[] args) {
        // 원래 str1에는 참조값이 들어가는데 리터럴을 넣는게 되게 어색하다.
        // 근데 자바가 내부적으로 str1에 객체 참조값을 넣어준다.
        // (컴파일타임에는 "hello" 리터럴이 클래스 파일의 상수풀에 기록된다.
        // 이후 클래스 로딩/실행시점에 JVM은 이 리터럴에 대응하는 문자열객체를
        // 문자열 풀에서 재사용하거나 새로 생성하여 관리한다.)
        String str1 = "hello";
        String str2 = new String("hello");

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
