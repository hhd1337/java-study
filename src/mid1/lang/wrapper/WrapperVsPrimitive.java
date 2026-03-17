package mid1.lang.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args) {
        int iterations = 1_000_000_000; //반복횟수 설정, 10억
        long startTime, endTime;

        //기본형 long 사용
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();

        System.out.println("sumPrimitive = " + sumPrimitive);
        System.out.println("기본타입 long 0부터 999_999_999까지 더하는데 걸린 시간: " + (endTime - startTime) + "ms");

        // 래퍼 클래스 Long 사용
        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumWrapper += i; // 오토 박싱 발생
        }
        endTime = System.currentTimeMillis();

        System.out.println("sumWrapper = " + sumWrapper);
        System.out.println("래퍼타입 Long 0부터 999_999_999까지 더하는데 걸린 시간: " + (endTime - startTime) + "ms");
    }
}
