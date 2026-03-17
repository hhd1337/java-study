package mid1.lang.wrapper;

public class WrapperUtilsMain {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10); // 숫자를 Wrapper객체로 변환
        Integer i2 = Integer.valueOf("10");// 문자열을 Wrapper(Integer)객체 로 변환
        int intValue = Integer.parseInt("10");// 문자열 전용, 기본형 변환.

        //비교
        int compareResult = i1.compareTo(20); // 내(i1) 값이 더 작으면 -1반환.
        System.out.println("compareResult = " + compareResult);
    }
}