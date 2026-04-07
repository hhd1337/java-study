package mid2.collection.iterable;

import java.util.Iterator;

// 우리가 만든 이 간단한 자료구조를 순회할 수 있게 만드려면, Iterable 인터페이스를 구현한다.
public class MyArray implements Iterable<Integer> {
    private int[] numbers;

    public MyArray(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyArrayIterator(numbers);
    }
}
