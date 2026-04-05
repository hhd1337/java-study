package mid2.collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMain {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        //Deque<Integer> deque = new LinkedList<>();

        // 데이터 추가
        deque.offerFirst(1);
        System.out.println(deque);
        deque.offerFirst(2);
        System.out.println(deque);
        deque.offerLast(3);
        System.out.println(deque);
        deque.offerLast(4);
        System.out.println(deque);

        // 다음 꺼낼 데이터 확인(꺼내지 않고 단순 조회만)
        System.out.println("deque.peekFirst() = " + deque.peekFirst());
        System.out.println("deque.peekLast() = " + deque.peekLast());

        // 데이터 꺼내기
        System.out.println(deque);
        System.out.println("deque.pollFirst() = " + deque.pollFirst());
        System.out.println(deque);
        System.out.println("deque.pollLast() = " + deque.pollLast());
        System.out.println(deque);

        //Deque에서 pop()이 first에서 동작하는 이유는,
        //자바가 Deque를 스택처럼 사용할 때 앞쪽(first)을 스택의 top으로 약속했기 때문이다.
        //자료구조적으로 last여도 가능했지만,
        //자바는 push=addFirst, pop=removeFirst, peek=peekFirst처럼 API를 일관되게 매핑하기 위해 first 쪽을 선택했다.
        //즉 first를 선택한 것은 필연적인 이론 때문이라기보다, 스택 동작을 한쪽 끝에 일관되게 묶기 위한 설계 선택이다.
        System.out.println("deque.pop() = " + deque.pop());
    }
}
