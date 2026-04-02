package mid2.collection.link;

public class MyLinkedListV1 {

    private Node first;
    private int size = 0;

    public void add(Object e) {
        Node newNode = new Node(e);
        if (first == null) {
            first = newNode;
        } else {
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }

        size++;
    }

    private Node getLastNode() {
        Node node = first;
        while (node.next != null) {
            node = node.next;
        }
        return node;
    }

    public Object set(int index, Object e) {
        Node indexNode = getNode(index);
        Object old = indexNode.item;
        indexNode.item = e;
        return old;
    }

    public Object get(int index) {
        return getNode(index).item;
    }

    private Node getNode(int index) {
        Node node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int indexOf(Object o) {
        int index = 0;
        for (Node node = first; node != null; node = node.next) {
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
}
