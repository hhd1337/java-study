package mid2.collection.iterable;

import java.util.Iterator;

// 배열을 반복할 수 있는 반복자를 만들어보자.
public class MyArrayIterator implements Iterator<Integer> {

    private int currentIndex = -1;
    private int[] targetArr;

    public MyArrayIterator(int[] targetArr) {
        this.targetArr = targetArr;
    }

    @Override
    public boolean hasNext() {
        // 현재인덱스 < 마지막인덱스 인가? (현재인덱스==마지막인덱스여도 false 반환해야 함)
        if (currentIndex < targetArr.length - 1) {
            return true;
        }
        return false;
    }

    @Override
    public Integer next() {
        return targetArr[++currentIndex];
    }
}
