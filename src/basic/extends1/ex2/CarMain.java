package basic.extends1.ex2;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move(); // Car 한테 상속받았으므로 쓸 수 있음.
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move(); // Car한테 상속받았으므로 쓸 수 있음
        gasCar.fillUp();
    }
}
