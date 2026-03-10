package basic.final1;

public class ConstructInit {
    final int value; // final필드는 객체생성 전에 딱 한번만 초기화되어야 한다.

    public ConstructInit(int value) {
        this.value = value;
    }
}
