package mid1.exception.basic.checked;

public class CheckedThrowMain {
    // main에서도 잡아서(catch) 해결 못하고, 밖으로 던지면 스택트레이스 출력하고 종료됨.
    public static void main(String[] args) throws MyCheckedException {
        Service service = new Service();
        service.catchThrow();
        System.out.println("정상 종료");
    }
}
