package basic.static2;

import static basic.static2.DecoData.staticCall;

public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        staticCall(); // 정적 변수, 메서드를 자주 사용할 때, 클래스명을 앞에 붙이기 싫으면 이렇게 static import를 한다.

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        //DecoData.staticCall(data1);

        // 추가
        // 인스턴스를 통한 static 메서드 접근: 가능하나 다른 개발자들에게 혼란을 줄 수 있기 때문에 권장 x
        DecoData data3 = new DecoData();
        data3.staticCall();

        // 클래스를 통한 접근
        staticCall();

    }
}
