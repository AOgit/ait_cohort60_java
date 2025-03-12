package lessons.lesson_32;

import _lists.MyArrayList;

public class ArrayTest {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        System.out.println(list);
        list.add(10);
        list.addAll(20, 30, 140, 50);
//        list.add("34234"); // обеспечиваеся безопасность типов на этапе компиляции
        System.out.println(list.indexOf(140));
        list.set(0, null);
        System.out.println(list);
        System.out.println("\n============");
        list.remove((Integer) 40);
        System.out.println(list);

       //  Стирание типов при работе с дженериками
        // Type Erasure
       // Во время компиляции
        // 1. Проверка типов
        // 2. Стирание типов: удаление информации о параметрах типов
        // 3. Добавление приведения типов, где это необходимо




    }
}
