package mid2.collection.set.member;

import mid2.collection.set.MyHashSetV2;

public class HashAndEqualsMain1 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberNoHashNoEq m1 = new MemberNoHashNoEq("A"); // hashCode(), equals() 재정의 안 한 경우
        MemberNoHashNoEq m2 = new MemberNoHashNoEq("A");

        // 중복 저장됨
        System.out.println("m1.hashCode() = " + m1.hashCode()); //1867083167
        System.out.println("m2.hashCode() = " + m2.hashCode()); //885284298
        System.out.println("m1.equals(m2) = " + m1.equals(m2)); //false

        set.add(m1);
        set.add(m2);
        System.out.println(set); // [[], .. ,[],[MemberNoHashNoEq{id='A'}], [MemberNoHashNoEq{id='A'}],[]]

        // 1. hashCode가 달라서 해시 인덱스가 다르므로 배열의 다른 버킷에 m1과 m2가 들어가 있음.
        //    set.add(m2) 를 할 때 어차피 m2의 버킷 가보면 m1 없음.
        // 2. 우연히 해시코드는 달라도 해시인덱스가 같게 나와서 버킷이 같아도,
        //    m1.equals(m2) == false 이기 때문에 m1이 있어도 같은 버킷 안에 m2 들어감. -> 동등하게 봐야 할 객체가 set에 중복저장되고 있음.

        // 검색 실패
        MemberNoHashNoEq searchValue = new MemberNoHashNoEq("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        System.out.println("set.contains(searchValue) = " + set.contains(searchValue)); // set에 중복저장도 되어있는데 또 검색은 안됨.

    }
}
