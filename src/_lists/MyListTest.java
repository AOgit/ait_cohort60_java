package _lists;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> integerList = new MyArrayList<>();
        integerList.add(10);
        integerList.addAll(120, 250, 1000, null, -100, -200, 0);

        System.out.println(integerList);
        Integer value = integerList.get(0);
        System.out.println(value);
        System.out.println("Size: " + integerList.size());

        int index120 = integerList.indexOf(120);
        System.out.println("Индекс 120: " + index120);

        int index250 = integerList.indexOf(250);
        System.out.println("Индекс 250: " + index250);

        System.out.println(integerList);
        // Примитив по индексу
        System.out.println(integerList.remove(0));
        System.out.println(integerList);

        System.out.println(integerList.remove(Integer.valueOf(0)));
        System.out.println(integerList);
        integerList.remove(null);
        System.out.println("Null был удален");
        System.out.println(integerList);
    }
}
