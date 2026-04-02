package mid2.collection.link;

public class MyLinkedListV3<E> {

    private Node<E> first;
    private int size = 0;

    public void add(E e) {
        Node<E> newNode = new Node<>(e);
        if (first == null) {
            first = newNode;
        } else {
            Node<E> lastNode = getLastNode();
            lastNode.next = newNode;
        }

        size++;
    }

    // 추가 코드: 인덱스 위치에 데이터 삽입
    public void add(int index, E e) {
        Node<E> newNode = new Node<>(e);
        if (index == 0) {
            newNode.next = first;
            first = newNode;
        } else {
            Node<E> prev = getNode(index - 1); // index가 0일경우 처리 아직 안함!
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    // 추가 코드: 인덱스 위치의 데이터 삭제
    public E remove(int index) {
        Node<E> removeNode = getNode(index);
        E removedItem = removeNode.item;
        if (index == 0) {
            first = first.next;
        } else {
            Node<E> prev = getNode(index - 1);
            prev.next = removeNode.next;
        }
        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removedItem;
    }

    private Node<E> getLastNode() {
        Node<E> node = first;
        while (node.next != null) {
            node = node.next;
        }
        return node;
    }

    public Object set(int index, E e) {
        Node<E> indexNode = getNode(index);
        Object old = indexNode.item;
        indexNode.item = e;
        return old;
    }

    public E get(int index) {
        return getNode(index).item;
    }

    private Node<E> getNode(int index) {
        Node<E> node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int indexOf(Object o) {
        int index = 0;
        for (Node<E> node = first; node != null; node = node.next) {
            if (o.equals(node.item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }

    private static class Node<E> {
        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }

        // [A->B->C] 이렇게 출력하고 싶다.
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("[");

            Node<E> x = this;
            while (x != null) {
                sb.append(x.item.toString());
                if (x.next != null) {
                    sb.append("->");
                }
                x = x.next;
            }
            sb.append("]");

            return sb.toString();
        }
    }
}
