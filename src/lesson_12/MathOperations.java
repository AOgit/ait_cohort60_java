package lesson_12;

public class MathOperations {
    public static void main(String[] args) {
        int var1 = 20;
        int var2 = 7;

        int result;

        // сложение
        result = 15 + 6;
        System.out.println(result);

        result = var1 + var2;
        System.out.println(result);

        // Целочисленное деление / (остаток отбрасывается)
        result = var1 / var2;
        System.out.println("var1 / var2: " + result);

        double resDouble = var1 / var2;
        System.out.println("resDouble: " + resDouble);

        // Остаток от деления %
        System.out.println("var1 % var2: " + (var1 % var2));

        double doubleVar = 20.0;
        double doubleVar2 = 7.0d;
        double doubleResult = doubleVar / doubleVar2;
        System.out.println("doubleRes = " + doubleResult);


    }

}
