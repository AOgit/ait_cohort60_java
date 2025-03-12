package homeworks.homework_28.task2;

public class App {
    public static void main(String[] args) {
        Vehicle[] vehicles = { new Car(), new Bycicle(), new Motorcycle()};
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].startEngine();
        }
    }
}
