package basic.extends1.ex2;

public class ElectricCar extends Car {
    // Car.move()는 따로 구현하지 않아도 그대로 쓸 수 있다.

    public void charge() {
        System.out.println("충전합니다.");
    }
}
