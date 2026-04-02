package mid2.collection.link;

public class Node {

    Object item;
    Node next;

    public Node(Object item) {
        this.item = item;
    }

    /*
    // IDE 생성 toString()
    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }
    */

    // [A->B->C] 이렇게 출력하고 싶다.
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");

        Node x = this;
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
