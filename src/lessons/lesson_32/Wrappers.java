package lessons.lesson_32;

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
        // .valueOf() - преобразует явным образом примитив или строку в объект типа обертки

        Integer e = Integer.valueOf(127);
        Integer e1 = Integer.valueOf("127");

        System.out.println(e + " | " + e1);
        Double dbl = Double.valueOf(154);
        System.out.println("dbl: " + dbl);

        // parseXXX() - преобразует строку в соответствующий примитив

        double dblP = Double.parseDouble("456");
        Double dblV = Double.valueOf("456");
        System.out.println(dblP + " | " + dblV);

        // toString - переопределяет метод, который возвращает строковое представление числа
        // equals - сравнивает два объекта по значению

        Integer i1 = 127;
        Integer i2 = 256;

        System.out.println(i1 > i2);

        // compareTo - сравнивает текущий объект с другим объектом. Кто больше?
        // Возвращаемое значение int
        System.out.println(i1.compareTo(i2));
        // i1 > i2 вернет 1
        // i1 < i2 вернет -1
        // i1 == i2 вернет 0

        System.out.println("\n======================");
        // xxxValue() - возвращает значение объекта как примитивный тип
        Double d2 = 125.67; // Автоупаковка
        d2 = Double.valueOf(125.67); // Явная принудительная упаковка
        double dPrimitive = d2; // Автораспаковка
        dPrimitive = d2.doubleValue(); // Явная принудительная распаковка

        System.out.println("\n======================");
        // Абстрактный класс Number. Все числовые обертки наследуются от абстрактного класса Number
        // Byte, Short, Integer, Long, Float, Double

        // byteValue(), shortValue(), intValue(), longValue(), floatValue(), doubleValue()

        Integer integer = 31844;
        double dVal = integer.doubleValue();
        System.out.println(dVal);
        System.out.println(integer.floatValue());

        Double dWrapper = 245.78;
        int iVal = dWrapper.intValue();
        System.out.println(iVal);

        System.out.println(dWrapper.byteValue());
        System.out.println(dWrapper.intValue());

    }

}
