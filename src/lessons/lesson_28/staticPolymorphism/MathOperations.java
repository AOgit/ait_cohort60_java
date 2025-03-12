package lessons.lesson_28.staticPolymorphism;

// В Java полиморфизм проявляется в двух формах:

// Статический (компиляционный) полиморфизм
// - реализуется с помощью перегрузки методов (Method Overloading)

// Динамический (исполнительный) полиморфизм
// - реализуется через переопределение методов (Method Overriding)

// Переопределение методов позволяет наследникам изменять поведение методов родительского класса
// Переопределение методов происходит когда наследник (подкласс)
// предоставляет специфическую реализацию метода,
// который уже определен у родителя (супер классе)

public class MathOperations {

    static int sum(int a, int b) {
        return a + b;
    }

    static  double sum(double a, double b) {
        return a + b;
    }

    static  double sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        System.out.println(sum(1.0, 2));
    }
}
