package lessons.lesson_15;

import java.util.Random;

public class IfExample {
    public static void main(String[] args) {

       int age = 20;
       if (age > 11) System.out.println("Вы совершеннолетний");

        System.out.println("Продолжение программы");

        if (age > 11) {
            System.out.println("Блок IF");
            System.out.println("Вы уже не ребенок");
        } else {
            System.out.println("Блок ELSE");
            System.out.println("Сейчас age =" + age);
        }

        System.out.println("==============================");

        Random rand = new Random();
        int score = rand.nextInt(101);
        if (score >= 90)
            System.out.println("Супер! " + score);
        else if (score >= 75)
            System.out.println("Хорошо " + score);
        else if (score >= 50)
            System.out.println("Удовлетворительно " + score);
        else
            System.out.println("Плохо! " + score);

    }
}
