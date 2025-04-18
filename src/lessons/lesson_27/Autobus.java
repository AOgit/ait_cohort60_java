package lessons.lesson_27;

// Автобус содержит Водителя. HAS-A. Агрегация. Водитель может существовать отдельно от автобуса.

// Автобус содержит Автопилот. HAS-A. Композиция. Автопилот является неотъемлемой частью автобуса.
// Жесткая/неразрывная связь

// Важные аспекты ассоциации.
// Направленность. Ассоциация может быть однонаправленная или двунаправленная
// Автобус знает о водителе, водитель ничего не знает о автобусе (Однонаправленная)
// Кардинальность связи. Сколько объектов одного класса может быть ассоциировано с объектами другого
// One-to-One , One-to-Many, Many-to-many
// 1:1 -> Автобус и двигатель
// 1:Many Автобус и пассажиры. В автобусе много пассажиров, один пассажир только в одном автобусе
// Many:Many  Автобусы и автобусные остановки. Разные автобусы на разных остановках

public class Autobus {

    private static int counter = 1;
    private final int id;

    private BusDriver driver; // агрегация (мягкая связь). Объект приходит снаружи. Может существовать отдельно
    private Autopilot autopilot; // композиция (жесткая связь) создаем объект в конструкторе

    private final int capacity;
    private int countPassengers;

    private final Passenger[] passengers;

    public Autobus(BusDriver driver, int capacity) {
        this.id = counter++;
        this.driver = driver;
        this.capacity = capacity;
        this.autopilot = new Autopilot("AP-v0001");
        this.passengers = new Passenger[capacity];

    }

    public String toString() {
        return "Autobus{" +
                "id=" + id +
                ", driver=" + driver +
                ", autopilot=" + autopilot +
                ", capacity=" + capacity +
                '}';
    }

    public void showListPassengers() {
        if (countPassengers == 0) {
            System.out.println("[]");
            return;
        }
//        System.out.println(Arrays.toString(passengers));
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < countPassengers; i++) {
            sb.append(passengers[i].toString());
            sb.append((i < countPassengers) ? ", " : "");
        }
//        sb.append("]");
        System.out.println(sb);
    }

    public boolean takePassenger(Passenger passenger) {
        if (passenger == null) return false;
        /*
        1. Проверить свободное место
        2. Проверить находится ли пассажир УЖЕ в автобусе
        3. Садим на борт:
            - добавляем в список пассажиров
            - увеличиваем кол-во пассажиров
            - возвращаем true
        4. Если что-то пошло не так возвращаем false
         */
//        if (countPassengers < capacity && isPassengerInBus(passenger)) {
//            passengers[countPassengers++] = passenger;
//            return true;
//        }
        if (countPassengers < capacity) {
            if (isPassengerInBus(passenger)) {
                System.out.printf("Пассажир с id %d уже в автобусе с id %d\n", passenger.getId(), this.getId());
                return false;
            }
            passengers[countPassengers] = passenger;
            countPassengers++;
            System.out.printf("Пассажир с id %d завершил посадку в автобус с id %d\n", passenger.getId(), this.getId());
            return true;
        }
        System.out.printf("В автобусе с id %d мест нет\n", this.getId());
        return false;
    }

    private boolean isPassengerInBus(Passenger passenger) {
        for (int i = 0; i < countPassengers; i++) {
            if (this.passengers[i].getId() == passenger.getId()) return true;
        }
        return false;
    }

    public void setDriver(BusDriver driver) {
        this.driver = driver;
    }

    public int getId() {
        return id;
    }

    public BusDriver getDriver() {
        return driver;
    }

    public Autopilot getAutopilot() {
        return autopilot;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }
}
