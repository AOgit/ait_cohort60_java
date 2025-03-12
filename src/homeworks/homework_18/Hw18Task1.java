package homeworks.homework_18;

import java.util.Arrays;

//Написать метод со следующим функционалом:
//На вход метод принимает массив целых чисел и число - длину нового массива.
// Метод должен создать и распечатать массив заданной в параметрах длинны.
// В начало массива должны быть скопированы элементы из входящего массива:
//        {0, 1, 2, 3, 4, 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}
//{0, 1, 2} -> copyOfArray(array, 5) -> вывод на печать {0, 1, 2, 0, 0}
//Arrays.copyOf() использовать нельзя. Суть задачи - написать собственную реализацию этого метода
public class Hw18Task1 {

    public static void main(String[] args) {
        int[] arrInt = {1, 2, 4, 5, 6, 10, 0, 48};
        copyArr(arrInt, 3);
        copyArr(arrInt, -6);
        copyArr(arrInt, 10);
    }

    public static void copyArr(int[] array, int number) {
        if (number <= 0) return;
        int [] newArr = new int[number];

//        System.out.print("{");
//        for (int i = 0; i < number; i++) {
//            if (i < array.length) newArr[i] = array[i];
//            System.out.print(newArr[i] + (i == number - 1 ? "}\n" : ", "));
//        }

        for (int i = 0; i < number && i < array.length; i++) newArr[i] = array[i];
        System.out.println(Arrays.toString(newArr));
    }

}
