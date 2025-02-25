package homework_21;

public class Display {

    String brand;
    int size;
    String resolution;
    int frequency;

    public Display(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }

    public void printSize(){
        System.out.println("Size: " + this.size);
    }
}
