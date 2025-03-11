package lesson_31.generics;

public class Wrappers {
    // Классы-обертки используются для представления
    // примитивных типов как объектов (как ссылочных)
    // byte, short, int, long, float, double, char, boolean
    // Обертки Byte, Short, Integer, Long, Float, Double, Character, Boolean
    public static void main(String[] args) {
        Integer maxValue = Integer.MAX_VALUE;
        System.out.println("max: " + maxValue);
        Integer minValue = Integer.MIN_VALUE;
        System.out.println("min: " + minValue);

        // Поддержка null
//        int x = null; // ошибка. Примитив null не поддерживает

        // Приведение типов. Автоупаковка и автораспаковка
        Integer wrapperInt = 5; // Автоупаковка примитива в ссылочный тип Integer
        System.out.println(wrapperInt);

        int primitiveInt = wrapperInt; // Автораспаковка Integer в примитив int
        System.out.println(primitiveInt);

        System.out.println("\n=========================");

        // Сравнение объектов по значению -> следует использовать метод equals
        // - 128 ... 127 - Кэширование

        Integer a = 127; // Создан объект с адресом в памяти @2342w
        Integer b = 127; // Здесь объект с таким значение уже есть и новый не создается
        System.out.println("127 == 127: " + (a == b)); // true
        System.out.println("a.equals(b) 127 == 127: " + (a.equals(b))); // true

        Integer c = 128; // здесь уже кэширование не работает, наличие объекта не проверяется
        Integer d = 128; // создается новый объект в памяти

        System.out.println("128 == 128: " + (c == d)); // false
        System.out.println("a.equals(b) 128 == 128: " + (c.equals(d))); // false

        System.out.println("\n============================");

        // Общие (или схожие) методы, которыми обладают классы-обертки

    }

}
