package basic.static2.ex;

public class Car {
    private String carModel;
    private static int carCount;

    public Car(String carModel) {
        this.carModel = carModel;
        System.out.println("차량 구입, 이름: " + carModel);
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수: " + carCount);
    }
}
