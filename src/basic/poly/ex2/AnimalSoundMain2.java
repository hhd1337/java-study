package basic.poly.ex2;

public class AnimalSoundMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cow cow = new Cow();
        Cat cat = new Cat();
        Duck duck = new Duck();

        Animal[] animals = {dog, cow, cat, duck};

        for (Animal animal : animals) {
            soundAnimal(animal);
        }

    }

    private static void soundAnimal(Animal animal) {
        System.out.println("---동물 소리 테스트 시작---");
        animal.sound();
        System.out.println("---동물 소리 테스트 종료---");
    }
}
