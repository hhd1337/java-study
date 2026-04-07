package mid2.collection.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmptyListMain {
    public static void main(String[] args) {
        //빈 가변리스트 생성
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        //빈 불변리스트 생성
        List<Integer> list3 = Collections.emptyList(); //자바5
        List<Integer> list4 = List.of(); //자바9

        System.out.println("list3 = " + list3.getClass());
        System.out.println("list4 = " + list4.getClass());

        List<Integer> list5 = Arrays.asList(1, 2, 3);
        List<Integer> list6 = List.of(1, 2, 3);

        Integer[] arr = {1, 2, 3, 4, 5};
        List<Integer> list7 = Arrays.asList(arr); // 크기는 arr.length로 고정, 내부 값은 변경가능
        List<Integer> list8 = List.of(arr); // 아무것도 변경 불가능
    }
}
