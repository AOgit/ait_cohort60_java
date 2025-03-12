package lessons.lesson_28.animals;

public class ZooApp {
    public static void main(String[] args) {

        Cat cat = new Cat();

        cat.voice(); // Унаследован от Animal
        System.out.println(cat.toString());

        cat.eat(); // Метод класса Cat

        Dog dog = new Dog();
        dog.voice(); // Если в потомке не переопределен метод,
        // будет вызвана реализация метода родителя

        Hamster hamster = new Hamster();
        hamster.voice();
        System.out.println(hamster.toString());

        Object object = new Object();


    }
}
