package homeworks.homework_47;

import java.util.List;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> listIntegers = List.of(1, 2, 3, 55, -10, 94, 20);
        System.out.println(filteredList(listIntegers));
    }
    private static List<Integer> filteredList(List<Integer> list) {
        return list.stream()
                .filter(l -> l % 2 == 0 && l > 10 && l < 100)
                .toList();
    }
}
