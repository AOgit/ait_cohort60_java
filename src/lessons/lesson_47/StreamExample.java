package lessons.lesson_47;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Stream API - мощный инструмент, позволяющий обрабатывать наборы данных в декларативном стиле
Основная идея - преобразование последовательности элементов через набор операций
Stream (поток) - поток данных представляет собой последовательность элементов
Поток дает возможность поочередного получения элементов для обработки.
Стримы могут быть созданы из различных источников (Коллекции, массивы, файлы, консоль и т.п)

Pipeline - последовательность операций, выполняемых на потоке данных.

Промежуточные операции / методы (Intermediate operations) - это операции, которые преобразуют поток в другой поток (возвращают поток)
Их может быть много (больше чем одна)


Терминальные операции / методы - Это операции, которые запускают обработку потока и закрывают его.
После выполнения терминальной операции поток перестает быть доступным для дальнейшей обработки.
Может быть ТОЛЬКО ОДИН терминальный метод.

Ленивые вычисления
Стримы не выполняют промежуточные операции, пока на потоке не будет вызван терминальный метод
 */
public class StreamExample {
   /*
   Промежуточные методы (ВСЕ возвращают поток):

   Stream<T> filter(Predicate<T> predicate) - оставляет в потоке только те элементы, для которых предикат вернет true
   Т.е оставляет элементы, удовлетворяющие условию. (Отбрасывает элементы НЕ отвечающие условию)
   sorted() - сортирует поток в естественном порядке
   sorted(Comparator<T> comparator) - сортирует элементы потока с использованием компаратора.

   Stream<R> map(Function<T, R> action) - преобразует элементы потока с использованием заданной функции,
   в том числе в другой тип данных

  Stream<T> peek(Consumer<T> action) - выполняет действие для каждого элемента потока
  Действие, как правило, не изменяющее элемент

  distinct - удаляет дубликаты элементов из потока
   ------------

   Терминальные методы:

  R collect(Collector<T, A, R> collector) - преобразует элементы потока в разные виды коллекций или другие структуры данных
  void foreach(Consumer<T> action) - выполняет заданное действие для каждого элемента потока
    */


    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//          task7();
//            task8();
//      task9();
      task10();
    }

   private static void task10() {
        List<Integer> integers = Arrays.asList(10, 20, 30, 20, 30, 50, 0);
        List<Integer> unique = integers.stream()
                .distinct()
                .collect(Collectors.toList());
       System.out.println(unique);
       System.out.println("============================");

       Cat cat = new Cat("Bear", 5, "braun");
       Cat[] arrCats = {
               cat,
               new Cat("Python", 7, "green"),
               new Cat("Tiger", 3, "yellow"),
               new Cat("Panda", 4, "black"),
               new Cat("Panda", 4, "black"),
               null,
               new Cat(null, 10, "red"),
               cat
       };

       List<Cat> cats = Arrays.asList(arrCats);
       cats.forEach(System.out::println);
       System.out.println("=========== filter ========");

       cats.stream()
               .distinct()
               .forEach(System.out::println);
   }


   private static void task9() {
        // создание стрима из Map
        Map<String, Integer> map = new HashMap<>();
       map.put("Apple", 1);
       map.put("Banana", -10);
       map.put("Cherry", 5);

       map.entrySet().stream()
               .filter(entry -> entry.getValue() > 0)
               .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
       System.out.println("map: " + map);
   }

    private static void task8() {

        Cat[] cats = {
                new Cat("Bear", 5, "braun"),
                new Cat("Python", 7, "green"),
                new Cat("Tiger", 3, "yellow"),
                new Cat("Panda", 4, "black"),
                null,
                new Cat(null, 10, "red")
        };

        // Получить список кошек, имя которых длиннее 4 символов
        // Arrays.stream(cats) - создает поток из элементов массива

        List<Cat> longCats = Arrays.stream(cats)
//                .filter(c -> c != null) // оставляем только не Null
//                .filter(c -> Objects.nonNull(c)) // оставляем только не Null
                .filter(Objects::nonNull) // оставляем только не Null
                .filter(c->Objects.nonNull(c.getName()))
                .filter(c-> c.getName().length() > 4)
                .toList();

        /*
        Objects.nonNull(null) вернет true, если параметр НЕ null
        Objects.isNull(null) вернет true, если параметр null

         */


        System.out.println(longCats);

    }

    private static void task7() {
        List<Cat> cats = getListCats();
        // Вывести на экран имена котов, чей вес меньше 5
        // вывести на экран котов, оставшихся
        Stream<String> catStream = cats.stream()
                .filter(c -> c.getWeight() < 5)
                .peek(cat -> System.out.println("After filter: " + cat))
                .map(c -> c.getName());
//        System.out.println(catStream.toList());
        catStream.forEach(name -> System.out.println("Terminal: " + name));




        /*
        peek - промежуточный метод. Использвуется в основном для отладки. Не закрывает поток
        foreach - терминальный метод. Для выполнения действия с каждым элементом потока. Закрывает поток
         */


    }

    private static void task6() {
        List<Cat> cats = getListCats();

        /*
        Классический - методы фильтрации должны выполняться в потоке как можно раньше
        Эффективность
         */
        List<String> names1 = cats.stream()
                .filter(cat -> cat.getName().length() < 5)
                .map(Cat::getName)
                .toList();
        System.out.println(names1);
       /*
        Читаемость и понимание кода
        */
       List<String> names2 = cats.stream()
               .map(Cat::getName)
               .filter(name -> name.length() < 5)
               .toList();
        System.out.println(names2);
    }


    private static void task5() {
        List<Cat> cats = getListCats();
        // Получить список имен кошек, чей вес больше 4
        List<String> catNames = cats.stream()
                .filter(cat -> cat.getWeight() > 4)
                .map(Cat::getName)
                .toList();
        System.out.println(catNames);
    }


    private static void task1() {
        List<Integer> integers = List.of(-1, 12, 0, 5, 1, -15, 24, 99);
        // Получить список содержащий все положительные числа из исходного списка
        // Список должен быть отсортирован в порядке возрастания

        List<Integer> result = new ArrayList<>();
        for (Integer num : integers) {
            if (num > 0) {
                result.add(num);
            }
        }
       result.sort(Comparator.naturalOrder());
        System.out.println("result: " + result);

        // У всех коллекций есть метод .stream() создающий поток (стрим) из элементов коллекции.

       List<Integer> integerList = integers.stream() // Создание потока из элементов коллекции list
                .filter(e -> e > 0) // фильтрация элементов потока
                .sorted() // сортировка элементов в естественном порядке
                .collect(Collectors.toList()); // собирает элементы потока в коллекцию List

        System.out.println("result: " + integerList);

    }

    private static List<Cat> getListCats() {
        return List.of(
                new Cat("Bear", 5, "braun"),
                new Cat("Python", 7, "green"),
                new Cat("Tiger", 3, "yellow"),
                new Cat("Panda", 4, "black")
        );
    }

    private static void task2() {
        List<Cat> cats = getListCats();
        // список кошек с весом больше 4
        Stream<Cat> catStream = cats.stream()
                .filter(cat -> cat.getWeight() > 4);

        // Терминальный метод
//        List<Cat> fatCats = catStream.collect(Collectors.toList());
        List<Cat> fatCats = catStream.toList();
        System.out.println("fatCats: " + fatCats);


        // Повторно использовать "закрытый" поток нельзя. Закрытый - тот в котором уже был вызван терминальный метод
//        List<Cat> catList2 = catStream.sorted().toList(); //  будет ошибка (исключение)
//        System.out.println(catList2);

    }

    private static void task3() {
        List<Cat> cats = getListCats();
        Stream<Cat> catStream = cats.stream()
                .filter(cat -> cat.getName().length() > 4);

        // Пока не запущен терминальный метод - промежуточные операции не выполняются.

        // Терминальный метод
        List<Cat> longNameCats = catStream.toList();
//        System.out.println("longNameCats: " + longNameCats);
    }

}
