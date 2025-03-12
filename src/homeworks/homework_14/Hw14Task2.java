package homeworks.homework_14;

public class Hw14Task2 {
    public static void main(String[] args) {

//        Task 2
//        Создайте две переменные типа int.
//
//                В первую переменную запишите случайное значение от 0 до 50.
//        Во вторую переменную случайное значение от 0 до 100.
//        (опционально) Во вторую переменную случайное значение от -20 до 30.
//        Проверьте:
//        равны ли переменные,
//                не равны ли они,
//                больше ли a, чем b,
//                и меньше ли b, чем a.
//                Выведите результат на экран.

        int a = (int)(Math.random() * 50);
        int b = (int)(Math.random() * 100);
//        b = -20 + a;
//        b = (int)(Math.random() * -20) + (int)(Math.random() * 30);
        System.out.printf("a: %d, b: %d\n", a, b);
        System.out.println("a == b " + (a == b));
        System.out.println("a != b " + (a != b));
        System.out.println("a > b " + (a > b));
        System.out.println("b < a " + (b < a));

    }
}
