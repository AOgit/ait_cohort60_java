package homeworks.homework_42.Task2;

import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) {
        Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
//        Четные целые числа должны идти перед нечетными числами
        Arrays.sort(integers, new MyComparator());
        System.out.println(Arrays.toString(integers));
    }
}
