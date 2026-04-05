package mid2.collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {
    // 각각의 단어가 나타난 수를 출력해라.
    // {orange=1, banana=2, apple=3}
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        String[] splitTextArr = text.split(" ");

        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : splitTextArr) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        System.out.println(wordCountMap);
    }
}
