package homework_12;

import java.util.Locale;

public class Hw12Task3 {
    public static void main(String[] args) {
//        Task 3
//        Задекларировать (объявить) и присвоить значения 3-м переменным.
//        Правильно подберите тип и имя переменным.
//        Переменная 1 - сколько Вам полных лет
//        Переменная 2 - должна хранить стоимость 1 литра молока в Вашей стране (без наименования валюты - только цена)
//        Переменная 3 - Ваше имя.
//                Используя форматированный вывод выведите в консоль строку вида:
//        Привет! Меня зовут Сергей, мне 18 лет. Я покупаю молоко по 1.50 за литр.

        byte age = 41;
        float milkPrice = 1.5f;
        String name = "Oleksandr";
        System.out.printf(Locale.US, "Привет! Меня зовут %s, мне %d лет. Я покупаю молоко по %.2f за литр.\n", name, age, milkPrice);
    }
}
