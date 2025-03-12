package lessons.lesson_15;

import java.util.Random;

public class SwitchExample {
    public static void main(String[] args) {

//        Scanner scanner= new Scanner(System.in);
//        System.out.println("Введите число от 1 до 4");
//        int input = scanner.nextInt();
//        scanner.nextLine();
//
//        switch (input) {
//            case 1:
//                System.out.println("Вы ввели один");
//            case 2:
//                System.out.println("Вы ввели два");
//            case 3:
//            case 4:
//                System.out.println("Вы ввели три или четыре");
//            default:
//                System.out.println("Я не знаю таких чисел");
//        }
//
//        System.out.println("================\n");
//
//       String result = switch (input) {
//            case 1 -> "Вы ввели один";
//            case 2 -> "Вы ввели два";
//            case 3,4 -> "Вы ввели три или четыре";
//           default -> "Я таких чисел не знаю";
//       };
//        System.out.println("result: " + result);


        Random random = new Random();
//        int note = random.nextInt(5) + 1;
        int note = random.nextInt(1,6);
        System.out.println("Ребенок получил оценку: " + note);
        int money = 100;

//        switch (note) {
//            case 5:
//                money += 20;
//                break;
//            case 4:
//                money += 10;
//                break;
//            case 3:
//                money += 0;
//                break;
//            case 2:
//                money += -20;
//                break;
//            case 1:
//                money = 0;
//                break;
//            default:
//                System.out.println("Нет таких оценок");
//        }
//
//        System.out.println("У ребенка в наличии денег: " + money);

        money += switch (note) {
            case 5 -> 20;
            case 4 -> 10;
            case 2 -> -20;
            case 1 -> -money;
            default -> 0;
        };
        System.out.println(money);


    }
}
