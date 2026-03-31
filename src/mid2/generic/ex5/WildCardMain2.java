package mid2.generic.ex5;

import mid2.generic.animal.Animal;
import mid2.generic.animal.Cat;
import mid2.generic.animal.Dog;

public class WildCardMain2 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        writeBox(objBox);
        writeBox(animalBox);
        //writeBox(dogBox); // 하한이 Animal이기 때문에 Dog안됨.
        //writeBox(catBox); // 하한이 Animal이기 때문에 Cat안됨.
    }

    // 하한 설정은 제네릭에는 없고 와일드 카드에만 있다!
    static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("멍멍이", 100));
    }
}
