package lesson_26;

import java.util.Arrays;

public class StringBuilderExample {

    public static void main(String[] args) {
        String str = "Java" + " " + "is" + " " + "a" + " " + "language";

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", World!");
        System.out.println(sb);

        // Вставить подстроку в указанное место
        sb = new StringBuilder("Hello World");
        sb.insert(6, "beautiful ");
        System.out.println(sb);

        // Заменить подстроку (определяется индексами) на указанное значение
        sb = new StringBuilder("Hello World!");
        sb.replace(6, 11, "Java");
        System.out.println(sb);

        // Удалить подстроку в диапазоне от start (incl) to end (not incl)
        sb = new StringBuilder("Hello World");
        sb.delete(5, 11);
        System.out.println(sb);

        sb = new StringBuilder("Hello World");
        int index = sb.indexOf("W");
        System.out.println(index);

        // Реверс. Разворачивает последовательность символов
        sb = new StringBuilder("Hello World");
        sb.reverse();
        System.out.println(sb);

        // Получить символ по индексу
        sb = new StringBuilder("Hello World!");
        char ch = sb.charAt(3);
        System.out.println(ch);

        // Длина строки
        System.out.println(sb.length());

        // Установка новой длины строки
        sb = new StringBuilder("Hello");
        sb.setLength(10);
        // Если увеличить строку, она будет заполнена char с кодом 0
        System.out.println(sb);
        char ch1 = sb.charAt(8);
        System.out.println((int)ch1);
        sb.setLength(2);
        System.out.println("sb.setLength(2): " + sb.toString());

        // Написать метод, который запрашивает у пользователя строкуБ состоящую из нескльких слов
        // и возвращающий аббревиатуру фразы (научно-исследовательский институт)

        String example = String.join(" ", "Java", "is", "the", "best");
        System.out.println(example);
        String[] words = example.split(" ");
        System.out.println(Arrays.toString(words));
        String str1 = "sdfasdf adsf";
        char[] chars = str1.toCharArray();
        System.out.println(Arrays.toString(chars));
        System.out.println(sb.capacity());
    }

}
