package homeworks.homework_32.task2;

import _lists.MyArrayList;
import _lists.MyList;

import java.util.Arrays;

public class PrintTwoListsApp {

    public static void main(String[] args) {
        MyArrayList<String> names = new MyArrayList<>();
        names.add("Alice");
        names.add("Bob");

        MyArrayList<Integer> scores = new MyArrayList<>();
        scores.add(85);
        scores.add(92);

        printTwoLists(names, scores);
    }

    // public static void printTwoLists(MyArrayList<?> names, MyArrayList<?> scores){
    public static <T,U> void printTwoLists(MyArrayList<T> names, MyArrayList<U> scores){
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        for (int i = 0; i < scores.size(); i++) {
            System.out.println(scores.get(i));
        }

    }
}
