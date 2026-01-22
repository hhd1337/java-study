package mid2.collection.set;

import java.util.LinkedList;

public class MyHashSetV1 {

    static final int DEFAULT_INITIAL_CAPACITY = 16;

    LinkedList<Integer>[] buckets;

    private int size = 0; // set에 들어온 전체 데이터의 개수
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV1() {
        initBuckets();
    }

    public MyHashSetV1(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        if (bucket.contains(value)) {
            return false;
        }
        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];

        return bucket.contains(searchValue);
    }

    public boolean remove(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        // 리스트에서 remove 메소드는 인덱스기준, value기준 삭제 이렇게 두가지 타입이 있다. 조심해서 의도에 맞는 메소드를 써야 한다.
        // 또한 removed는 삭제 했으면 true, 없어서 삭제 못했으면 false 반환한다.
        boolean removed = bucket.remove(Integer.valueOf(value));
        if (removed) {
            size--;
            return true;
        }
        return false;
    }


    private int hashIndex(int value) {
        return value % capacity;
    }
}
