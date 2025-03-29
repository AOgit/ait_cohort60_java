package homeworks.homework_44;

import java.util.*;

public abstract class SetUtils {

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> tempSet = new HashSet<>(set1);
        tempSet.addAll(set2);
        return tempSet;
    }

    public static <T> Set<T> intersection(Set<T> set1, Set<T> set2) {
        Set<T> tempSet = new HashSet<>(set1);
        tempSet.retainAll(set2);
        return tempSet;
    }

    public static <T> Set<T> difference(Set<T> set1, Set<T> set2) {
        Set<T> tempSet = new HashSet<>(set1);
        tempSet.removeAll(set2);
        return tempSet;
    }

}
