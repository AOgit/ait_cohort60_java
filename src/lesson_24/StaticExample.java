package lesson_24;

// Статические члены класса имеют доступ (видят) ТОЛЬКО статический контент

import java.util.Arrays;

public class StaticExample {

    // non-static класса
    int x;
    static int staticY;

    public static void main(String[] args) {
//       x = 10; // Ошибка компиляции
        staticY = 10;
        StaticExample staticExample = new StaticExample();
        staticExample.nonStaticMethod();
        System.out.println(StaticExample.staticY);
        StaticExample.staticMethod();
        System.out.println(StaticExample.staticY);
//        Arrays.toString(); // утилитные классы имеют статические методы
        int sum = MathUtil.sumIntegers(1, 2, 45, 6, 9, 10);
        System.out.println(sum);
    }

    public static void staticMethod() {
        // Статические методы видят ТОЛЬКО статические члены (поля и методы) класса:
        // x++; нет доступа к не-статическому полю
        staticY++; // доступ к статическому полю есть
        // Можем вызывать ТОЛЬКО статические методы
        // nonStaticMethod();
        // ключевое слово this недоступно в статических методах
    }
    public void nonStaticMethod(){
        // У нестатического метода есть доступ КО ВСЕМ членам класса
        x++;
        staticY++;
    }
}
