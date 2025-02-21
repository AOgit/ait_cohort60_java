package homework_13;

import java.util.Scanner;

public class Hw13Task3 {
    public static void main(String[] args) {
//        Task 3* (Опционально)
//                Попросите пользователя ввести строку чётной длины с клавиатуры.
//                Распечатайте два средних символа строки.
//        Например:
//
//        Для строки "string" результат будет "ri".
//                Для строки "code" результат будет "od".
//                Для строки "Practice" результат будет "ct".
        System.out.print("Enter a string of even length: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String subMid = str.substring(str.length()/2 - 1, str.length()/2 + 1);
        System.out.println(subMid);

    }
}
