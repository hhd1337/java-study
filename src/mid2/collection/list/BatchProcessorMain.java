package mid2.collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        MyList<Integer> arrayList = new MyArrayList<>();
        MyList<Integer> linkedList = new MyLinkedList<>();

        BatchProcessor processor1 = new BatchProcessor(arrayList);
        processor1.logic(150_000); // O(n*n)

        BatchProcessor processor2 = new BatchProcessor(linkedList);
        processor2.logic(150_000); // O(n)

    }
}
