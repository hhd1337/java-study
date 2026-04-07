package mid2.collection.compare;

import java.util.Comparator;

public class IdComparator implements Comparator<MyUser> {
    @Override
    public int compare(MyUser o1, MyUser o2) {
        // str1 > str2 이렇게 문자열끼리 대소비교가 안되잖아?
        // 그래서 자바는 문자열 비교 쉽게 하라고 "a".compareTo("b") 이렇게
        // String 클래스에 문자열끼리 대소비교를 할 수 있도록 compareTo()를 오버라이딩 해놓았다.
        // return (o1.getId() > o2.getId()) ? 1 : ((o1.getId().equals(o2.getId())) ? 0 : -1);

        return o1.getId().compareTo(o2.getId());
    }
}
