package basic.extends1.super2;

public class ClassC extends ClassB {
    public ClassC() {
        //super(); // 부모가 (ClassB) 기본 생성자가 없으므로 인자를 안넣어줬으니 컴파일 오류.
        super(10, 20); // 이렇게 정의된 생성자에 맞게 super()를 첫줄에, 하나만, 꼭 써야 한다.
        System.out.println("ClassC 생성자");
    }
}
