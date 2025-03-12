package lessons.lesson_26;

public class TransportApp {
    public static void main(String[] args) {
        Bus bus = new Bus("Bus-X1", 2020, 10);
        System.out.println(bus);
        bus.start();
        bus.stop();

        System.out.println("Bus get model: " + bus.getModel());
        System.out.println("Capacity: " + bus.getCapacity());

        Train train = new Train("Skoda", 2022, 7, 25);
        System.out.println(train);
        train.start();
        train.stop();
        System.out.println("Capacity: " + train.getCapacity());

        System.out.println("\n======================");
        Bus bus2 = new Bus("Bus-x2", 2025, 3);

        System.out.println(bus2.takePassenger());
        System.out.println(bus2.takePassenger());
        System.out.println(bus2.takePassenger());
        System.out.println(bus2.takePassenger());
        System.out.println(bus2.takePassenger());

    }
}
