package homework_16;

import java.util.Scanner;

public class Hw16Task4 {
    public static void main(String[] args) {
//        Task 4 * (Опционально)
//                Программа запрашивает у пользователя ввод произвольного числа.
//                Вывести сумму цифр этого числа.
//                Пример:
//        567432 -> 5+6+7+4+3+2 -> 27
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите произвольное число");
        int number = scanner.nextInt();
        String strNumber = String.valueOf(number);

        int sum = 0;
        int i = 0;
        // Не знаю могут ли быть числа меньше нуля, в условиях задачи об этом ничего не сказано
        // поэтому на всякий случай решил сделать проверку на знак минус
        if (strNumber.charAt(0) == '-') {
           sum = - (strNumber.charAt(1) - '0');
           i = 2;
        }
//        while (i < strNumber.length()) sum += Integer.parseInt(String.valueOf(strNumber.charAt(i++)));
        while (i < strNumber.length()) sum += strNumber.charAt(i++) - '0';
        System.out.println(sum);
    }
}
