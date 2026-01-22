package mid2.collection.set;

import java.util.Arrays;
import java.util.LinkedList;

// mod (%) 연산을 사용한 해시 알고리즘을 사용한 덕분에,
// 등록, 검색, 삭제 모두 평균 O(1)의 연산속도 가짐.
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
        LinkedList<Integer> bucket = buckets[hashIndex]; // 버킷 찾기 -> O(1)
        if (bucket.contains(value)) { // 버킷 당 데이터가 잘 분산되면, 1,2.. 로 적으므로 O(1)에 가까움.
            return false;
        }
        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex]; // O(1)

        return bucket.contains(searchValue); // // 버킷 당 데이터가 잘 분산되면, 1,2.. 로 적으므로 O(1)에 가까움.
    }

    public boolean remove(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex]; // 버킷 찾기 -> O(1)
        // 리스트에서 remove 메소드는 인덱스기준, value기준 삭제 이렇게 두가지 타입이 있다. 조심해서 의도에 맞는 메소드를 써야 한다.
        // 또한 removed는 삭제 했으면 true, 없어서 삭제 못했으면 false 반환한다.
        // .remove도 찾아서 제거하는 개념이므로 데이터가 버킷들에 잘 분산되면 .contains 메소드와 같은 O(1)에 가까운 시간복잡도 가진다.
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

    @Override
    public String toString() {
        return "MyHashSetV1{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
