package basic.extends1.super2;

public class ClassB extends ClassA {

    public ClassB(int a) {
        //자식 클래스의 생성자에서는 부모클래스의 생성자 호출을 첫줄에 무조건 해줘야 한다.
        super(); //ClassB의 부모인 ClassA의 생성자 호출을 첫줄에 명시. 하지만!! 기본생성자인 경우 생략해도 컴파일러가 적어준다.
        System.out.println("ClassB 생성자 a=" + a);
    }

    public ClassB(int a, int b) {
        super(); //이것도 원래 부모의 기본 생성자라 생략 가능하다.
        System.out.println("ClassB 생성자 a=" + a + " b=" + b);
    }

}
