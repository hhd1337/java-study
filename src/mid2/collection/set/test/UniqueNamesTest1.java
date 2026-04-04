package mid2.collection.set.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UniqueNamesTest1 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // add방법1) for문 돌려서 요소 추가해도 되고
        for (Integer integer : inputArr) {
            set1.add(integer);
        }

        // add방법2) addAll() 에 컬렉션 통째로 넘겨도 됨
        set2.addAll(Arrays.asList(inputArr));

        // set순회방법1) for each로 돌릴 수 있음.
        for (Integer integer : set1) {
            System.out.println(integer);
        }

        // set순회방법2) iterator()로 반복자를 얻은 뒤, hasNext()/next()로 순회
        Iterator iterator = set2.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
