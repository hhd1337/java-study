package mid2.collection.set.member;

import mid2.collection.set.MyHashSetV2;

public class HashAndEqualsMain2 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberOnlyHash m1 = new MemberOnlyHash("A"); // hashCode()만 재정의 한 경우
        MemberOnlyHash m2 = new MemberOnlyHash("A");

        // 중복 저장됨
        System.out.println("m1.hashCode() = " + m1.hashCode()); //96
        System.out.println("m2.hashCode() = " + m2.hashCode()); //96
        System.out.println("m1.equals(m2) = " + m1.equals(m2)); //false

        set.add(m1);
        set.add(m2);
        System.out.println(set);

        // 검색 실패:
        // 버킷은 잘 찾아가는데, 내부 선형 탐색 시 equals가 동일성기반으로 작동해서 id가 "A"인 객체들이 다 다르다고 판단됨.
        MemberOnlyHash searchValue = new MemberOnlyHash("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        System.out.println("set.contains(searchValue) = " + set.contains(searchValue));

    }
}
