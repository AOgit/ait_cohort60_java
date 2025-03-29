package homeworks.homework_44;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(List.of("A", "B", "C", "D"));
        Set<String> set2 = new HashSet<>(List.of("C", "D", "E", "F"));

        System.out.println(SetUtils.union(set1, set2));
        System.out.println(SetUtils.intersection(set1, set2));
        System.out.println(SetUtils.difference(set1, set2));

        // Output:
        //[A, B, C, D, E, F]
        //[C, D]
        //[A, B]
    }
}
