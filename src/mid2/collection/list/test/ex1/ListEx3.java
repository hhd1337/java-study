package mid2.collection.list.test.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ListEx3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("n개의 정수를 입력하세요 (종료 0)");

        List<Integer> numberList = new ArrayList<>();
        while (true) {
            int inputNum = Integer.parseInt(br.readLine().trim());
            if (inputNum == 0) {
                break;
            }
            numberList.add(inputNum);
        }

        System.out.println("입력한 정수의 합계: " + sum(numberList));
        System.out.println("입력한 정수의 평균: " + avg(numberList));
    }

    public static double avg(List<Integer> numberList) {
        return (double) sum(numberList) / numberList.size();
    }

    public static int sum(List<Integer> numberList) {
        int sum = 0;
        for (Integer num : numberList) {
            sum += num;
        }
        return sum;
    }
}
