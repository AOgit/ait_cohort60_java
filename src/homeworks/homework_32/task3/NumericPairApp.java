package homeworks.homework_32.task3;

public class NumericPairApp {
    public static void main(String[] args) {
        NumericPair<Integer, Integer> intPair = new NumericPair<>(10, 20);
        System.out.println(intPair.sum()); // Вывод: 30.0

        NumericPair<Double, Double> doublePair = new NumericPair<>(5.5, 4.5);
        System.out.println(doublePair.sum()); // Вывод: 10.0

        NumericPair<Integer, Double> doublePair1 = new NumericPair<>(5, 4.5);
        System.out.println(doublePair1.sum()); // Вывод: 10.0

        NumericPair<Double, Double> doublePair2 = new NumericPair<>(Double.valueOf(5), 4.5);
        System.out.println(doublePair2.sum()); // Вывод: 10.0

       Byte btVal = 10;
       NumericPair<Integer, Byte> doublePair3 = new NumericPair<>(btVal.intValue(), btVal);
       System.out.println(doublePair3.sum()); // Вывод: 10.0

       NumericPair<Integer, Number> doublePair4 = new NumericPair<>(btVal.intValue(), btVal);
       System.out.println(doublePair4.sum()); // Вывод: 10.0

    }
}
