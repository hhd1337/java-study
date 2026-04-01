package mid2.collection.array;

import java.util.Arrays;

public class MyArrayListV4_1<E> { // MyArrayListV4 안보고 혼자 연습.
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV4_1() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV4_1(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        return (E) elementData[index];
    }

    public E set(int index, E o) {
        E old = get(index);
        elementData[index] = o;
        return old;
    }

    public void add(E o) {
        if (size == elementData.length) {
            grow();
        }
        elementData[size] = o;
        size++;
    }

    // 마지막 부터 index번까지 뒤로 밀고, index번에 추가.
    public void add(int index, E o) {
        if (size == elementData.length) {
            grow();
        }

        // 데이터 이동
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
        // 데이터 추가
        elementData[index] = o;
        size++;
    }

    private void grow() {
        elementData = Arrays.copyOf(elementData, elementData.length * 2);
    }

    // index의 요소 제거, 뒤에꺼 한칸씩 싹다 앞으로 당김.
    public E remove(int index) {
        E old = get(index);
        // 데이터 이동(앞으로 한칸, 덮어씀)
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
        return old;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (elementData[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)) +
                " size=" + size + ", capacity=" + elementData.length;
    }
}
