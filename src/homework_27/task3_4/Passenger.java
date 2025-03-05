package homework_27.task3_4;

public class Passenger {
    private static int idCounter = 1000;

    private final int id;
    private String name;

    public Passenger(String name) {
        this.id = ++idCounter;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Passenger: {id: %d, name: %s }", id, name);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
