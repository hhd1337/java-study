package basic.poly.basic;

public class CastingMain5 {
    public static void main(String[] args) { //parent1, parent2에 각각 진짜 들어있는 인스턴스가 뭘까?
        Parent parent1 = new Parent();
        System.out.println("----parent1 호출----");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("----parent2 호출----");
        call(parent2);

    }

    private static void call(Parent parent) {
        parent.parentMethod();
        // Child 인스턴스인 경우 childMethod() 실행
        if (parent instanceof Child c) { // parent 객체 메모리에 Child 부분이 있으면 c에 parent 다운캐스팅 해라.
            System.out.println("Child의 인스턴스 맞음.");
            // ((Child) parent).childMethod(); // 직접 다운캐스팅 하는 코드를 생략할 수 있음.
            c.childMethod();
        } else {
            System.out.println("Child의 인스턴스 아님.");
        }
    }
}
