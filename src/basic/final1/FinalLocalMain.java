package basic.final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        final int data1;
        data1 = 10; // final 변수는 최초 1번만 값 할당 가능.
        // data1 = 20; // 다시 넣으려 하면 컴파일 오류

        final int data2 = 10; // 선언과 동시에 초기화 했어도 어쨌든 값 한번 넣으면 땡.
        // data2 = 20; // 다시 못넣음.

        method(10);
    }

    static void method(final int parameter) {
        //컴파일 오류: 파라미터가 final이라 외부에서 값 넣어줄 텐데 그걸 20으로 바꾼다? 불가능.
        // parameter = 20;

    }
}
