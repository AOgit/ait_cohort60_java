package lessons.lesson_42;

import java.util.Arrays;
import java.util.Comparator;

public class ComporatorApp {
    public static void main(String[] args) {
        int[] ints = new int[] {9, 5, 1, 2, 4, 11, 0};
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));

        Car[] cars = new Car[6];
        cars[0] = new Car("Alfa", 2021, 120);
        cars[1] = new Car("BMW", 2000, 190);
        cars[2] = new Car("Citroen", 2018, 190);
        cars[3] = new Car("VW", 2021, 250);
        cars[4] = new Car("Ferrari", 2025, 300);
        cars[5] = new Car("Ferrari", 2025, Integer.MIN_VALUE);

//      System.out.println(Arrays.toString(cars));
        printCars(cars);
        Arrays.sort(cars);
        // Интерфейс Comparable<T> (с англ. Сравнимый) естественный порядок сортировки объектов для большинства случаев
        // Интерфейс Comparator<T> можно создать множество порядков сортировки
        printCars(cars);

        CarSpeedComparator speedComparator = new CarSpeedComparator();
        Arrays.sort(cars, speedComparator);
        printCars(cars);

        Arrays.sort(cars, new CarModelComparator());
        printCars(cars);


       // Анонимный класс - это класс, для создания объекта на лету, без явного объявления нового класса
        // Используются когда необходим одноразовый объект

        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getMaxSpeed() - o2.getMaxSpeed();
            }
        });

        printCars(cars);

        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                int yearCompare = c1.getYear() - c2.getYear();
                if (yearCompare != 0) return yearCompare;

                // если годы машин равны, делаем обратный порядок сортировки по модели
                return c2.getModel().compareTo(c1.getModel());
            }
        });

        printCars(cars);

        // Функциональный интерфейс - это интерфейс, который имеет РОВНО ОДИН абстрактный метод.
        // Интерфейс Comparator - функциональный интерфейс

        // Лямбда-выражения - это краткий способ реализаций анонимных функций (методов) в Java
        // Компактный синтаксис для реализации методов функциональных интерфейсов
        /*
         (parameters) -> experssion
        или
         (parameters) -> {statements;}
         */
        // Лямбда-выражения во многих случаях могут заменить анонимные классы и реализовывать
        // на лету функциональные интерфейсы

        // По году в обратном порядке с использованием lambda

         Arrays.sort(cars, (car1, car2) -> car2.getYear() - car1.getYear());
         System.out.println(cars);
         // Отсортировать машини по максимальной скорости в порядке убывания.
         // если скорость совпадает - отсортировать по году - естественный порядок

        Comparator<Car> carComparator = (c1, c2) -> {
            System.out.println(c1.getMaxSpeed() + " | " + c2.getMaxSpeed());
//            int speedCompare = c1.getMaxSpeed() - c2.getMaxSpeed();
            int speedCompare = Integer.compare(c1.getMaxSpeed(), c2.getMaxSpeed());
            System.out.println("c1 - c2: " + speedCompare);
            if (speedCompare == 0) return c1.getYear() - c2.getYear();
            return speedCompare;
        };

        Arrays.sort(cars, carComparator);
        printCars(cars);

        // Comparator - имеет набор статистических и дефолтных методов,
        // облегчающих написание сложных / составных компараторов

        // comparing - позволяет сортировать объекты по ключу
        // Функция-ключ - это способ вытащить из объекта то значение, по которому мы хотим сравнивать два параметра
        /*
            car -> car.getYear();
            Car:: getYear

         */
        // Отсортировать машины по модели в естественном порядке
        Comparator<Car> byModer = Comparator.comparing(car -> car.getModel());
        Arrays.sort(cars, byModer);
        printCars(cars);

        // Ссылка на метод - это сокращенная запись лямбды
        Arrays.sort(cars, Comparator.comparing(Car::getModel));

        // Специальные версии метода для сравнения примитивов. Избежать авто-упаковки/распаковки
        // comparingInt, comparingLong, comparingDouble
        Arrays.sort(cars, Comparator.comparingInt(Car::getYear));

        /*
        Второй параметр метода comparing
        Comparator.naturalOrder() - определяет естественный порядок сортировки
        Comparator.reverseOrder() - определяет обратный порядок сортировки
        Comparator.nullFirst - значения null будут признаны как наименьшие
         */

        // Отсортировать по году выпуску в обратном порядке
        Arrays.sort(cars, Comparator.comparing(Car::getYear, Comparator.reverseOrder()));
        printCars(cars);
     /*   cars[5] = new Car(null, 2021, 250);
//        Arrays.sort(cars, Comparator.comparing(Car::getModel, Comparator.nullsFirst(String::compareTo)));
        Arrays.sort(cars, Comparator.comparing(Car::getModel, Comparator.nullsLast(Comparator.reverseOrder())));
        printCars(cars);
        */

        System.out.println("==========================");
       // Отсортировать оп модели. Если модели равны, то отсортировать по убыванию года выпуска
       Arrays.sort(cars, Comparator.comparing(Car::getModel).thenComparing(Car::getYear, Comparator.reverseOrder()));
       printCars(cars);
        Arrays.sort(cars, Comparator.comparing(Car::getYear).thenComparing(Car::getModel, Comparator.reverseOrder()));
        printCars(cars);

        Arrays.sort(cars, Comparator.comparing(Car::getYear).reversed().thenComparing(Car::getModel));
        printCars(cars);
        Arrays.sort(cars, Comparator.comparing(Car::getYear).reversed().thenComparing(car -> car.getModel()));
        printCars(cars);
        Arrays.sort(cars, Comparator.comparing(Car::getYear, Comparator.reverseOrder()).thenComparing(Car::getModel));
        printCars(cars);
    }

    public static void printCars(Car[] cars) {
        System.out.println("=================");
        for (Car car: cars) {
            System.out.println(car);
        }
        System.out.println("=================");
    }
}
