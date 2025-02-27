package lesson_23.testProtected;

import lesson_23.Cat;

public class Lesson23Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Catty", 8, 5);
        cat.sayMeow();
        System.out.println(cat.toString());
        // не будет работать
//        cat.isProtected = true; // только в наследниках классах и в одном пакете
//        cat.isDefault = false; // только в наследниках классах и в одном пакете
    }
}
