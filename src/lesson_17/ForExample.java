package lesson_17;

import java.util.Random;

public class ForExample {
    public static void main(String[] args) {
        Random random = new Random();
        int[] ints = new int[random.nextInt(11) + 5];

        System.out.print("[");
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(101) - 50;
            System.out.print(ints[i] + (i < ints.length - 1 ? ", " : "]\n"));
        }

        int min = ints[0];
        for (int i = 0; i < ints.length; i++) {
           if (ints[i] < min) min = ints[i];
        }
        int max = ints[0];
        for (int i = 0; i < ints.length; max = ints[i] > max ? ints[i] : max, i++){}

        System.out.println();
        System.out.println(min);
        System.out.println(max);
    }
}
