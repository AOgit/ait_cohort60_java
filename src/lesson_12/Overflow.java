package lesson_12;

public class Overflow {
    public static void main(String[] args) {

        // -128...127
        byte byteVar = 127;
        System.out.println(byteVar);
        // 01111111 -> 11111111 (127 => -128)
//        Когда вы используете операторы ++ или --,
//        Java не выполняет проверку переполнения на уровне этих операций.
//        То есть, она позволяет вам увеличить или уменьшить значение переменной без предупреждения,
//        даже если это приведет к переполнению.

//        byteVar = byteVar + 1; // будет ошибка о переполнении
        byteVar++; // а при декрименте не будет ошибки!

        System.out.println(byteVar);
        byte byteVar1 = -128;
        // 11111111 -> 011111
        byteVar1--;
        System.out.println(byteVar1);
        System.out.println("==============");
        byte num1 = (byte) 0b01111111;
        System.out.println(num1);

        byte num2 = (byte) 0b11111111;
        System.out.println(num2);

        byte num3 = (byte) 0b10000000;
        System.out.println(num3);

        byte num4 = (byte) 0b10000001;
        System.out.println(num4);

        int b = Integer.MAX_VALUE;  // Максимальное значение для типа int
        b = b + 2;  // Переполнение произойдет
        System.out.println(b);  // Выведет -2147483648, т.к. переполнение

    }
}
