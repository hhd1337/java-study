package basic.poly.ex3;

public class AbstractMain {
    public static void main(String[] args) {
        //추상클래스 객체 생성 불가
        // AbstractAnimal animal = new AbstractAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);

        moveAnimal(dog);
        moveAnimal(cat);
        moveAnimal(cow);
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 시작");
    }

    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("동물 움직임 테스트 시작");
        animal.move();
        System.out.println("동물 움직임 테스트 시작");
    }
}
