package homeworks.homework_43;

import java.util.*;

public class Task2 {

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> arrList = new ArrayList<>();
        List<Integer> linkList = new LinkedList<>();
        for (int i = 0; i <= 50000; i++) {
            int randomInt = random.nextInt(1001);
            arrList.add(randomInt);
            linkList.add(randomInt);
        }

        System.out.println("ArrayList получение значения через get(i): " + getIValue(arrList) + " мс");
        // понятное дело LinkedList тратит дополнительное время на определение индекса элемента в коллекции
        System.out.println("LinkedList получение значения через get(i): " + getIValue(linkList) + " мс");
        System.out.println("===========================");
        System.out.println("ArrayList получение значения через foreach: " + forGetValue(arrList) + " мс");
        System.out.println("LinkedList получение значения через foreach: " + forGetValue(linkList) + " мс");
        System.out.println("===========================");
        // чтобы было по-честному генерируем одинаковый набор индексов для вставки
        int[] arrAddIndex = new int[20000];
        Arrays.setAll(arrAddIndex,  i -> random.nextInt(arrList.size()));
        System.out.println("ArrayList вставка 20000 значений list.add(index, value): " + insertValueByIndex(arrList, arrAddIndex) + " мс");
        System.out.println("LinkedList вставка 20000 значений list.add(index, value): " + insertValueByIndex(linkList, arrAddIndex) + " мс");
        System.out.println("===========================");
        // чтобы было по-честному генерируем одинаковый набор индексов для удаления
        int[] arrRemoveIndex = new int[10000];
        Arrays.setAll(arrRemoveIndex,  i -> random.nextInt(arrList.size() - 10000));
        System.out.println("ArrayList удаление 10000 значений list.remove(index): " + removeByIndex(arrList, arrRemoveIndex) + " мс");
        System.out.println("LinkedList удаление 10000 значений list.remove(index): " + removeByIndex(linkList, arrRemoveIndex) + " мс");
        System.out.println("===========================");
        Integer[] arrRemoveValue = new Integer[1000];
        Arrays.setAll(arrRemoveValue,  i -> random.nextInt( 10001));
        System.out.println("ArrayList удаление 1000 значений list.remove(Value): " + removeByValue(arrList, arrRemoveValue) + " мс");
        System.out.println("LinkedList удаление 1000 значений list.remove(Value): " + removeByValue(linkList, arrRemoveValue) + " мс");

    }

    private static long getIValue(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        Integer value = 0;
        for (int i = 0; i < list.size(); i++) {
           value = list.get(i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static long forGetValue(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        Integer value = 0;
        for (Integer integer : list) {
            value = integer;
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static long insertValueByIndex(List<Integer> list, int[] arrIndex) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < arrIndex.length; i++) {
            list.add(arrIndex[i], 1);
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static long removeByIndex(List<Integer> list, int[] arrIndex) {
        long startTime = System.currentTimeMillis();
        Random random = new Random();

        for (int i = 0; i < arrIndex.length; i++) {
            list.remove(arrIndex[i]);
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static long removeByValue(List<Integer> list, Integer[] arrValues) {
        long startTime = System.currentTimeMillis();
        for (Integer arrValue : arrValues) {
            list.remove(arrValue);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

}
