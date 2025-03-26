package homeworks.homework_42.Task2;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer num1, Integer num2) {
        if (isEven(num1) && isEven(num2) || !isEven(num1) && !isEven(num2)) return num1 - num2;
        return isEven(num1) ? -1 : 1;
    }

    private boolean isEven(Integer num) {
        return num % 2 == 0;
    }
}
