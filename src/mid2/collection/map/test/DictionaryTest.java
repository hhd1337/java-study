package mid2.collection.map.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class DictionaryTest {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> dictionary = new HashMap<>();

        System.out.println("==단어 입력 단계==");
        while (true) {
            System.out.print("영어 단어를 입력하세요 (종료는 'q'): ");
            String eng = br.readLine().trim();

            if (eng.equals("q")) {
                break;
            }

            System.out.print("한글 뜻을 입력하세요: ");
            String kor = br.readLine().trim();

            dictionary.put(eng, kor);
        }

        System.out.println();

        System.out.println("==단어 검색 단계==");
        while (true) {
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q'): ");
            String searchEng = br.readLine().trim();

            if (searchEng.equals("q")) {
                break;
            }

            if (dictionary.containsKey(searchEng)) {
                System.out.println(searchEng + "의 뜻: " + dictionary.get(searchEng));
            } else {
                System.out.println(searchEng + "은(는) 사전에 없는 단어입니다.");
            }
        }
    }

}
