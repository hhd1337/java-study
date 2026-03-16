package mid1.lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String s1 = "Hello, Java!";
        String s2 = "hello, java!";
        String s3 = "Hello, World!";

        System.out.println("s1 equals s2: " + s1.equals(s2));
        System.out.println("s1 equalsIgnoreCase s2: " + s1.equalsIgnoreCase(s2));

        System.out.println("'a' compareTo 'b': " + "a".compareTo("b")); // b 기준 a 인덱스는 몇번째 있나?
        System.out.println("'b' compareTo 'a': " + "b".compareTo("a"));
        System.out.println("'c' compareTo 'a': " + "b".compareTo("a"));

        System.out.println("s1 compareTo s3: " + s1.compareTo(s3));
        System.out.println("s1 compareTo s2: " + s1.compareTo(s2));

        System.out.println("s1 compareToIgnoreCase s2: " + s1.compareToIgnoreCase(s2));

        System.out.println("s1 startsWith 'Hello': " + s1.startsWith("Hello"));
        System.out.println("s1 endsWith 'Java!': " + s1.endsWith("Java!"));


    }
}
