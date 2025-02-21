package homework_16;

import java.util.Random;

public class Hw16Task5 {
    public static void main(String[] args) {
//        Task 5
//        Создать массив целых чисел произвольной длины от 5 до 15.
//        Заполнить массив случайными значениями от -50 до 50.
//        Вывести на экран:
//        Минимальное значение в массиве
//        Максимальное значение в массиве
//        Среднее арифметическое всех значений в массиве

        int[] numbers = new int[7];
        Random random = new Random();
        int i = 0;
        while (i < numbers.length) numbers[i++] = -50 + random.nextInt(100);

        int min = numbers[0];
        int max = numbers[0];
        int sum = numbers[0];
        i = 1;
        System.out.print(min);
        while (i < numbers.length){
            System.out.print(" " + numbers[i]);
            if (min > numbers[i]) min = numbers[i];
            if (max < numbers[i]) max = numbers[i];
            sum += numbers[i];
            i++;
        }
        System.out.println();
        System.out.println("Минимальное значение в массиве: " + min);
        System.out.println("Максимальное значение в массиве: " + max);
        System.out.println("Среднее арифметическое всех значений в массиве: " + sum / numbers.length);


    }
}
