package mid1.lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String s = "Apple,Banana,Orange";

        // split()
        String[] splitStr = s.split(",");
        for (String ss : splitStr) {
            System.out.println(ss);
        }

        String joinStr = "";
        for (String string : splitStr) {
            joinStr += string + "-";
        }
        System.out.println("joinStr = " + joinStr);

        // join()
        String joinStr2 = String.join("-", "A", "B", "C");
        System.out.println("joinStr2 = " + joinStr2);

        String joinStr3 = String.join("-", splitStr);
        System.out.println("joinStr3 = " + joinStr3);
    }
}
