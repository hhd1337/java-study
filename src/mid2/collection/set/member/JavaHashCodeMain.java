package mid2.collection.set.member;

public class JavaHashCodeMain {
    public static void main(String[] args) {
        // Object의 기본 hashCode는 객체의 참조값을 기반으로 생성한다.
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("obj1.hashCode() = " + obj1.hashCode());
        System.out.println("obj2.hashCode() = " + obj2.hashCode());

        // 각 클래스마다 hashCode를 이미 오버라이딩 해두었다.
        Integer i = 10;
        String strA = "A";
        String strAB = "AB";

        System.out.println("10.hashCode() = " + i.hashCode());
        System.out.println("'A'.hashCode() = " + strA.hashCode());
        System.out.println("'AB'.hashCode() = " + strAB.hashCode());

        // hashCode는 마이너스 값이 들어올 수 있다.
        System.out.println("-1.hashCode() = " + Integer.valueOf(-1).hashCode());

        // 둘은 같을까?
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");

        // equals, hashCode를 오버라이딩 하지 않은 경우와 한 경우를 비교

        // 1. (==) -> member1,2의 인스턴스가 다르므로 당연히 false
        System.out.println("(member1 == member2) = " + (member1 == member2));
        // 2. (equals()) -> Member 클래스 내에 equals, hashCode를 오버라이딩하여
        // 논리적 동등성 재정의 했으므로 id가 같은 member1,2는 같다고 봄.
        System.out.println("(member1 equals member2) = " + (member1.equals(member2)));

        // Member 클래스 내에 hashCode() 메소드를 id 기반으로 해시코드를 생성하도록 재정의 했으므로
        // 둘의 해시코드는 동일. (만약 재정의하지 않았다면 자바는 객체 참조값으로 해시코드 생성하므로 인스턴스 다른 둘은 그냥 해시코드가 다르다.)
        System.out.println("member1.hashCode() = " + member1.hashCode()); // member1.hashCode() = 104070
        System.out.println("member2.hashCode() = " + member2.hashCode()); // member2.hashCode() = 104070
    }
}
