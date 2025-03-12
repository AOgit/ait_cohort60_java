package homeworks.homework_17;
// Заполните массив 50 случайными числами от 1 до 100.
// Программа должна найти, и вывести на экран все простые числа.
// Посчитайте сколько получилось таких чисел в массиве.
// Простое число - число, которое делится на цело только на 1 и само себя.
// Пример простых чисел: 3, 5, 7, 11, 13 и т.д.

import java.util.Random;

public class Hw17Task4 {

    public static void main(String[] args) {
        int[] numbers = new int[50];
        Random random = new Random();
        // Заполняем массив произвольными значениями
        for(int i = 0; i < numbers.length; i++) numbers[i] = 1 + random.nextInt(100);
//        System.out.println(Arrays.toString(numbers));
        int quant = 0;
        for (int i = 0; i < numbers.length; i++) {
            // делаем изначально допущение, что число простое, после чего делаем проверку
           boolean isPrime = true;
           for (int j = 2; j < numbers[i]; j++) {
               if (numbers[i] % j == 0) {
                   isPrime = false;
                   break;
               }
           }
           if (isPrime) {
               System.out.print(numbers[i] + " ");
               quant++;
           }
        }
        System.out.println();
        System.out.println("Кол-во простых чисел: " + quant);
    }

}
