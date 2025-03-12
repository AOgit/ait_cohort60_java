package lessons.lesson_26;

// extends - наследование. Bus наследуется от Vehicle
// Smartphone is-a Vehicle -> Не верно. Применять наследование нельзя
// Bus is-a Vehicle - верно. Можно применить наследование
public class Bus extends Vehicle {

    private  int capacity;
    private  int countPassengers;

    public Bus(String model, int year, int capacity) {
        // нужно сначала создать объект родителя
        // Если в конструкторе потомке нет явного вызова конструктора-родителя,
        // то автоматически будет вызван пустой конструктор родителя
        super(model, year);
//          вызов родительского конструктора должен быть первой строчкой исполняемого кода
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }
    public boolean takePassenger() {
        if(countPassengers < capacity) {
            countPassengers++;
            // имею доступ в наследнике к полю родителя с модификатором protected
//            System.out.println("Пассажир зашел в автобус: " + this.model);
            // иначе стоит воспользоваться геттером/сеттером
            System.out.println("Пассажир зашел в автобус: " + this.getModel());
            return true;
        }
        System.out.printf("В автобусе %s больше мест нет. Сейчас %d пассажиров\n", model, countPassengers);
        return false;
    }
}
