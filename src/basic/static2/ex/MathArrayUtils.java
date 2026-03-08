package basic.static2.ex;

public class MathArrayUtils {
    //private으로 생성자 만들어서 인스턴스 생성을 막는다!!! -> 유틸리티 클래스이므로
    private MathArrayUtils() {
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int e : array) {
            sum += e;
        }
        return sum;
    }

    public static double average(int[] array) {
        return sum(array) / (double) array.length;
    }

    public static int min(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int e : array) {
            min = Math.min(min, e);
        }
        return min;
    }

    public static int max(int[] array) {
        int max = 0;
        for (int e : array) {
            max = Math.max(max, e);
        }
        return max;
    }
}
