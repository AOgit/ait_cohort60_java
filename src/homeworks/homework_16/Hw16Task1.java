package homeworks.homework_16;

public class Hw16Task1 {
    public static void main(String[] args) {
//        Циклы
//        Task 1
//        Найдите произведение всех чисел от 1 до 15 включительно.
//
//                Результат выведите на экран
        long mult = 1;
        int i = 1;
        while (i <= 15) mult *= i++;
        System.out.printf("Произведение всех чисел от 1 до 15: %,d",  mult);
    }
}
