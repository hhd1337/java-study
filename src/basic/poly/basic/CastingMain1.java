package basic.poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        //부모변수가 자식 인스턴스 참조 (다형적 참조)
        Parent poly = new Child();
        //단 자식의 기능은 호출불가. 컴파일 오류 발생.
        //poly.childMethod();

        // 다형적 참조에서는 자식부분도 poly 객체 메모리에 분명히 있는데... 참조할 방법 없나?
        // : 다운캐스팅! (부모타입->자식타입)
        Child child = (Child) poly; // poly를 Child 타입으로 캐스팅한 결과를 child에 저장. 근데 poly는 변하지 않음. 여전히 Parent타입.
        child.childMethod();

        
    }

}
