package mid2.collection.list;

public class BatchProcessor {

    private final MyList<Integer> list; // 추상 클래스(인터페이스)만 알고 있음!

    // 의존관계 주입: 런타임에, 외부에서 어떤 리스트 전략(구현체)을 사용할지 주입해준다.
    // 마치 의존관계가 외부에서 주입되는 것 같다고 해서 의존관계 주입(DI)이라고 한다.
    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }

    public void logic(int size) {
        long startTime = System.currentTimeMillis();
        // 0부터 size까지 리스트 앞에 쭉 추가
        for (int i = 0; i < size; i++) { // O(n)
            list.add(0, i); // 맨 앞에 추가 // O(n)
        }

        long endTime = System.currentTimeMillis();
        System.out.println("크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
}