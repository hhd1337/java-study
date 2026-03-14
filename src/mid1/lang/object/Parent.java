package mid1.lang.object;

public class Parent { // 부모가 없으면, 묵시적으로 Object클래스를 상속받는다. -> 뒤에 extends Object 가 붙어있는거다.
    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}
