package basic.poly.basic;

//다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {
    public static void main(String[] args) {
        // 다형적참조일 때만 다운캐스팅 가능..-> 정확히는 “실제 객체가 자식 객체일 때만” 다운캐스팅 가능.
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod(); // 문제 없음.

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2; // ClassCastException: parent2를 (Child)로 캐스팅할 수 없다.: 원래 Child객체가 아니라서.
        child2.childMethod();

    }
}
