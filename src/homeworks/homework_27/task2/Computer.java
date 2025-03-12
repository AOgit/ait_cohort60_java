package homeworks.homework_27.task2;

public class Computer {
    private String brand;
    private String model;
    private Processor processor;
    private Memory memory;
    private Storage storage;

    public Computer(String brand, String model, Storage storage) {
        this.brand = brand;
        this.model = model;
        this.setStorage(storage);
        this.processor = new Processor("Celeron", "N-4020", 2.8);
        this.memory = new Memory("Patriot", "Viper Steel", "DDR4", 32);
    }

    public String toString() {
        return "{" +
                "\nbrand='" + brand + '\'' +
                ",\nmodel='" + model + '\'' +
                ",\nprocessor=" + processor +
                ",\nmemory=" + memory +
                ",\nstorage=" + storage +
                "\n}";
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }
}
