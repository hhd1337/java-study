package mid2.collection.set.member;

// hashCode() 와 equals() 모두 재정의 안한 멤버 클래스
public class MemberNoHashNoEq {
    private String id;

    public MemberNoHashNoEq(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "MemberNoHashNoEq{" +
                "id='" + id + '\'' +
                '}';
    }
}
