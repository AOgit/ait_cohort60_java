package lessons.lesson_23;

public class CatApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Catty", 8, 5);
        cat.sayMeow();
        System.out.println(cat.toString());
//        System.out.println(cat.age);
//        cat.age = -1000;
//        cat.weight = 1500;
        System.out.println(cat.toString());
//        cat.name = null;
        System.out.println(cat.toString());
        cat.testMethod();
        System.out.println(cat.getAge());
        System.out.println("Вес: " + cat.getWeight());
        cat.setAge(15);
        System.out.println(cat.toString());
        cat.setAge(-10);
        System.out.println(cat.toString());
        cat.setWeight(15);
        System.out.println(cat.toString());
        cat.setWeight(150);
        System.out.println(cat.toString());
        cat.setWeight(-150);
        System.out.println(cat.toString());
        cat.isProtected = true; // в одном пакете и в наследниках класса
        cat.isDefault = false; // видны везде, но только в одном пакете

    }
}
