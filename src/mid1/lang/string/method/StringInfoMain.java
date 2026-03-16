package mid1.lang.string.method;

public class StringInfoMain {
    public static void main(String[] args) {
        String s = "Hello, Java!";
        System.out.println("문자열의 길이: " + s.length());
        System.out.println("문자열이 비어있는지: " + s.isEmpty());
        System.out.println("문자열이 비어있거나 공백인지1: " + s.isBlank());
        System.out.println("문자열이 비어있거나 공백인지2: " + "    ".isBlank());

        System.out.println("7번인덱스의 문자 = " + s.charAt(7));
 
    }
}
