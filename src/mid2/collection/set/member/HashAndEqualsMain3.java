package mid2.collection.set.member;

import mid2.collection.set.MyHashSetV2;

public class HashAndEqualsMain3 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        Member m1 = new Member("A"); // hashCode(), equals() 모두 재정의 한 경우
        Member m2 = new Member("A");

        // 중복 저장 제대로 막힘!!
        System.out.println("m1.hashCode() = " + m1.hashCode()); //65
        System.out.println("m2.hashCode() = " + m2.hashCode()); //65
        System.out.println("m1.equals(m2) = " + m1.equals(m2)); //true

        set.add(m1);
        set.add(m2);
        System.out.println(set);

        // 검색 잘 됨!!
        Member searchValue = new Member("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        System.out.println("set.contains(searchValue) = " + set.contains(searchValue));

    }
}
