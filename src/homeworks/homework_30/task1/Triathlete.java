package homeworks.homework_30.task1;

public class Triathlete implements Runner, Swimmer{

    @Override
    public void run() {
        System.out.println("Триатлет бежит");
    }

    @Override
    public void swim() {
        System.out.println("Триатлет плывет");
    }
}
