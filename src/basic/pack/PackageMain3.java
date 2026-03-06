package basic.pack;

import basic.pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        // 다른 패키지에 있는 "User" 클래스를 함께 쓸 때: 한놈은 무조건 Fully Qualified Name 써야 한다.(패키지명+클래스명)
        User userA = new User(); // 실무에서는 보통 자주 쓰는 놈을 import 하고
        basic.pack.b.User userB = new basic.pack.b.User(); // 덜 자주 쓰는 놈을 FQN으로 쓴다.
    }
}