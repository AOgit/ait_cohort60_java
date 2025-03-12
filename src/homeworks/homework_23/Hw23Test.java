package homeworks.homework_23;

import java.util.Arrays;

public class Hw23Test {
    public static void main(String[] args) {
        Employee employee = new Employee("Василий", 35);
        employee.info();
        employee.setSalary(5750);
        employee.info();

        MagicArray magic = new MagicArray();
        magic.add(3, 4, 5, 2, 1);
        magic.test();
        System.out.println(magic.toString());
        System.out.println(Arrays.toString(magic.toArray()));
    }
}
