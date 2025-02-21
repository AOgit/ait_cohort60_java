package homework_15;

import java.util.Scanner;

public class Hw15Task2 {
    public static void main(String[] args) {
//        Task 2
//        Напишите программу с использованием оператора switch:
//
//        Программа просит пользователя ввести число от 1 до 7.
//        Если число равно 1, выводим на консоль "Понедельник", 2 — "Вторник" и так далее. Если 6 или 7 — "Выходной".
        System.out.print("Введите число дня недели от 1 до 7: ");
        Scanner scanner = new Scanner(System.in);
        int dayWeekNumber = scanner.nextInt();
        String dayWeek = switch (dayWeekNumber) {
            case 1 -> "Понедельник";
            case 2 -> "Вторник";
            case 3 -> "Среда";
            case 4 -> "Четверг";
            case 5 -> "Пятница";
            case 6, 7 -> "Выходной";
            default -> "В неделе вообще-то 7 дней";
        };
        System.out.println(dayWeek);

    }
}

