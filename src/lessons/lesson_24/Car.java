package lessons.lesson_24;

public class Car {
    private String model;
    private int power;
    private static int totalCars;
//
//  Cтатическая переменная в Java получит значение по умолчанию,
//  даже если объект этого класса не был создан.
//  Статические переменные инициализируются при первом обращении к классу
//  или его статическим членам (методам и переменным),
//  а не при создании экземпляра объекта.
    public Car(String model, int power) {
        this.model = model;
        this.power = power;
        totalCars++; // При создании нового объекта увеличиваем кол-во созданных авто
    }

    public static int getTotalCars() {
        return totalCars;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
