package mid1.lang.string.test;

public class TestString1 {
    public static void main(String[] args) {
        // 문제1
        String url = "https://www.example.com";
        System.out.println(url.startsWith("https://"));

        // 문제2
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        int sum = 0;
        for (String s : arr) {
            int len = s.length();
            System.out.println(s + ": " + len);
            sum += len;
        }
        System.out.println("sum = " + sum);

        // 문제3
        String str = "hello.txt";
        System.out.println("index = " + str.indexOf(".txt"));

        // 문제4
        System.out.println("filename = " + str.substring(0, 5));
        System.out.println("extName = " + str.substring(5));

        // 문제5
        String ext = ".txt";
        int extIndex = str.indexOf(ext);
        System.out.println("filename = " + str.substring(0, extIndex));
        System.out.println("extName = " + str.substring(extIndex));

        // 문제6
        str = "start hello java, hello spring, hello jpa";
        String key = "hello";
        int count = 0;
        int index = str.indexOf(key);

        while (index >= 0) {
            index = str.indexOf(key, index + 1); // indexOf 는 찾는 문자열이 없으면 -1을 반환한다!!
            count++;
        }

        // 문제7
        String original = "    Hello Java   ";
        System.out.println(original.strip()); // trim(); 도 됨.

        // 문제8
        String input = "hello java spring jpa java";
        System.out.println(input.replace("java", "jvm"));

        // 문제9
        String email = "hello@example.com";
        String[] splitted = email.split("@");
        System.out.println("ID: " + splitted[0]);
        System.out.println("Domain: " + splitted[1]);

        // 문제10
        String fruits = "apple,banana,mango";
        String[] parts = fruits.split(",");
        for (String part : parts) {
            System.out.println(part);
        }
        String joinedString = String.join("->", parts);
        System.out.println("joinedString = " + joinedString);

        // 문제11
        str = "Hello Java";
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse().toString());
    }
}