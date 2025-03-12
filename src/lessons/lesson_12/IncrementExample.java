package lessons.lesson_12;

public class IncrementExample {
    public static void main(String[] args) {

        int x = 5;
        x = x + 10;

        x += 5; // x = x + 5
        System.out.println(x);

        x -= 2;
        x *= 5;
        x /= 2;
        System.out.println(x);

        x++;
        System.out.println(x);

        x--;
        System.out.println(x);

        /*
        Инкремент и декремент можно писать по разному:
        после переменной х++, х-- (постфикс)
        перед переменной ++х, --х (префикс)

        Если запись постфикс (х++), то сначала используется текущее значение переменной,
        а потом оно будет увеличено
         */
        int var = 100;
        System.out.println(var++);
        System.out.println(var);

        int y = 100;
        System.out.println(++var);
        System.out.println(var);
    }





}
