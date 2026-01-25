package mid2.collection.set;

import java.util.Arrays;
import java.util.LinkedList;

// 각 버킷(LinkedList)에 Integer 값만 넣는 것이 아니라 Object값을 넣을 수 있게 해서,
// 모든 타입의 Set을 만들 수 있도록 바꿈
public class MyHashSetV2 {

    static final int DEFAULT_INITIAL_CAPACITY = 16;

    private LinkedList<Object>[] buckets;

    private int size = 0; // set에 들어온 전체 데이터의 개수
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV2() {
        initBuckets();
    }

    public MyHashSetV2(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(Object value) {
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex];
        if (bucket.contains(value)) {
            return false;
        }
        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(Object searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Object> bucket = buckets[hashIndex];

        return bucket.contains(searchValue);
    }

    public boolean remove(Object value) {
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex];
        boolean removed = bucket.remove(value);
        if (removed) {
            size--;
            return true;
        }
        return false;
    }


    private int hashIndex(Object value) {
        int hashCode = value.hashCode(); // .hashCode() 연산으로 반환되는 해시코드는 음수일 수도 있음!!
        return Math.abs(hashCode) % capacity; // Math.abs()는 절댓값을 구하는 연산.
    }

    @Override
    public String toString() {
        return "MyHashSetV2{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
