package mid2.generic.ex5;

import mid2.generic.animal.Animal;

public class WildCardEx { // 영한님: "와일드카드는 제네릭을 조금 더 간단하게 쓸 수 있도록 한 것이다. 라고 생각하면 된다."
    // 1. 제네릭 메서드: 먼저 타입 매개변수에 타입을 넣어서 타입을 결정하는 과정이 있다.
    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }

    // 1. 와일드카드 메서드: "그냥 <?>에 아무거나 들어올 수 있어."
    static void printWildCardV1(Box<?> box) { // 제네릭타입의 박스가 들어올 수 있는데, 어떤 타입의 박스든 다 들어올 수 있다.
        System.out.println("? = " + box.get());
    }

    // 2. 제네릭 메서드
    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    // 2. 와일드카드 메서드
    static void printWildCardV2(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
    }

    // 3. 제네릭 메서드
    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    // 3. 와일드카드 메서드
    static Animal printAndReturnWildCard(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }
}
