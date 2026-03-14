package mid1.lang.object.equals;

import java.util.Objects;

public class UserV2 {
    private String id;

    public UserV2(String id) {
        this.id = id;
    }

//    @Override
//    public boolean equals(Object obj) {
//        UserV2 user = (UserV2) obj;
//        return this.id.equals(user.id);
//    }

    // Generate 단축키를 사용하면 반사성, 대칭성, 추이성, 일관성, null비교 equals() 구현 다섯 규칙에 따라
    // 인텔리제이가 이렇게 자동으로 만들어준다!!
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserV2 userV2 = (UserV2) o;
        return Objects.equals(id, userV2.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
