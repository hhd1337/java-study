package mid1.lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("new String() == 비교: " + (str1 == str2)); // 동일한 인스턴스는 아님.
        // String.equals()는 문자열 값으로 비교하도록 오버라이딩 해놓음.
        System.out.println("new String() equals 비교: " + (str1.equals(str2)));

        String str3 = "hello";
        String str4 = "hello";
        // 문자열 리터럴 값이 같다면, 자바가 실행되는 시점에 문자열 풀에서 해당 문자열 인스턴스를 하나만 만들고 공유하도록 되어있다.
        // (메모리 효율성과 성능 최적화를 위함이다.)
        System.out.println("리터럴 == 비교: " + (str3 == str4));
        System.out.println("리터럴 equals 비교: " + (str3.equals(str4)));

    }
}
