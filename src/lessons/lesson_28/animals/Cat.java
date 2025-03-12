package lessons.lesson_28.animals;

public class Cat extends Animal {

    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override // Аннотация указывает, что метод переопределяет родительский метод
    public void voice() {
        System.out.println("Cat says MEOW!");
    }

    @Override
    public String toString() {
        return super.toString() + " | Возврат toString кота ";
    }

}
