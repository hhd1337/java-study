package mid2.collection.utils;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMain {
    public static void main(String[] args) {
        // 편리한 불변 컬렉션 생성
        List<Integer> list = List.of(1, 2, 3);
        Set<Integer> set = Set.of(1, 2, 3);
        Map<Integer, String> map = Map.of(1, "one", 2, "two");

        System.out.println("list = " + list);
        System.out.println("set = " + set);
        System.out.println("map = " + map);

        // 출력: java.util.ImmutableCollections$ListN
        // -> List.of()로 리스트 만들면 인터페이스 List의 구현체로 ImmutableCollections$ListN 얘가 할당되어 변수로 넘어감.
        System.out.println("list class = " + list.getClass());
        System.out.println("set class = " + set.getClass());
        System.out.println("map class = " + map.getClass());

        // .of() 로 생성한 객체들은 불변 객체가 되는데,
        // 변경하려 하면 java.lang.UnsupportedOperationException 발생
        // list.add(4);
    }
}
