package mid1.lang.string.immutable;

public class StringImmutable1 {
    public static void main(String[] args) {
        String str = "hello";
        str.concat(" java");

        System.out.println(str); // hello 출력됨. String 객체는 불변객체이기 때문에.
    }
}
