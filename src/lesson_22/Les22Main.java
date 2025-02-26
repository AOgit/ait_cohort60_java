package lesson_22;

public class Les22Main {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        MagicArray magic = new MagicArray();
        magic.add(5);
        magic.test();
        magic.add(20);
        magic.test();
        magic.add(105);
        magic.test();
        magic.add(0);
        magic.test();
        System.out.println(magic.toString());
        magic.add(3, 4, 5, 2, 1);
        magic.test();
        System.out.println(magic.toString());
        magic.add(2, 4, 5, 2, 1);
        magic.test();
        System.out.println(magic.toString());
        System.out.println(magic.size());
        magic.get(5);
        magic.test();
        magic.remove(5);
        magic.test();
        System.out.println(magic.toString());
        System.out.println(magic.indexOf(1));
        // TODO Homework 22
        System.out.println("=====Homework 22===========");
        magic.test();
//        System.out.println(magic.size());
        System.out.println("Last index of 1: " + magic.lastIndexOf(1));

        System.out.println("Remove value 20: " + magic.removeByValue(20));
        magic.test();
        System.out.println("Remove value 20 again: " + magic.removeByValue(20));
        magic.test();

        System.out.println("Init new MagicArray:");
        MagicArray magic1 = new MagicArray(new int[]{2, 3, 4, 5, 2, 4,});
        magic1.test();
        System.out.println(magic1.size());
    }
}
