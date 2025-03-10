package lesson_30.interfaces;

public class Journal implements Printable {
    private String name;
    private int number;

    public Journal(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public void print() {
        System.out.printf("Journal %s #%d\n", name, number);
    }

    @Override
    public void defaultMethod() {
        System.out.println("Overridding default method");
    }
}
