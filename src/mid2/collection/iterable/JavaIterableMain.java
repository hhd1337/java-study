package mid2.collection.iterable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class JavaIterableMain {
    public static void main(String[] args) {
        //list
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> listIter = list.iterator();
        printAll(listIter);

        foreachPrintAll(list);

        //set
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        Iterator<Integer> setIter = set.iterator();
        printAll(setIter);

        foreachPrintAll(set);
    }

    // 인터페이스 Iterator를 매개변수로 설정. 자식들 전부 이 메서드로 받아 처리 가능.
    private static void printAll(Iterator<Integer> iterator) {
        System.out.println("iterator = " + iterator.getClass());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // 인터페이스 Iterable을 매개변수로 설정. 자식들 전부 이 메서드로 받아 처리 가능.
    private static void foreachPrintAll(Iterable<Integer> iterable) {
        for (Integer i : iterable) {
            System.out.println(i);
        }
    }
}
