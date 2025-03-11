package lesson_31.generics;

// Мы создаем универсальный класс. И не указываем конкретный тип данных, с которым он работает
// Мы не хотим определять тип данных при создании каждого объекта
// Дженерики работают только со ссылочными типами данных и
// не работают с примитивными типами

public class GenericBox <T> { // символ заполнитель T - type, E - element, К,V - key, value
    // <T> - означает, что вместо Т при создании объекта будет подставлен конкретный тип данных
    private T value;

    public GenericBox (T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericBox{" +
                "value=" + value +
                '}';
    }
}
