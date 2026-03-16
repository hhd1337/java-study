package mid1.lang.string.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("메서드 호출 비교1: " + isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교2: " + isSame(str3, str4));

    }

    // 인자로 new String(); 한 인스턴스가 넘어올지, 문자열 풀에 있는 인스턴스가 넘어올지, 모름.
    private static boolean isSame(String x, String y) {
        // return x == y;
        return x.equals(y); // 그래서 항상 동등성 비교, equals()를 사용하자!
    }
}
