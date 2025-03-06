package homework_27.task3_4;

public class Application {

    public static void main(String[] args) {
        BusDriver busDriver = new BusDriver("John", "LN-123412314");
        Autobus bus = new Autobus(busDriver, 7);
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
        // TODO Task 3
        System.out.println("\n=============");
        System.out.println(bus);
        // TODO Task 4
        bus.dropPassenger(john);
        Passenger max = new Passenger("Max");
        bus.dropPassenger(max);

    }

}
