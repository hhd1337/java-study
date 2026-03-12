package basic.poly.basic;

public class CastingMain3 {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent) child; // 업캐스팅은 생략가능, 오히려 생략 권장한다. 자바가 자동으로 업캐스팅 연산 코드를 붙여준다.
        Parent parent2 = child;

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
