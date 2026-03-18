package mid1.lang.math;

import java.util.Random;

public class RandomMain {

    public static void main(String[] args) {
        Random random = new Random();
        // seed가 같으면 Random의 결과가 같다. -> 테스트 코드 같은 곳에서 같은 결과를 검증할 수 있다.
        // 마인크래프트같은 게임은 게임 시작 시 지형을 랜덤으로 생성하는데, 같은 씨드값을 설정하면 같은 지형을 생성할 수 있다.
        // Random random = new Random(1);

        int randomInt = random.nextInt();
        System.out.println("randomInt = " + randomInt);
        
        double randomDouble = random.nextDouble();
        System.out.println("randomDouble = " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean = " + randomBoolean);

        // 범위조회
        int randomRange1 = random.nextInt(10);//0~9까지 출력
        System.out.println("0~9: " + randomRange1);

        int randomRange2 = random.nextInt(10) + 1;
        System.out.println("1~10 = " + randomRange2);//1~10까지 출력
    }
}
