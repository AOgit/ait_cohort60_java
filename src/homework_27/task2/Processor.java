package homework_27.task2;

public class Processor extends Component {
    private double maxFrequency;

    public Processor(String brand, String model, double frequency) {
        super(brand, model);
        this.maxFrequency = frequency;
    }

    public double getMaxFrequency() {
        return maxFrequency;
    }

    public void setMaxFrequency(double maxFrequency) {
        this.maxFrequency = maxFrequency > 0 ? maxFrequency : 0;
    }

    public String toString() {
        return "Processor{" +
                "maxFrequency=" + maxFrequency +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
