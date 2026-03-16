package mid1.lang.string.method;

public class StringSearchMain {
    public static void main(String[] args) {
        String s = "Hello, Java! Welcome to Java world.";

        System.out.println("문자열에 'java'가 포함되어 있는지: " + s.contains("Java"));
        System.out.println("'Java'의 첫번째 인덱스: " + s.indexOf("Java")); // 인덱스 7번부터 "Java"가 나온다. 이말임.
        System.out.println("인덱스 10부터 'Java'의 인덱스: " + s.indexOf("Java", 10)); // 인덱스 10부터 Java가 처음 나오는 인덱스를 찾아라.

        System.out.println("'Java'의 마지막 인덱스: " + s.lastIndexOf("Java")); // 거꾸로부터 찾아서 인덱스 반환.
    }
}
