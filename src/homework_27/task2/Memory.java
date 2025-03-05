package homework_27.task2;

public class Memory extends Component {
    private final int capacity;
    private String type;

    public Memory(String brand, String model, String type, int capacity) {
        super(brand, model);
        this.capacity = capacity;
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public String toString() {
        return "Memory{" +
                "capacity=" + capacity +
                ", type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
