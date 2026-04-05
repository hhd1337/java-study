package mid2.collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum1 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);

        Map<String, Integer> resultMap = new HashMap<>();

        //map1과 map2에 공통으로 들어있는 키를 찾고, 그 값의 합을 구해라
        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                Integer m1Value = map1.get(key);
                Integer m2Value = map2.get(key);
                resultMap.put(key, (m1Value + m2Value));
            }
        }
        System.out.println(resultMap);
    }
}
