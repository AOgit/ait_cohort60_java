package lessons.lesson_13;

public class StringExample {
    public static void main(String[] args) {
        // Обьявление и инициализация переменной типа String
        String greeting = "Hello, World";
        String string1 = new String(("Hello, World"));
        System.out.println(greeting);
        System.out.println(string1);

        int length = greeting.length(); // Вызов метода length()
        System.out.println(length + " символов");
        System.out.println("Hello".length() + " символов");
        System.out.println("\n==============================\n");
        // Различные варианты конкатенации строк
        String str1 = "One";
        String str2 = " ";
        String str3 = "Hello";
        String concatStr = str1 + str2 + str3;
        System.out.println(concatStr);
        System.out.println(1 + 3 + " : " + 2 + 3);
        System.out.println(1 + 3 + " : " + (2 + 3));

        // Конкатенация 2
        String concatStr2 = str1.concat(str2).concat(str3).concat("!!!!");
        System.out.println("concatStr2: " + concatStr2);

        // Конкатенация 3 с одинаковым разделителем
        String concatStr5 = String.join(" ", "Hello", "World", "Test");
        System.out.println("concatStr5: " + concatStr5);

        int a = 1;
        int b = 2;
        String str = "Сумма а + b = " + a + b;
        System.out.println(str);

        String str4 = "Сумма а + b = " + (a + b);
        System.out.println(str4);

        String digits = "0123456789";
        System.out.println("digits.lenght(): " + digits.length());
        char symbol = digits.charAt(4); // Взять символ под индексом 4 (возврат тип char)
        System.out.println(symbol);
        char first = digits.charAt(0);
        char last = digits.charAt(digits.length() - 1);
        System.out.println("first: " + first + " last: " + last);

        // Выделение подстроки
        String subString = digits.substring(2);
        System.out.println("subString(2): " + subString);

        String subString2 = digits.substring(2, 7); // с индекса 2 включительно по индекс 7 НЕ включительно
        System.out.println(subString2);
        // Замена частей строки
        // replace(), replaceFirst(), replaceAll()
        String string = "One World One";
        String newString = string.replace("One", "two");
        System.out.println(newString);
        String replFirst = string.replaceFirst("One", "two");
        System.out.println(replFirst);

        String replStr = string.replaceAll("(?i)one$", "two");
        System.out.println(replStr);

    }
}
