package lessons.lesson_13;


import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        // Читает всю строку, введенную пользователем и возвращает ее в виде String
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);

        // Прочитать число
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Your age: " + age);

        // Очистить буфер ввода
        scanner.nextLine(); // Это необходимо для очистки оставшегося символа новой строки

        System.out.print("Введите город: ");
        // Читает всю строку, введенную пользователем и возвращает ее в виде String
        String city = scanner.nextLine();
        System.out.println("City: " + city);

//        // Разделитель - пробельный символ
//        \s+ - пробельный символ
//        '  ' - любое кол-во пробельных символов
//        \t знак табуляции
//            \n - перевод каретки
//            \r - возврат каретки
//
        System.out.println("Enter number PI: ");
        double PI = 3.14;


    }
}
