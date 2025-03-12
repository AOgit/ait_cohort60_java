package homeworks.homework_14;

import java.util.Scanner;

public class Hw14Task3 {
    public static void main(String[] args) {

//        Task 3
//        Попросите пользователя ввести целое число с клавиатуры.
//                Ваша программа должна вывести строку в формате:
//        Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
//        Число: 3 четное: false; кратно 3: true; четное и кратное 3: false
//        Copy
//        Проверьте работу вашей программы, вводя разные числа. Убедитесь в правильности выдаваемой строки.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число с клавиатуры: ");
        int number = scanner.nextInt();
        boolean isEven = (number % 2 == 0);
        boolean isM3 = (number % 3 == 0);
        System.out.printf("Число: %d четное: %b; кратно 3: %b; четное и кратное 3: %b", number, isEven, isM3, (isEven && isM3));

    }
}
