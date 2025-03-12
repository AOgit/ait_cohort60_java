package homeworks.homework_32.task1;

public class PairApp {
    public static void main(String[] args) {
        Pair<String> pair = new Pair<>("Hello", "World");
//        Pair<Integer> pair = new Pair<>(1, 2);
        System.out.println(pair.getFirst()); // Вывод: Hello
        System.out.println(pair.getSecond()); // Вывод: World

        pair.swap();
        System.out.println(pair.getFirst()); // Вывод: World
        System.out.println(pair.getSecond()); // Вывод: Hello
    }
}
