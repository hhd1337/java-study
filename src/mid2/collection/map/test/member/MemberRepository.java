package mid2.collection.map.test.member;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MemberRepository {
    private Map<String, Member> memberMap = new HashMap<>();

    public void save(Member member) {
        memberMap.put(member.getId(), member);
    }

    public void remove(String id) {
        memberMap.remove(id);
    }

    public Member findById(String id) {
        return memberMap.get(id);
    }

    public Member findByName(String name) {
        for (Entry<String, Member> entry : memberMap.entrySet()) {
            Member member = entry.getValue();
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;

//        return memberMap.values().stream()
//                .filter(member -> member.getName().equals(name))
//                .findFirst()
//                .orElse(null);
    }
}
