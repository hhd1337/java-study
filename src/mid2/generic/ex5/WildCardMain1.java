package mid2.generic.ex5;

import mid2.generic.animal.Animal;
import mid2.generic.animal.Cat;
import mid2.generic.animal.Dog;

public class WildCardMain1 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이", 100));

        WildCardEx.printGenericV1(dogBox);
        WildCardEx.printWildCardV1(dogBox);

        WildCardEx.printGenericV2(dogBox);
        WildCardEx.printWildCardV2(dogBox);

        Dog dog = WildCardEx.printAndReturnGeneric(dogBox);
        catBox.set(new Cat("야옹이", 100));
        Cat cat = WildCardEx.printAndReturnGeneric(catBox);

        // 와일드카드 메서드는 실행시점에 들어오는 타입이 뭔지, 정확하게는 모른다. (Dog 타입 같은 건 모른다.)
        // 그나마 비제한 와일드카드 말고 상한 와일드카드를 써서 메서드가 최대 부모를 알고있게 할 수는 있지만,
        // 그래도 메서드 사용시점에 하위타입이 들어오면, 그게 Dog인지 Cat인지 모른다. 상한 부모인 Animal만 알 뿐이다. 그래서,
        // 1) 매개변수로 Animal 타입 변수에다 dog 객체를 받아야 하고,(다형적 참조)
        // 2) 메서드의 반환값으로는 Dog타입은 모르니 반환하지 못하고, Animal타입으로만 반환할 수 있다.
        // 3) 또 메서드 내부에서는 Dog의 고유 인스턴스 메서드는 사용할 수 없다.
        // 그러면 메서드 반환값을 받아 사용할 때 아래처럼 (Dog) 로 다운캐스팅을 해줘야 한다.

        // 반면, 제네릭 메서드를 사용하면 애초부터 Dog을 메서드가 알고 있게 된다.
        // 1) 매개변수도 정확히 Dog 타입 변수로 받을 수 있고,
        // 2) 반환값도 Dog타입으로 바로 주는 것이 가능하고,
        // 3) 메서드 내부에서 Animal에는 없는, Dog의 고유 인스턴스 메서드까지 사용할 수가 있는거다.

        Animal animal = WildCardEx.printAndReturnWildCard(dogBox);
        Dog dog2 = (Dog) WildCardEx.printAndReturnWildCard(dogBox);
    }
}
