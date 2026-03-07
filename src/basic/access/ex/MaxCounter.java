package basic.access.ex;

public class MaxCounter {
    private int count = 0;
    private int limit;

    public MaxCounter(int limit) {
        this.limit = limit;
    }

    public void increment() {
        if (count >= limit) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        count++;
    }

    public int getCount() {
        return count;
    }
}