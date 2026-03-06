package basic.pack;

import basic.pack.a.User;
import basic.pack.a.User2;

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User(); //import를 사용하면 다른 패키지에 있는 클래스를 가져와서 사용할 수 있다.
        User2 user2 = new User2();

    }
}