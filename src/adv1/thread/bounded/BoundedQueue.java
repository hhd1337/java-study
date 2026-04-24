package adv1.thread.bounded;

//한정된 버퍼 역할의 Queue 인터페이스
public interface BoundedQueue {
    void put(String data); // 버퍼에 데이터 넣음.

    String take(); // 버퍼에서 데이터 가져감.
}
