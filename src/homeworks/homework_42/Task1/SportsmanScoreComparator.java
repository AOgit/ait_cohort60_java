package homeworks.homework_42.Task1;

import java.util.Comparator;

public class SportsmanScoreComparator implements Comparator<Sportsman> {
    @Override
    public int compare(Sportsman s1, Sportsman s2) {
//        return (int) (s1.getScore() - s2.getScore());
//       такое приведение в int не будет нормально работать c типом double,
//        так как просто откидывает дробную часть
//        Sportsman{name='Грицько', age=25, score=100.5},
//        Sportsman{name='Микола', age=25, score=100.1},
        return Double.compare(s1.getScore(), s2.getScore());
    }
}
