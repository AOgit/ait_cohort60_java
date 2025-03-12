package lessons.lesson_31.generics;

import lessons.lesson_29.abstracts.Cat;

public class GenericApp {
    public static void main(String[] args) {
        GenericBox<String> box = new GenericBox<>("Hello");
        String value = box.getValue();
        System.out.println(value.toUpperCase());
        System.out.println(box.getValue().length());

        // Проверка типизации на уровне компилятора
        // box.setValue(1000);
        box.setValue("New Value");
        System.out.println(box);
        System.out.println("=================");
        GenericBox<Cat> catBox = new GenericBox<>(new Cat());

        System.out.println(catBox.getValue());
        // Нельзя поместить другой тип данных. Ошибка КОМПИЛЯЦИИ
//        catBox.setValue("String");
        // Дженерики работают только со ссылочными типами данных и не работают с примитивами
//          GenericBox<int> intBox = new GenericBox<int>();


        GenericBox<Integer> intBox = new GenericBox<>(125);
        GenericBox<Integer> intBox2 = new GenericBox<>(200);
        System.out.println(intBox.toString());

        int sum = intBox.getValue() + intBox2.getValue();
        System.out.println(sum);

        // За счет автоупаковки / автораспаковки я практически не беспокоюсь о приведении типов

    }
}
