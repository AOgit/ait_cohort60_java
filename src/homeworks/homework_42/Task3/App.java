package homeworks.homework_42.Task3;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
//    Четные целые числа должны идти перед нечетными числами в порядке возрастания.
//    Нечетные целые числа должны идти после четных в порядке убывания
        Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
        Arrays.sort(integers, new MyComparator2());
        System.out.println(Arrays.toString(integers));
    }

}
