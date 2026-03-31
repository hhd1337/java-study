package mid2.generic.ex3;

// 문제1. 자바 컴파일러는 어떤 타입이 들어올 지 특정할 수 없기 때문에 T를 Object타입으로 가정한다.
// 따라서 Object의 메서드만 사용할 수 있다.
// 그래서 Dog, Cat, Animal의 메서드를 AnimalHospitalV2<T> 클래스에서 아예 쓸 수 없다.
// 문제2. 타입 인자로 Animal이나 그 자식만 들어올 수 있도록 제한하고 싶다.
// 지금은 Integer 타입 animal 필드, Object타입 animal 필드도 생성 가능해진다.
public class AnimalHospitalV2<T> {
    private T animal; // 다형성 사용, 상위타입으로 일반화, 자식타입 Dog, Cat 다 담을 수 있도록 함.

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        // T의 타입을, 메서드를 정의하는 시점에는 알 수 없다. Object의 기능만 사용할 수 있다.
        animal.toString();
        animal.hashCode();
        animal.equals(null);

//        System.out.println("동물 이름: " + animal.getName());
//        System.out.println("동물 크기: " + animal.getSize());
//        animal.sound();
    }

    public T bigger(T target) {
//        return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }
}
