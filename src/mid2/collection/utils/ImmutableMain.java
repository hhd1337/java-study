package mid2.collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {
    public static void main(String[] args) {
        //불변 리스트 생성
        List<Integer> immutableList = List.of(1, 2, 3);
        System.out.println("immutableList = " + immutableList);

        //불변리스트 -> 가변리스트 방법
        //:리스트 생성자에 불변리스트 넘기면 해당 값 복사해서 아예 다른, 새로운 가변리스트 만들음. (내부 데이터는 같음)
        List<Integer> mutableList = new ArrayList<>(immutableList);
        mutableList.add(999);
        System.out.println("mutableList = " + mutableList);

        //가변리스트 -> 불변리스트 방법
        List<Integer> immutableList2 = Collections.unmodifiableList(mutableList);
        //immutableList2.add(8); //java.lang.UnsupportedOperationException 예외 발생

    }
}
