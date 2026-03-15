package mid1.lang.immutable.address;

public class RefMain1_2 {

    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울");
        Address b = new Address("서울"); // a와 b 는 다른 인스턴스를 가리키고 있다.

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setAddress("부산");

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
