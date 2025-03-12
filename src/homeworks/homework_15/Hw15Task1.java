package homeworks.homework_15;

public class Hw15Task1 {
    public static void main(String[] args) {
//        Task 1
//        Запишите в 4 переменные случайные числа от 0 до 100.
//        Выведите все 4 числа на экран.
//                Программа должна определить максимальное из этих четырех чисел и вывести результат на экран.
//        Output:
//        Максимальное число: 33
        int var1 = 15;
        int var2 = 32;
        int var3 = 70;
        int var4 = 9;
        System.out.printf("var1: %d, var2: %d, var3: %d, var4: %d \n", var1, var2, var3, var4);

        int max = var1;
//        max = max < var2 ? var2 : max;
//        max = max < var3 ? var3 : max;
//        max = max < var4 ? var4 : max;
        if (max < var2) max = var2;
        if (max < var3) max = var3;
        if (max < var4) max = var4;
        System.out.println("Max: " + max);

    }
}
