package mid1.lang.object.toString;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object obj = new Object();

        //toString() 반환값 출력
        System.out.println(obj.toString()); // java.lang.Object@6acbcfc0
        //object 직접 출력
        System.out.println(obj); // java.lang.Object@6acbcfc0 똑같음!
        
    }
}
