package homework_24;

public class Calculator {

    public static double addition(double num1, double num2) {
       return num1 + num2;
    }

    public static double subtraction(double num1, double num2){
        return num1 - num2;
    }

    public static double multiplication(double num1, double num2){
        return num1 * num2;
    }

    public static double division(double num1, double num2){
       return num2 == 0 ? -2_147_483_647 : num1 / num2;
    }
}
