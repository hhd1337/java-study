package basic.poly.ex2;

public class AnimalSoundMain1 {
    public static void main(String[] args) {
        // Animal dog = new Dog(); 해도됨
        // : 해당 객체메모리의 Animal부분으로 가서 sound() 찾음, 하위에 오버라이딩된거 있나 확인,
        // 가장 하위의 Dog에 있는 오버라이딩 메소드가 실행된다.
        Dog dog = new Dog();
        Cow cow = new Cow();
        Cat cat = new Cat();

        soundAnimal(dog);
        soundAnimal(cow);
        soundAnimal(cat);

    }

    private static void soundAnimal(Animal animal) {
        System.out.println("---동물 소리 테스트 시작---");
        animal.sound();
        System.out.println("---동물 소리 테스트 종료---");
    }
}
