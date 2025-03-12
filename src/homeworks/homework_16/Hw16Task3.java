package homeworks.homework_16;

import java.util.Scanner;

public class Hw16Task3 {
    public static void main(String[] args) {
//        Task 3 *(Опционально)
//         Напишите программу, которая просит пользователя ввести слово "hello".
//         Если пользователь вводит правильное слово, программа благодарит его и завершает работу.
//         Если вводится неправильное слово, программа продолжает запрашивать ввод,
//         пока не будет введено правильное слово.
//         Дополнительно: Подсчитайте количество попыток, потребовавшихся для ввода правильного слова,
//         и выведите это количество на экран.
            String input;
            do {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите слово \"hello\"");
                input = scanner.nextLine().toLowerCase(); // если регистр не важен
            }while ("hello".compareTo(input) != 0);
    }
}
