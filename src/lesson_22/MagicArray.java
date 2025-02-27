package lesson_22;

import java.util.Arrays;

public class MagicArray {
    int[] array;
    int cursor;

    public MagicArray(){
        this.array = new int[10];
    }

    // Homework 22
    public MagicArray(int[] array) {
//        this.array = new int[array.length];
        if (array == null || array.length == 0) {
            this.array = new int[10];
        } else {
//            this.array = array;
//            this.cursor = array.length;
//            this.expandArray();
            this.array = new int[array.length * 2]; // чтобы избежать expandArray
            add(array);
        }
    }

    public void test() {
        System.out.println(Arrays.toString(this.array));
    }

    public void add(int value){
        if(this.cursor == this.array.length) {
            expandArray();
        }
        this.array[this.cursor] = value;
        this.cursor++;
    }

    public void expandArray() {
        // 1. Создать новый массив бОльшего размера (в 2 раза больше)
        // 2. Переписать в новый массив все значения из старого
        // 3. Перебросить указатель
        System.out.println("Расширяем внутренний массив! Курсор = " + this.cursor);
        int[] newArray = new int[this.array.length * 2];
        for (int i = 0; i < cursor; i++){
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public int size() {
        return this.cursor;
   }

   public int get(int index) {
        // TODO Поправить обработку некорректного индекса
        return this.isValidIndex(index) ?  this.array[index] : -2_147_483_647;
   }

    // Добавление в массив нескольких элементов
    public void add(int... numbers) {
        // c numbers я могу обращаться точно также, как всо ссылкой на массив int
//        System.out.println("Принял несколько int: " + numbers.length);
//        System.out.println(Arrays.toString(numbers));

       for (int i = 0; i < numbers.length; i++){
           add(numbers[i]);
       }

    }

    private boolean isValidIndex(int index){
        return index >= 0 && index < this.cursor;
    }

   public int remove(int index) {
        if (this.isValidIndex(index)) {
            int value = this.array[index];

            for (int i = index; i < this.cursor - 1; i++){
               this.array[i] = this.array[i + 1];
            }

            // Fixed Пофиксена проблема с последним элементом массива при удалении
            this.array[this.size()-1] = 0;
            this.cursor--;
            return value;
        }
        return -2_147_483_647;
   }

   // Поиск по значению
    public int indexOf(int value) {
        // Перебираю элементы
        // Если элемент равен искомому - вернуть индекс, иначе -1
        for(int i = 0; i < this.cursor; i++) {
            if (this.array[i] == value) return i;
        }
        return -1;
    }

    // Homework 22
    public int lastIndexOf(int value){
        for(int i = cursor - 1; i >= 0; i--){
            if(this.array[i] == value) return i;
        }
        return -1;
    }

    //  Homework 22
    public boolean removeByValue(int value) {
       int inx = indexOf(value);
       if (inx == -1) return false;
       return remove(inx) == value;
    }

    public String toString() {
        if (cursor == 0) return "[]";
        String result = "[";
        for (int i = 0; i < this.cursor; i++) {
            result += this.array[i] + (i == this.cursor - 1 ? "]" : ", ");
        }
        return result;
    }
}
