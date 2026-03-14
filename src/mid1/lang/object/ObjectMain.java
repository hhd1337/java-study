package mid1.lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        String str = child.toString(); //mid1.lang.object.Child@3feba861 -> 클래스명(Fully Qualified Name) + '@' + 해시코드값(16진수)
        System.out.println(str);
    }
}
