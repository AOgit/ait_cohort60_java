package lessons.lesson_33;

// Есть два интерфейса Iterable и Iterator
// 1. Iterable<T> - означает что объекты этого класса можно последовательно перебирать
// Iterator<T> - iterator() - этот метод возвращает итератор для этого набора элементов (коллекции)

// 2. Iterator<T> - собственно итератор, который позволяет обходить коллекцию
// - boolean hasNext() - есть ли следующий элемент
// - Т next() - возвращает следующий элемент
// - void remove() - удаляет последний возвращенный элемент (не обязателен для переопределения)


import _lists.MyArrayList;
import _lists.MyList;

import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        MyList<String> list = new MyArrayList<>();
        list.addAll("Hello", "World", "Java", "Python");
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String strCurrent = iterator.next();
            System.out.println(strCurrent);
//            iterator.remove(); // без переопределения метода выдает ошибку
        }
        // Цикл for-each
        // При переборе не рекомендуется изменять коллекцию: добавлять или удалять элементы
        // for (тип переменной, имя переменной: коллекция) {
        //  действия с переменной
         // }

        for (String strCurrent: list) {
            System.out.println(strCurrent);
        }

        MyList<Integer> integers = new MyArrayList<>();
        integers.addAll(1, 2, 3, 4, 5, 6, 7);
        for (Integer value: integers){
            System.out.println(value * 2);
        }

        System.out.println("\n=================");
        int[] array = {10, 20, 30, 40, 50};
        for (int value: array) System.out.println(value);
    }



}
