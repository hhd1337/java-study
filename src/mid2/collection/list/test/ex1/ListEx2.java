package mid2.collection.list.test.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ListEx2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("n개의 정수를 입력하세요 (종료 0)");

        List<Integer> list = new ArrayList<>();
        while (true) {
            int inputNum = Integer.parseInt(br.readLine().trim());
            if (inputNum == 0) {
                break;
            }
            list.add(inputNum);
        }

        System.out.println("출력");
//        String listString = Arrays.toString(list.toArray());
//        listString = listString.replace("[", "");
//        listString = listString.replace("]", "");
//        System.out.println(listString);

        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
                continue;
            }
            System.out.print(list.get(i) + ", ");
        }
    }
}
