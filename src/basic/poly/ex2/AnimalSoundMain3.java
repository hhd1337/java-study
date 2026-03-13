package basic.poly.ex2;

public class AnimalSoundMain3 {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cow(), new Cat(), new Duck()};

        for (Animal animal : animals) {
            soundAnimal(animal);
        }

    }

    // 이 메서드는 변하지 않음. 새로운 동물이 추가 되어도.
    private static void soundAnimal(Animal animal) {
        System.out.println("---동물 소리 테스트 시작---");
        animal.sound();
        System.out.println("---동물 소리 테스트 종료---");
    }
}
