package lessons.lesson_28.animals;

public class Dog extends Animal{

//    под капотом в результате наследования получается такое поведение
//    @Override
//    public void voice() {
//        // обращение к объекту родителя и вызов реализации его метода
//        super.voice();
//    }

    @Override
    public String toString() {
        return super.toString() + " | Dog. Дополнение к возврату от родительского класса";
    }

    public void bark() {
        System.out.println("Собака гавкает");
    }
}
