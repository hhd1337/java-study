package mid2.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        // 학생 성적 데이터 추가
        studentMap.put("studentA", 90);
        System.out.println(studentMap);

        studentMap.put("studentA", 100);
        System.out.println(studentMap); //같은 키에 저장 시 기존 값 교체한다

        // Map.containsKey()
        boolean containsKey = studentMap.containsKey("studentA");
        System.out.println("containsKey = " + containsKey);

        // Map.containsValue();
        boolean containsValue = studentMap.containsValue(90);
        System.out.println("containsValue = " + containsValue); //false -> 지금은 "studentA" : 100 으로 엔트리 하나 있음.

        // 특정학생의 값 삭제 -> key로 엔트리 자체를 삭제
        studentMap.remove("studentA");
        System.out.println(studentMap);
    }
}
