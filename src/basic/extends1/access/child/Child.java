package basic.extends1.access.child;

import basic.extends1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1;
        protectedValue = 1; // 지금 Parent클래스와 이 클래스(Child)가 다른 패키지에 있지만, 상속관계이기 때문에 접근 가능.
        // defaultValue = 1; // Parent클래스와 다른 패키지에 있는 클래스에서 default 필드에 접근 불가
        // privateValue = 1; // 그냥 해당 클래스 안에서만 접근 가능하므로 당연히 접근불가

        publicMethod();
        protectedMethod(); // 상속 받았으므로 부모 클래스의 protected 메소드는 접근 가능
        // defaultMethod(); // 패키지가 다르므로 default 메소드는 접근 불가
        // privateMethod(); // private 메소드는 해당 클래스 내에서만 접근 가능

    }
}
