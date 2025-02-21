package lesson_16;

import java.util.Random;

public class ArrayExample {
    public static void main(String[] args) {
        int[] array;
        int array1[]; // альтернативный способ обьявления. НЕ РЕКОММЕНДУЕТСЯ к использованию
        String[] strings; // обьявляем массив строк.
        array = new int[4];
        strings = new String[10];
        int[] array2 = new int[8];
        boolean[] bools = new boolean[3];

        // Получить из массива значение
        int value = array2[0];
        System.out.println(value); // 0
        System.out.println(bools[1]); // false
        System.out.println(strings[9]); // null
        /*
        Значения по умолчанию для типов данных
        1. Для числовых типов (также char) - 0
        2. Для boolean - false
        3. Для ссылочных типов - null
         */
        Integer[] integer = new Integer[4];
        System.out.println(integer[2]);
        System.out.println(array2); // Получим ссылку на адрес в ячейке памяти Heap (где хранятся значения)
        int[] numbers = new int[]{45, 23, 28, -12, 200};
        int[] ints = {-12, 14, 56, 63, 2}; // Короткая форма инициализации
        numbers[2] = 100;
        System.out.println("Выводим все элементы массива");
        int i = 0;
        while (i < numbers.length) {
            System.out.print(numbers[i] + " ");
            i++;
        }
        System.out.println();
        int[] intArr = new int[10];
        Random random = new Random();
        i = 0;
        while (i < intArr.length) {
            intArr[i] = random.nextInt(100);
            System.out.print(intArr[i] + (i != intArr.length-1 ? ", " : ""));
            i++;
        }
        System.out.println();

        int min = intArr[0];
        i = 1;
        while (i < intArr.length) {
            if(intArr[i] < min) min = intArr[i];
            i++;
        }
        System.out.println(min);
    }
}
