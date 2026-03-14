package mid1.lang.object;

public class Child extends Parent { // extends Parent가 있으면 Object를 자동으로 상속받지 않는다.
    public void childMethod() {
        System.out.println("Child.childMethod");
    }
}
