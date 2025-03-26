package homeworks.homework_42.Task1;

import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) {
        Sportsman[] sportsmen = {
                new Sportsman("Микола", 25, 100),
                new Sportsman("Иван", 55, 250),
                new Sportsman("Стецько", 18, 50)
        };
        Arrays.sort(sportsmen);
        System.out.println(Arrays.toString(sportsmen));
        System.out.println("=============");
        Arrays.sort(sportsmen, new SportsmanScoreComparator());
        System.out.println(Arrays.toString(sportsmen));
        System.out.println("=============");
//        Arrays.sort(sportsmen, new Comparator<Sportsman>() {
//            @Override
//            public int compare(Sportsman s1, Sportsman s2) {
//                return Integer.compare(s1.getAge(), s2.getAge());
//            }
//        });
        Arrays.sort(sportsmen, (s1, s2) -> Integer.compare(s1.getAge(), s2.getAge()) );
        System.out.println(Arrays.toString(sportsmen));
        System.out.println("=============");
    }
}
