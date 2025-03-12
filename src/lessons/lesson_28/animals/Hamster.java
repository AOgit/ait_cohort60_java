package lessons.lesson_28.animals;

public class Hamster extends Animal {

    // Ничего не переопределяем - получаем реализацию всех родительских методов

    @Override
    public String toString() {
        return "Hamster!";
    }
}
