package lesson_16;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        int number = 1;

        while (number <= 5) {
            System.out.print(number + ", ");
            number++;
        }
        System.out.println();
        System.out.println("Цикл закончен");

        number = 100;
        while (number >= 0) {
            System.out.print(number-- + ", ");
//            number--;
        }
        System.out.println("Цикл закончен");

       int sum = 0;
       int i = 1;

       while (i <= 100) sum += i++;
       System.out.println("Сумма от 1 до 100: " + sum);

       i = 1;
       while (i <= 21) {
           System.out.println("Число, которое проверяем: " + i);
           if(i % 2 == 0) System.out.println(i++ + ", "); // будем проходить теперь только по четным
           i++;
       }
        System.out.println();

       String str = "Hello!";
       int pos = 0;
       while (pos < str.length()) System.out.println(str.charAt(pos++));

       int input = 0;
       while (input <= 0) {
           Scanner scanner = new Scanner(System.in);
           System.out.println("Введите положительное число: ");
           input = scanner.nextInt();
           scanner.nextLine();
       }

        int num;
        do {
            System.out.println("Введите число больше 0: ");
            Scanner scanner = new Scanner(System.in);
            num = scanner.nextInt();
        } while (num <= 0);

    }
}
