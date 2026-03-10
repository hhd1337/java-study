package basic.final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();
        // data = new Data(); // data 변수는 final이기 때문에 값을 한번 할당하고 재할당 할 수 없다.

        // 근데?! 또 data 객체 안의 value 필드의 값은 변경가능
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
