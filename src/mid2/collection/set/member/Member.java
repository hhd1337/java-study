package mid2.collection.set.member;

import java.util.Objects;

public class Member {
    private String id;

    public Member(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    // id가 같으면 같은 멤버라는 로직을 equals()를 재정의하여 반영하려고 함.
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Member member = (Member) o;
        return Objects.equals(id, member.id);
    }

    // 해시 알고리즘을 이용해 같은 멤버가 위치에 저장되려면
    // 해시코드를 구하는 해시 함수에도 'id가 같으면 같은 멤버'라는 로직을 반영해야 함.
    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                '}';
    }
}
