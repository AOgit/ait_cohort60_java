package lessons.lesson_43;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        //Интерфейс Collection гарантирует наличие базовых методов для всех расширяющих его интерфейсов
        // List, Queue, Set
        // Это позволяет нам единообразно обрабатывать различные типы коллекций

        // Создаем коллекцию строк
        // Ссылка типа интерфейс -> набор доступных методов + ссылку на объект какого класса
        // может хранить эта переменная
        // Справа мы можем подставить объекты разных классов (получить разные реализации этого интерфейса)

        Collection<String> strings = new HashSet<>();
        strings = new ArrayList<>();
        // int size() - возвращает кол-во элементов в коллекции в любой реализации
        // так как этот метод объявлен в родительской Collection
        System.out.println("strings.size(): " + strings.size());

        // boolean isEmpty() - возвращает true, если коллекция пуста
        System.out.println("strings.isEmpty(): " + strings.isEmpty());

        //boolean add(T t) - добавление элемента в коллекцию
        strings.add("Java");
        System.out.println("strings.add(\"Python\"): " + strings.add("Python"));

        // Переопределенный метод toString для красивого вывода элементов коллекции
        System.out.println(strings);

        // Статический метод .of() - метод в нескольких (почти во всех) интерфейсах и классах JFC
        // Был введен в Java 9 (SDK 9 и выше)
        // Создает неизменяемую коллекцию (нельзя удалить или добавить элемент) из предоставленных элементов
        // Доступен для List, Set, Map

        Collection<Integer> integers = List.of(0, 1, 2, 3, 4, 5, 6, 7);
        System.out.println(integers);
        // попытка модифицировать неизменяемую коллекцию
//        System.out.println("Попытка добавить элемент: " + integers.add(7));
        // Приведет к ошибке (Исключительная ситуация)

        // Методы addAll, removeAll, retainAll - это программная реализация
        // операций над множествами в математике

       // addAll(Collection<? extends T> col) - добавит все элементы из указанной коллекции
       strings.addAll(List.of("JS", "Go Land", "Ruby", "Kotlin"));
       System.out.println(strings);
       System.out.println("===========================\n");

       // removeAll(Collection<?> colB) - удаляет все элементы содержащиеся в коллекции colB из
        // коллекции на которой вызван метод
        // colA.removeAll(colB) - Удаляет из A все элементы, которые содержит кол B (Вычитание)
        Collection<Integer> colA = new ArrayList<>();
        colA.addAll(List.of(0, 1, 2, 3, 4, 5, 3, 2));
        System.out.println("colA:" + colA);
        colA.removeAll(List.of(3, 2, 1));
        System.out.println("colA.removeAll(List.of(3, 2, 1)): " + colA);

        // Пересечение
        // retainAll(Collection<?> colB) - Оставляет в коллекции вызова только те элементы,
        // которые содержаться в другой коллекции (если были повторяющиеся элементы - они останутся)
        // colA.retainAll(colB)

        colA = new ArrayList<>();
        Collection<Integer> colB = new ArrayList<>();
        colA.addAll(List.of(10, 20, 30, 40, 50, 60, 20));
        colB.addAll(List.of(20, 30, 40, 100));
        System.out.println("ColA: " + colA);
        System.out.println("ColB: " + colB);
//        colA.retainAll(colB);
//        System.out.println("colA.retainAll(colB): " + colA); // [20, 30, 40, 20] // повторяющиеся 20 остаются
        colB.retainAll(colA);
        System.out.println("colB.retainAll(colA): " + colB); // [20, 30, 40] в коллекции colB только одна 20

        // boolean containsAll(Collection<?> c): возвращает true, если все значения содержаться
        System.out.println("colA.containsAll(List.of(20, 30))" + colA.containsAll(List.of(20, 30)));

        // boolean remove(Object obj) - удаляет элемент из коллекции. Вернет true, если элемент был удален
        System.out.println("colA.remove(100): " + colA.remove(100));
        System.out.println(colA.remove(20)); // Удалить одно значение (даже если элементов с таким значением несколько
        // Если нужно удалить все вхождение ColA.removeAll(List.of(20));
        System.out.println(colA);

        // clear() - удаляет все элементы из коллекции
        colA.clear();
        System.out.println("colA: " + colA);



    }
}
