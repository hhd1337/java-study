package mid1.lang.string;

public class CharArrayMain {

    public static void main(String[] args) {
        char[] charArr = new char[]{'h', 'e', 'l', 'l', 'o'};
        // println() 에서 char[] 인자로 받으면 모든 원소 붙여서 출력하도록 오버로딩해놓음
        System.out.println(charArr);

        String str = "hello";
        System.out.println("str = " + str);
    }
}
