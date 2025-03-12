package homeworks.homework_27.task2;

public class Storage extends Component {
    private final int capacity;
    private String type;

    public Storage(String brand, String model, String type, int capacity) {
        super(brand, model);
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public String toString() {
        return "Storage{" +
                "capacity=" + capacity +
                ", type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
