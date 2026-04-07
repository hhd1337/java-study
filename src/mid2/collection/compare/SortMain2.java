package mid2.collection.compare;

import java.util.Arrays;
import java.util.Comparator;

public class SortMain2 {
    public static void main(String[] args) {
        Integer[] array = {3, 2, 4, 1, 5};
        System.out.println("원래 데이터: " + Arrays.toString(array));

        System.out.println("==Comparator 비교==");

        // Arrays.sort()에 정렬대상과 오름차순 비교자 전달
        Arrays.sort(array, new AscComparator());
        System.out.println("AscComparator 정렬: " + Arrays.toString(array));

        // Arrays.sort()에 정렬대상과 내림차순 비교자 전달
        Arrays.sort(array, new DescComparator());
        System.out.println("DescComparator 정렬: " + Arrays.toString(array));

        // 비교자로 "오름차순비교자.reversed()" 전달 -> 내림차순비교자 됨. (DescComparator는 구현 안해도 됨.)
        Arrays.sort(array, new AscComparator().reversed());
        System.out.println("AscComparator.reversed() 정렬: " + Arrays.toString(array));
    }

    static class AscComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            // [오름차순 비교자 구현할 때:]
            // 앞 인수 > 뒤 인수 이면 positive 반환 (+1)
            // 앞 인수 < 뒤 인수 이면 negative 반환 (-1)
            // 앞 인수 == 뒤 인수 이면 0 반환
            return (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1);
        }
    }

    static class DescComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            // 오름차순 비교자의 정렬기준에 -1을 곱함
            return (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1) * -1;
        }
    }
}
