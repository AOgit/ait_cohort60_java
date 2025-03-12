package homeworks.homework_15;

import java.util.Scanner;

public class Hw15Task3 {
    public static void main(String[] args) {
//        Task 3 (Повышенной сложности, опционально)
//        Программа предлагает пользователю ввести четырехзначное число.
//        Ввод осуществляется только в формате строки (String).
//                Если введенное значение не является четырехзначным числом, должно выводиться сообщение об ошибке, и программа завершает работу.
//                Проверить, является ли число "счастливым билетом". Для этого нужно сравнить сумму первых двух цифр с суммой последних двух цифр.
//        Примеры:
//
//        - Число 1450 -> (1+4) = 5; (5+0) = 5; 5 равно 5 - число счастливое.
//                - Число 1654 -> (1+6) = 7; (5+4) = 9; 7 не равно 9 - число НЕ является счастливым.
        System.out.print("Введите четырехзначное число: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int number = Integer.parseInt(str);
        if (9999 < number || number < 1000) {
            System.out.println("Число не является четырехзначным");
        } else {
            int digit1 = number / 1000;
            int digit2 =  number / 100 % 10;
            int digit3 =  number / 10 % 10;
            int digit4 =  number % 10;
//            System.out.println(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " ");
            if (digit1 + digit2 == digit3 + digit4) {
                System.out.println("Число счастливое");
            } else {
                System.out.println("Число НЕ является счастливым");
            }
        }
    }
}
