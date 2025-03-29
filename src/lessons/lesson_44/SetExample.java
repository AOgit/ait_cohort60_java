package lessons.lesson_44;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        String str = "a";
        System.out.println(str.hashCode());
        /*
        Для корректной работы хеш-коллекций есть важное правило -
        контракт между hashCode() и equals()

        1. Если два объекта равны пом методу equals(), то их hashCode() тоже должны быть равны
        2. Если hash-коды двух объектов различны, то объекты точно НЕ должны быть равны по equals.
        (обратное не всегда верно. Коллизия - разные объекты могут иметь одинаковые hash-коды)
        3. Многократный вызов метода hashCode() должен возвращать одинаковое значение при многократных
        вызовах на неизмененном объекте.
         */

        // Конструкторы
        Set<Integer> set = new HashSet<>(); // Создает пустой hashSet. Емкость 16 и коэффициент заполнения 0.75
        set = new HashSet<>(20); // Создает пустой hashSet с указанной емкостью
        // Принимает коллекцию - создает новый сет (множество), содержащий уникальные элементы из указанной коллекции.
        set = new HashSet<>(List.of(1, 3, 4, 5, 6, 7 ,4, 3, 4, -4, 2, 0, -234));
        System.out.println(set);
//        Integer v = -234234;
//        System.out.println(v.hashCode());

       List<Integer> startValues = List.of(15, 1, 2, 3, 4, 5, 6, 15, 0, 32, 23, 16);
        System.out.println("startValues: " + startValues);
//       HashSet - не поддерживает порядок добавления элементов
        Set<Integer> integers = new HashSet<>(startValues);
        System.out.println("hashSet: " + integers);

        //LinkedHashSet - сохраняет порядок добавления элементов

        Set<Integer> linkedSet = new LinkedHashSet<>(startValues);
        System.out.println("linkedHashSet: " + linkedSet);

        // Методы интерфейса Set

        // boolean add(E e) - добавление элемента
        System.out.println("integers.add(100): " + integers.add(100));
        System.out.println(integers);
        System.out.println("integers.add(100) #2: " + integers.add(100));
        System.out.println(integers);
        System.out.println("==================");

        // boolean remove(Object o) - удаляет элемент по значению
        System.out.println("integers.remove(100): " + integers.remove(100)); // true
        System.out.println(integers);

        // boolean contains(Object o) - проверяет присутствие элемента в множестве
        System.out.println("integers.contains(100): " + integers.contains(100));
        System.out.println(integers);
        System.out.println("integers.contains(32): " + integers.contains(32));
        System.out.println(integers);
        /*
        int size() - кол-во элементов в сете-е
        boolean isEmpty - возвращает true, если сет не содержит элементов
        clear() - удаляет все элементы
         */

        System.out.println("========================\n");
        // iterator() 0 возвращает итератор для элементов сет-а
        // Наличие итератора позволяет последовательно перебирать все элементы циклом for-each

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.print(value + ", ");
        }
        System.out.println();
        for(Integer val : integers) {
            System.out.print(val + ", ");
        }
        System.out.println();

        // Убрать дубликаты
        // Написать метод, который принимает список и возвращает список,
        // состоящий только из уникальных элементов начального списка

        List<Integer> result = getUniqueList(startValues);
        System.out.println("getUniqueList: " + result);

        // SortedSet - расширяет интерфейс Set
        // Элементы упорядочены в соответствии с их естественным порядком (если элементы реализуют Comparable)
        // или компаратором, переданным при создании
        // Реализован в виде бинарного дерева
        // SortedSet Конструкторы
        // Пустой - Ествественный порядок сортировки

        SortedSet<Integer> sortedSet = new TreeSet<>(); // пустое, упорядоченное множество
        // Сортировка в соответствии с Comparable
        sortedSet.add(100);
        sortedSet.add(32);
        sortedSet.add(150);
        sortedSet.add(125);
        System.out.println("sortedSet: " + sortedSet);
        System.out.println("===============");

        // Принимает коллекцию. Создает set из элементов коллекции. Сортировка в естественном порядке
        sortedSet = new TreeSet<>(startValues);
        System.out.println("sortedSet: " + sortedSet);

        // Конструктор с компаратором, определяющим порядок хранения элементов
        SortedSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());
        treeSet.addAll(startValues);
        System.out.println("treeSet: " + treeSet);
        treeSet = new TreeSet<>((i1, i2) -> Integer.compare(i2, i1));
        treeSet.addAll(startValues);

        treeSet = new TreeSet<>(startValues);
        System.out.println("treeSet: " + treeSet);

        // first() - возвращает самый первый (самый левый) (наименьший по мнению Компаратора) элемент
        System.out.println("treeSet.first(): " + treeSet.first());

        // last() - возвращает последний (правый / максимальный)
        System.out.println("treeSet.last(): " + treeSet.last());

        // SortedSet<E> headSet(E element) - возвращает часть множества, элементы которого строго меньше чем element
        SortedSet<Integer> headSet = treeSet.headSet(6);
        System.out.println("treeSet.headSet(6): " + headSet);

        // SortedSet<E> tailSet(E element) - возвращает часть множества, элементы больше или равны чем element
        SortedSet<Integer> tailSet = treeSet.tailSet(6);
        System.out.println("treeSet.tailSet(6): " + tailSet);

        // SortedSet<E> subSet(E fromElement, E toElement) - часть множества, от from (включительно) до toElement (не включительно)
        SortedSet<Integer> subSet = treeSet.subSet(6, 16);
        System.out.println("treeSet.tailSet(6): " + subSet);

        // comparator() - возвращает компаратор, используемый для упорядочивания элементов в этом множестве
        // если используется естественный порядок - вeрнется null

        homework("Тестовая   строка, такая:: вот строка");

        }

    private static void homework(String testStr) {
        // заменить все Небуквы на пустоту
        String newString = testStr.replaceAll("[^a-zA-Zа-яА-я0-9 ]", "");
//        newString = newString.replaceAll("\s+", " ");
        System.out.println(newString);
//        String str = String.join(" ", "Hello", "Java", "Test");
//        System.out.println(str);
        // Преобразование строки в массив слов
        String[] words = newString.split("\\s+");
        System.out.println(Arrays.toString(words));

        // Arrays.asList(T[] array) - преобразует массив в список (List)
        List<String> list = Arrays.asList(words);
    }

    private static <T> List<T> getUniqueList(List<T> list) {
        Set<T> linkedSet = new LinkedHashSet<>(list);
        return new ArrayList<>(linkedSet);
    }



}
