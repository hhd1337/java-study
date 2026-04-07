package mid2.collection.compare;

import java.util.TreeSet;

public class SortMain5 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        // TreeSet은 데이터를 넣을 때마다 비교를 통해 정렬된 위치에 저장하는 자료구조이다. 그래서 정렬 기준이 반드시 필요하다.
        // 그런데 사용자 정의 객체를 그냥 넣으면, TreeSet이 비교 기준을 모르므로,
        // 1. 사용자 정의 객체가 Comparable(compareTo) 구현하여 기본정렬(자연순서)을 제공하거나,
        // 2. 또는 별도의 Comparator(비교자) 제공이 필수이다.
        // 둘 다 없으면 TreeSet은 객체의 대소를 판단할 수 없어 예외가 발생한다! -> ClassCastException
        TreeSet<MyUser> treeSet1 = new TreeSet<>();
        treeSet1.add(myUser1);
        treeSet1.add(myUser2);
        treeSet1.add(myUser3);

        // 1. 사용자 정의 객체의 자연순서 사용하여 정렬
        System.out.println("Comparable 기본 정렬");
        System.out.println(treeSet1);

        // 2. TreeSet 생성자에 Comparator 전달, 그 비교자로 정렬
        TreeSet<MyUser> treeSet2 = new TreeSet<>(new IdComparator());
        treeSet2.add(myUser1);
        treeSet2.add(myUser2);
        treeSet2.add(myUser3);
        System.out.println("별도 Comparator로 정렬");
        System.out.println(treeSet2);
    }
}
