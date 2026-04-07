package mid2.collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("list class = " + list.getClass());

        // 일반 리스트 -> 멀티스레드 동기화 안전 리스트 : Collections.synchronizedList()
        List<Integer> synchronizedList = Collections.synchronizedList(list);
        //java.util.Collections$SynchronizedRandomAccessList
        System.out.println("synchronizedList class = " + synchronizedList.getClass());


    }
}
