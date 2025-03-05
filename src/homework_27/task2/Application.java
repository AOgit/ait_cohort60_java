package homework_27.task2;

public class Application {
    public static void main(String[] args) {
        Storage storage = new Storage("Gnusmas", "T7", "SSD", 512);
        Computer computer = new Computer("Dell", "P135-G", storage);
        System.out.println(computer);
    }
}
