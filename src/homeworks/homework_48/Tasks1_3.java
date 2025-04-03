package homeworks.homework_48;

import java.util.*;

public class Tasks1_3 {
    public static void main(String[] args) {

        // Task 1
        List<Integer> integers = List.of(1, 2 ,5, -19, 99, 3, 8, 51, 15, 25);
        System.out.println(
                integers.stream()
                .filter(integer -> integer > 10)
                .sorted((a,b) -> a % 10 - b % 10)
                .toList()
        );

        //Task 2
//      List<String> strings = List.of("Java", "Python",  "JS", "PHP");
        List<String> strings = Arrays.asList(new String[]  {"Java", "Python",  "JS", null, "PHP"});
        System.out.println(
                strings.stream()
                        .filter(Objects::nonNull)
                        .min(Comparator.comparing(String::length))
                        .orElse(null)
        );

        // Task 3
        List<Integer> integerList = List.of(1, 4, 45, -12, 233, 58, 29, -45);
        System.out.println(
                integerList.stream()
                        .filter(i -> i % 2 == 0)
                        .map(integer -> integer * 2)
                        .toList()
        );

    }
}
