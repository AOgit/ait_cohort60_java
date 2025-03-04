package lesson_26;

public class Vehicle {
    protected String model;
    private int year;

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }
//
//    public Vehicle(){
//
//    }

    public String toString() {
        return model + ", year of manufacture: " + year;
    }

    public void start(){
        System.out.println(this.model + " начинает движение");
    }

    public void stop(){
        System.out.println(this.model + " останавливается");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

}
