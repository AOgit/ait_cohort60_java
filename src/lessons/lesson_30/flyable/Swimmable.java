package lessons.lesson_30.flyable;

public interface Swimmable {
    void swim();

    default void methodA(){
        System.out.println("default methodA in Swimmable");
    }
}
