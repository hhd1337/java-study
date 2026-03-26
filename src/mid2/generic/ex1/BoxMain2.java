package mid2.generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer i = (Integer) integerBox.get();
        System.out.println("i = " + i);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String s = (String) stringBox.get();
        System.out.println("s = " + s);

        //잘못된 타입의 인수 전달 시: 입력할 때 실수로 원하지 않는 타입이 들어갈 수 있는 타입 안전성 문제가 발생한다.
        integerBox.set("문자100"); // ObjectBox.set() 의 매개변수 타입이 Object라서 당연 문자도 전달 가능. 실수로 문자 넣음.
        Integer result = (Integer) integerBox.get(); // 근데 숫자인줄 알고 (Integer)로 강제 형변환 하려 했음. -> ClassCastException
        System.out.println("result = " + result); // 매번 꺼내서 사용할 때 위험한 다운캐스팅을 해줘야함.(뭐가 들어있을지 보장이 안되니까)
    }
}
