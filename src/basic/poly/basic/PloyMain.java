package basic.poly.basic;

public class PloyMain {

    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        System.out.println("[Parent -> Parent]");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("[Child -> Child]");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        System.out.println("[Parent -> Child]");
        Parent poly = new Child(); //자식 인스턴스는 메모리에 부모,자식 모두 존재하기 때문에 부모타입 변수에 담을 수 있다.
        poly.parentMethod(); // poly는 결국 Parent타입이다. 취급 자체가 Parent객체로 된다. 해당 타입 메소드 전부 쓸 수 있다.

        //하지만 poly는 자식의 메서드는 호출할 수 없다. 취급 자체가 Parent객체이기 때문에 자식메서드는 모른다.
        //poly.childMethod(); // 메서드는 변수 선언 타입으로 가져오니까 poly 변수로는 Parent 타입이라 자식 메소드 접근 불가

        //Child child1 = new Parent(); // 자식은 부모를 담을 수 없다.

    }
}
