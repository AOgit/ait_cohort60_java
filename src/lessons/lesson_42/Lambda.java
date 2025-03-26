package lessons.lesson_42;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Lambda {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Привет");
        System.out.println(r);
        r.run();

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");


        names.forEach(name -> System.out.println(name));
        names.forEach((name) -> System.out.println(name));

        Function<Integer, Integer> square = (x) -> x * x;
        System.out.println(square.apply(5));  // Выведет 25

//        for (String name: names) {
//            System.out.println(name);
//        }
    }
}
