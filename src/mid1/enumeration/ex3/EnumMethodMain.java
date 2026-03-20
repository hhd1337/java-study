package mid1.enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {

        //모든 Enum 반환
        Grade[] values = Grade.values(); //모든 enum객체를 반환
        System.out.println("values = " + Arrays.toString(values));
        for (Grade value : values) {
            System.out.println("name=" + value.name() + ", ordinal=" + value.ordinal());
        }
    }
}
