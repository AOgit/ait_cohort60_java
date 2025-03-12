package lessons.lesson_32.methods;

import _lists.MyArrayList;
import _lists.MyList;

import java.util.Arrays;

public class MethodsApp {
    public static void main(String[] args) {
        Integer[] integers = {0, 1, 2, 3, 4, 5, 6, 7};
        Utils.swap(integers, 2, 5);
        System.out.println(Arrays.toString(integers));

        String[] strings = {"Hello", "Jave", "World", "JS"};
        Utils.swap(strings, 1,2);
        System.out.println(Arrays.toString(integers));

        int[] intArray = {0, 1, 2, 3, 4, 5, 6, 7};
//        Utils.swap(intArray, 1,2 );

        MyList<Double> doubleList = new MyArrayList<>(new Double[]{1.5, 2.5, 3.5});
        System.out.println(doubleList);
        Double firstValue = Utils.getFirstElement(doubleList);
        System.out.println(firstValue);
        MyList<String> stringList = new MyArrayList<>(strings);
        System.out.println(Utils.getFirstElement(stringList));

        System.out.println("\n==========");
//        int sum = Utils.sumElements("Hello", "World"); // Типобезопасность
         int sum = Utils.sumElements(1, 3.4, 43, 3.5, 10);
        System.out.println(sum);

        double sumD = Utils.listSum(doubleList);
        System.out.println("sumD: " + sumD);
        System.out.println("\n==================");
         MyList<Integer> myListInt = new MyArrayList<>(new Integer[]{2, 4, 5, 6, 4, 2, 4, 3});
         Utils.addNumbers(myListInt); // пройдет, здесь ограничение снизу по Integer в методе
//       Utils.addNumbers(doubleList); // не пройдет по ограничению снизу, будет ошибка компилятора
    }
}
