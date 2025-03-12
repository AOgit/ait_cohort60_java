package lessons.lesson_25;

import java.util.Arrays;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(StaticBlockDemo.counter);
        System.out.println(Arrays.toString(StaticBlockDemo.colors));

        StaticBlockDemo demo = new StaticBlockDemo();
        System.out.println(demo.toString());
        StaticBlockDemo demo1 = new StaticBlockDemo("Title");
        System.out.println(demo1.toString());
//        System.out.println(Arrays.toString(StaticBlockDemo.colors));

    }
}
