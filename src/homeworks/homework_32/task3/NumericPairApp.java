package homeworks.homework_32.task3;

public class NumericPairApp {
    public static void main(String[] args) {
        NumericPair<Integer> intPair = new NumericPair<>(10, 20);
        System.out.println(intPair.sum()); // Вывод: 30.0

        NumericPair<Double> doublePair = new NumericPair<>(5.5, 4.5);
        System.out.println(doublePair.sum()); // Вывод: 10.0
    }
}
