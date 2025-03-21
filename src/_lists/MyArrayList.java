   package _lists;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

   public class MyArrayList<T> implements MyList<T> {
    private T[] array;
    private int cursor;

    public MyArrayList(){
//        this.array = new int[10]
        // Стирание типов. Невозможно создать объект типа Т
//        this.array = new T[10];
          this.array = (T[]) new Object[10];

    }

    // Homework 22
    public MyArrayList(T[] array) {
//        this.array = new int[array.length];
        if (array == null || array.length == 0) {
            this.array = (T[]) new Object[10];
        } else {
//            this.array = array;
//            this.cursor = array.length;
//            this.expandArray();
            this.array = (T[]) new Object[array.length * 2]; // чтобы избежать expandArray
            addAll(array);
        }
    }

    public void test() {
        System.out.println(Arrays.toString(this.array));
    }

    public void add(T object){
        if(this.cursor == this.array.length) {
            expandArray();
        }
        this.array[this.cursor] = object;
        this.cursor++;
    }

    private void expandArray() {
        // 1. Создать новый массив бОльшего размера (в 2 раза больше)
        // 2. Переписать в новый массив все значения из старого
        // 3. Перебросить указатель
        System.out.println("Расширяем внутренний массив! Курсор = " + this.cursor);
        T[] newArray = (T[]) new Object[this.array.length * 2];
        for (int i = 0; i < cursor; i++){
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public int size() {
        return this.cursor;
   }

    public T get(int index) {
        // TODO Поправить обработку некорректного индекса
        return this.isValidIndex(index) ?  this.array[index] : null;
   }

    // Добавление в массив нескольких элементов
    public void addAll(T... objects) {
        // c numbers я могу обращаться точно также, как всо ссылкой на массив int
//        System.out.println("Принял несколько int: " + numbers.length);
//        System.out.println(Arrays.toString(numbers));

       for (int i = 0; i < objects.length; i++){
           add(objects[i]);
       }

    }

    private boolean isValidIndex(int index){
        return index >= 0 && index < this.cursor;
    }

    public T remove(int index) {
        if (this.isValidIndex(index)) {
            T object = this.array[index];

            for (int i = index; i < this.cursor - 1; i++){
               this.array[i] = this.array[i + 1];
            }

            // Fixed Пофиксена проблема с последним элементом массива при удалении
            this.array[this.size()-1] = null;
            this.cursor--;
            return object;
        }
        return null;
   }

   // Поиск по значению
    public int indexOf(T object) {
        // Перебираю элементы
        // Если элемент равен искомому - вернуть индекс, иначе -1
        for(int i = 0; i < this.cursor; i++) {
            if (Objects.equals(array[i], object)) return i;
//            if (this.array[i].equals(object)) return i;
        }
        return -1;
    }

    public boolean contains(T object) {
        return indexOf(object) >= 0;
    }

    // Homework 22
    public int lastIndexOf(T object){
        for(int i = cursor - 1; i >= 0; i--){
            if (Objects.equals(array[i], object)) return i;
//            if(this.array[i].equals(object)) return i;
        }
        return -1;
    }

    //  Homework 22
    public boolean remove(T object) {
       int inx = indexOf(object);
       if (inx == -1) return false;
       return  Objects.equals(remove(inx), object);
    }

    public String toString() {
        if (cursor == 0) return "[]";
        String result = "[";
        for (int i = 0; i < this.cursor; i++) {
            result += this.array[i] + (i == this.cursor - 1 ? "]" : ", ");
        }
        return result;
    }

//    public T[] toArray(){
//        T[] arr = (T[]) new Object[cursor];
//        for (int i = 0; i < cursor; i++){
//            arr[i] = this.array[i];
//        }
//        return arr;
//    }

    // TODO Написать метод public int[] toArray() возвращающий массив, состоящий из элементов магического массива.
    public T[] toArray(){
//        T[] arr = (T[]) new Object[cursor];
        if (cursor == 0) return null;

        Class<T> clazz = (Class<T>) array[0].getClass();
        System.out.println("clazz: " + clazz);

       // Создаю массив того же типа, что и 0-й элемент
        T[] result = (T[]) Array.newInstance(clazz, cursor);

        for (int i = 0; i < cursor; i++){
            result[i] = this.array[i];
        }
        return result;
    }



    public boolean isEmpty() {
        return this.cursor == 0;
    }

    @Override
    public void set(int index, T value) {
        if (index < 0 || index > cursor - 1) {
            System.out.println("Индекс выходит за предел массива. Элемент не может быть добавлен");
            return;
        }
        this.array[index] = value;
    }

    // Невозможно вернуть объект типа интерфейс
       // Если тип возвращаемого значения (или параметр метода) имеет тип интерфейс,
       // это значит, что я должден вернуть обьект класса, который имплементировал этот интерфейс
       @Override
       public Iterator<T> iterator() {
           return new MyIterator();
       }

       private class MyIterator implements Iterator<T> {
            int currentIndex = 0;

           @Override
           public boolean hasNext() {
               return currentIndex < cursor;
           }

           @Override
           public T next() {
//               T value = array[currentIndex];
//               currentIndex++;
//               return value;
               return array[currentIndex++];
           }
       } // End class MyIterator



   }
