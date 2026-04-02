package mid2.collection.link;

public class NodeMain3 {
    public static void main(String[] args) {
        // 노드 생성하고 연결하기: A -> B -> C
        Node first = new Node("A"); //x01
        first.next = new Node("B"); //x02
        first.next.next = new Node("C"); //x03

        System.out.println(first);

        // 모든 노드 탐색하기
        System.out.println("모든 노드 탐색하기");
        printAll(first);

        // 마지막 노드 조회하기
        Node lastNode = getLastNode(first);
        System.out.println("lastNode = " + lastNode);

        // 특정 index의 노드 조회하기
        int index = 2;
        Node index2Node = getNode(first, index); //first=0, second=1...
        System.out.println("index2Node = " + index2Node.item);

        // 노드의 마지막에 데이터 추가하기
        System.out.println("데이터 추가하기");
        System.out.println(first);
        add(first, "D");
        System.out.println(first);
        add(first, "E");
        System.out.println(first);
        add(first, "F");
        System.out.println(first);

    }

    private static void add(Node node, Object newItem) {
        Node lastNode = getLastNode(node);
        lastNode.next = new Node(newItem);
    }

    private static Node getNode(Node node, int index) {
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    private static Node getLastNode(Node node) {
        while (node.next != null) {
            node = node.next;
        }
        return node;
    }

    private static void printAll(Node node) {
        while (node != null) {
            System.out.println(node.item);
            node = node.next;
        }
    }
}
