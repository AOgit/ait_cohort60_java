package homeworks.homework_14;

public class Hw14Task5 {
    public static void main(String[] args) {

//        Task 5
//        Запишите в 4 переменные случайные числа от 0 до 100.
//        Выведите все 4 числа на экран.
//                Программа должна определить максимальное из этих четырех чисел и вывести результат на экран.
//        Output:
//        Максимальное число: 33

        int var1 = 1;
        int var2 = 5;
        int var3 = 70;
        int var4 = 45;
        System.out.printf("var1: %d, var2: %d, var3: %d, var4: %d\n", var1, var2, var3, var4);
        int max1_4 = Integer.max(Integer.max(var1, Integer.max(var2, var3)), var4);
        System.out.println("Максимальное число: " + max1_4);
    }
}
