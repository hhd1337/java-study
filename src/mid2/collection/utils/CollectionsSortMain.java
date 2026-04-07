package mid2.collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); // "List에 정의된 기능만 사용할거야." 라는 의미.
        //ArrayList<Integer> list = new ArrayList<>(); // "List에 없는 ArrayList의 특수한 기능을 사용할 일이 있어." 라는 의미.
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Integer max = Collections.max(list); // Comparable 정렬조건에 의해서 정렬된 기준으로 max
        Integer min = Collections.min(list); // 이하동문, min

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("list = " + list);

        Collections.shuffle(list);
        System.out.println("shuffled list = " + list);

        Collections.sort(list);
        System.out.println("sorted list = " + list);

        Collections.reverse(list);
        System.out.println("reversed list = " + list);
    }
}
