package mid1.lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object obj) {

        //obj.sound(); // Dog에는 sound()가 있지만 Object 클래스에는 없다. -> 컴파일 오류
        //obj.move(); // Car에는 move()가 있지만, Object 클래스에는 없다.

        // 객체에 맞는 다운캐스팅 필요. (인자로 Object 받았는데 객체 고유 메서드 호출하고 싶을때.)
        if (obj instanceof Dog d) {
            d.sound();
        } else if (obj instanceof Car c) {
            c.move();
        }
    }
}
