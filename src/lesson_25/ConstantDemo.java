package lesson_25;
// В Java  константа - переменная, изменить которую не может НИ ОДИН объект класса в котором она находится
// Такая переменная создается и инициализируется один раз для всех экземпляров класса
// В Java константой НЕ считается переменная, которую нельзя изменить в рамках одного объекта
// но которая будет иметь отличное значение в другом объекте класса

// static + final позволяет достигнуть эффекта константы
public class ConstantDemo {
    public static final double PI = 3.141519; // Константа

    // Не является константой, так как состояние объекта
    // (значение в массиве) можно изменить
    public static final int[] ints = new int[5];
    public static final String COUNTRY = "Germany"; // Константа, т.к. невозможно изменить значение
    public static final String[] COLORS = {"blue", "red", "green"}; // не константа, можно изменять значение элементов

    public ConstantDemo() {
        COLORS[0] = "purple"; // COLORS - не константа
//        COUNTRY = "USA"; // Константа, не могу изменить

    }

    public static double doublePiSqrt() {
        double result = 2 * PI * PI;
        return result;
    }

}
