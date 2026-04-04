package mid2.collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationsTest {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        // [합집합] set1 ∪ set2
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        // [교집합] set1 ∩ set2
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        // [차집합] set1-set2
        Set<Integer> difference1 = new HashSet<>(set1);
        difference1.removeAll(set2);
        // [차집합] set2-set1
        Set<Integer> difference2 = new HashSet<>(set2);
        difference2.removeAll(set1);

        System.out.println("합집합(set1 ∪ set2): " + union);
        System.out.println("교집합(set1 ∩ set2): " + intersection);
        System.out.println("차집합(set1 - set2): " + difference1);
        System.out.println("차집합(set2 - set1): " + difference2);
    }
}
