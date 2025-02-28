package lesson_24;


public class CarApp {
    public static void main(String[] args) {
//        int r; // объявлена, но не инициализирована
//        r = 0;
//        System.out.println(r);

        System.out.println(Car.getTotalCars());

        Car bmw = new Car("BMW", 200);
        System.out.println(Car.getTotalCars());
        Car vw = new Car("VW", 300);
        System.out.println(Car.getTotalCars());
//        System.out.println(bmw.getTotalCars());
        // Обращение к статике от имени конкретного объекта это плохая практика

    }
}