package mid1.lang.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        // valueOf 메서드
        String numString = String.valueOf(num); // "100"
        System.out.println("숫자의 문자열 값: " + numString);

        String boolString = String.valueOf(bool); // "true"
        System.out.println("불리언의 문자열 값 = " + boolString);

        String objString = String.valueOf(obj);
        System.out.println("objString = " + objString);

        // 자바에서는 문자 + 뭐 는 문자열, "문자뭐"가 된다.
        String numString2 = "" + num;
        System.out.println("빈문자열 + num: " + numString2);

        // toCharArray() 메서드
        char[] strCharArray = str.toCharArray();
        System.out.println("문자열을 문자 배열로 전환: " + strCharArray.toString());

        for (char c : strCharArray) {
            System.out.print(c);
        }
        System.out.println();

    }
}
