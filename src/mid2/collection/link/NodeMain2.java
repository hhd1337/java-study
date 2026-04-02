package mid2.collection.link;

public class NodeMain2 {
    public static void main(String[] args) {
        // 노드 생성하고 연결하기: A -> B -> C
        Node first = new Node("A"); //x01
        first.next = new Node("B"); //x02
        first.next.next = new Node("C"); //x03

        System.out.println("연결된 노드 출력하기");
        System.out.println(first);
        System.out.println(first.next);

        // IDE가 만들어준 Node.toString()사용한 출력결과: Node{item=A, next=Node{item=B, next=Node{item=C, next=null}}}
        // 자바에서 println(객체); 를 하면 객체의 toString() 메서드가 호출된다.
        // 연쇄적으로 계속 노드들의 toString()이 출력된것이다.
    }
}
