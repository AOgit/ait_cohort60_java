package lesson_11;

public class Variables {

    public static void main(String[] args) {

        // Объявление (декларация) переменной типа int
        int myFirstVariable;

        // инициализация переменной - первое присвоение значения
        myFirstVariable = 1;
        // Объявление вместе с инициализацией
        int mySecondVariable = 2;

        boolean trueFalse = false;

        // любое целое число воспринимается компилятором как число в формате int
        // long longVar = 2_4432_342_23;
        // L в конце числа - сказать компилятору, что число в формате long
        long longVar1 = 2_4432_342_23L;
        double doubleVar = 10.5421;
        float floatVar = 124.535F;
        System.out.println("Summ: " + (myFirstVariable + mySecondVariable) + " " + trueFalse);

    }

}
