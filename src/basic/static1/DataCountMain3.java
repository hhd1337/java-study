package basic.static1;

public class DataCountMain3 {

    public static void main(String[] args) {
        Counter counter = new Counter();
        Data3 data1 = new Data3("A");
        System.out.println("A count=" + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count=" + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count=" + Data3.count);

        //추가
        //인스턴스를 이용한 static변수 접근
        Data3 data4 = new Data3("D");
        System.out.println(data4.count); // 이 인스턴스에 가봄. count 변수가 static이네? 이럼 메서드영역으로 가서 값 읽어옴

        //클래스를 통한 static변수 접근
        System.out.println(Data3.count);
    }
}
