package homeworks.homework_25;

public class Calculator {

    public static final double PI = 3.141592653589793;

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
//        return num2 == 0 ? Integer.MIN_VALUE : num1 / num2;
//        num1 / 0 == Double.POSITIVE_INFINITY;
       return num1 / num2;
    }

    public static double circumference(double radius) {
        return 2 * PI * radius;
    }

    public static double circleArea(double radius) {
        return  PI * Math.pow(radius,2);
    }


}
