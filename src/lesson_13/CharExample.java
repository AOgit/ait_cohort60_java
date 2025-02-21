package lesson_13;

public class CharExample {
    public static void main(String[] args) {

        char a = 'A'; // Переменная будет хранить буква А латинского алфавита
        char a1 = 65; // То же самое: символ соответствует коду 65 в десятичной символьной системе
        char a2 = 0x41; // То же самое: символ в 16-формате
        char a3 = '\u0041'; // Еще один способ задать код в 16-формате

        System.out.println(a);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println("=========================");
        char letter = 'A';
        letter++;
        System.out.println(letter);

        char digit = 48;
        System.out.println(digit); // код 48 соответствует символу "0"
        digit +=5;
        System.out.println(digit); // код 53 соответствует символу "5"
        digit = (char)( digit + 5);

        char x1 = 12341;
        System.out.println(x1);
        // Чтобы получить код символа в 10 СС нужно привести тип char к типу integer
        System.out.printf("10 код символа %c: %d\n", digit, (int)digit);
        // Преобразование в int
        System.out.println((int)digit);
        // Просто добавив ноль
        System.out.println(digit + 0);
    }
}
