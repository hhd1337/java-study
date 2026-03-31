package mid2.generic.ex3;

import mid2.generic.animal.Animal;

public class AnimalHospitalV1 {
    private Animal animal; // 다형성 사용, 상위타입으로 일반화, 자식타입 Dog, Cat 다 담을 수 있도록 함.

    public void set(Animal animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    public Animal bigger(Animal target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
