package mid2.generic.test.ex3.unit;

public class UnitUtil {
    public static <T extends BioUnit> T maxHp(T u1, T u2) {
        if (u1.getHp() > u2.getHp()) {
            return u1;
        }
        return u2;
    }
}
