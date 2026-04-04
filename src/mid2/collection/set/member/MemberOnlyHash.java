package mid2.collection.set.member;

import java.util.Objects;

// hashCode() 재정의, equals() 재정의 안한 멤버 클래스
public class MemberOnlyHash {
    private String id;

    public MemberOnlyHash(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id); //Objects 클래스: 객체를 다룰 때 편하게 쓰는 유틸리티 클래스
    }

    @Override
    public String toString() {
        return "MemberNoHashNoEq{" +
                "id='" + id + '\'' +
                '}';
    }
}
