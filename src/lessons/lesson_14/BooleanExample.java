package lessons.lesson_14;

public class BooleanExample {
    public static void main(String[] args) {
        boolean bol1 = true;
        bol1 = false;

        System.out.println(bol1);
        int x = 10;
        int y = 5;

        boolean b1 = x == y; // X равен Y -> 10 равно 5 -> false
        System.out.printf("%s == %s -> %s\n", x, y, b1);

        b1 = x != y; // Х не равно Y -> 10 не равно 5 -> true
        System.out.println(b1);

        int a = 10;
        int b = 0;
        boolean bol = (b != 0) && (a / b > 2);
        System.out.println("bol: " + bol);

       // ! & ^ | && || - приоритет логических операций
        System.out.println(true ^ true & false);
        System.out.println(true ^ false);
        System.out.println(true);
        System.out.println();

        System.out.println(true ^ true && false);
        System.out.println(false && false);
        System.out.println(false);
        System.out.println();

    }
}
