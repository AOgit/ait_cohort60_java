package lessons.lesson_42;

import java.util.Comparator;

public class CarModelComparator implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        return car1.getModel().compareTo(car2.getModel());
    }
}
