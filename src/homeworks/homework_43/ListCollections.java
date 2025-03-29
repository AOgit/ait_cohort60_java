package homeworks.homework_43;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCollections {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 5 ,6, 7, 8));
        List<Integer> list2 = new LinkedList<>(List.of(1, 2123, 3, -23, 623, 7, 8));
        System.out.println(listCompare(list1, list2));

    }

    public static <T> List<T> listCompare(List<T> list1, List<T> list2) {
        List<T> temp = new LinkedList<>(list1);
        temp.retainAll(list2);
        return temp;
    }

}
