package basic.extends1.ex2;

public class GasCar extends Car {
    // Car.move()를 상속받았기 때문에 따로 구현하지 않아도 그대로 쓸 수 있다.

    public void fillUp() {
        System.out.println("기름을 주유합니다.");
    }
}
