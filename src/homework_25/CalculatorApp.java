package homework_25;

public class CalculatorApp {
    public static void main(String[] args) {
        System.out.println(Calculator.division(1, 0));
        System.out.println(Calculator.subtraction(5, 1));

        System.out.printf("Число π: %f\n", Calculator.PI);
        System.out.println(Calculator.circumference(4));
        System.out.println(Calculator.circleArea(4));
    }
}
