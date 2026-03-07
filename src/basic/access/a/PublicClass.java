package basic.access.a;

public class PublicClass {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass(); //자기 자신의 객체를 클래스 내부에서 생성할 수 있다.

        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();

    }

}

// default는 패키지 프라이빗이니까
// 결국 한 파일에 있다는건 같은 패키지안에 있다는거고,
// 그래서 파일 내에 선언된 클래스 간에는 마음껏 접근할 수 있다.
class DefaultClass1 {

}

class DefaultClass2 {

}