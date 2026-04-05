package mid2.collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    private Deque<String> historyStack = new ArrayDeque<>();
    private String currentPage = null;

    public void visitPage(String address) {
        if (currentPage != null) {
            historyStack.push(currentPage);
        }
        currentPage = address;
        System.out.println("방문: " + address);
    }

    public String goBack() {
        if (!historyStack.isEmpty()) {
            String currentPage = historyStack.pop();
            System.out.println("뒤로가기: " + currentPage);
            return currentPage;
        }
        return null;
    }
}
