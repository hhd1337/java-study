package mid2.generic.ex1;

/**
 * 자바의 제네릭은 자바 초창기부터 있었던 기능이 아니라, 나중에 추가된 기능이다. 그래서 기존 코드와의 하위 호환을 위해 raw type 문법도 남겨 두었다. 하지만 raw type은 타입 안전성이 떨어지므로
 * 사용하지 않는 것이 좋다. Object 타입으로 사용하고 싶다면 raw type 대신 GenericBox<Object>처럼 명시해서 사용하자.
 */
public class RawTypeMain {
    // raw type: 제네릭 타입 인자를 적지 않고 사용하는 것
    GenericBox integerBox = new GenericBox();

    // Object를 타입 인자로 명시한 정상적인 제네릭 타입
    // GenericBox<Object> integerBox = new GenericBox<>();

    // 둘은 비슷하게 동작하는 부분이 있지만, 완전히 같은 것은 아니다.
}