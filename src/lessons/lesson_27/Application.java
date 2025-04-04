package lessons.lesson_27;

public class Application {

    public static void main(String[] args) {

        BusDriver busDriver = new BusDriver("John", "LN-123412314");
        Autobus bus = new Autobus(busDriver, 15);
        System.out.println(bus);

        BusDriver busDriver1 = new BusDriver("Margo", "AR-23r2f244f");
        bus.setDriver(busDriver1);
        System.out.println(bus);
        bus.showListPassengers();

        System.out.println("\n===================");
        Passenger john = new Passenger("John");
        Passenger mario = new Passenger("Mario");
        Passenger karl = new Passenger("Karl");
        Passenger jane = new Passenger("Jane");

        bus.takePassenger(john);
        bus.takePassenger(mario);
        bus.takePassenger(karl);
        bus.takePassenger(jane);
        bus.takePassenger(mario);

        System.out.println("Кол-во пассажиров: " + bus.getCountPassengers());

    }

}
