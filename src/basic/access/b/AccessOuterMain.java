package basic.access.b;

import basic.access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        // public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        // 다른 패키지이므로 default 호출불가
//        data.defaultField = 2;
//        data.defaultMethod();

        //private 해당 클래스 외 어디서든 호출불가
//        data.privateField = 3;
//        data.privateMethod();

        data.innerAccess();
    }
}
