package homeworks.homework_50;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Task2_3 {
    public static void main(String[] args) {

        LocalDate nowDate = LocalDate.now();
        System.out.println(nowDate);

        System.out.printf("Год: %s, месяц: %s, день: %s\n", nowDate.getYear(), nowDate.getMonthValue(), nowDate.getDayOfMonth());

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println(LocalDate.of(1983, 1, 1).format(dateFormat));

        LocalDate date1 = LocalDate.of(1980, 5, 20);
        LocalDate date2 = LocalDate.of(1985, 6, 20);
        System.out.printf("date1: %s, date2: %s. date1.equals(date2): %b\n", date1, date2,  date1.equals(date2));

        System.out.println("============= NOW ==========");
        LocalTime timeNow = LocalTime.now();
        System.out.println(timeNow);

        System.out.println("============= NOW + 3 Hours");
        System.out.println(timeNow.plusHours(3));
        System.out.println(timeNow.plus(3, ChronoUnit.HOURS));
        System.out.println(ChronoUnit.HOURS.addTo(timeNow, 3));

        System.out.println("============= Today - 1 Week");
        System.out.println(LocalDate.now().minus(1, ChronoUnit.WEEKS));
        System.out.println(LocalDate.now().minusWeeks(1));
        System.out.println(ChronoUnit.WEEKS.addTo(LocalDate.now(), -1));

        System.out.println("============= Today - 1 Year");
        System.out.println(LocalDate.now().minus(1, ChronoUnit.YEARS));
        System.out.println(LocalDate.now().minusYears(1));
        System.out.println(ChronoUnit.YEARS.addTo(LocalDate.now(), -1));

        System.out.println("============= Today + 1 Year");
        System.out.println(LocalDate.now().plus(1, ChronoUnit.YEARS));
        System.out.println(LocalDate.now().plusYears(1));
        System.out.println(ChronoUnit.YEARS.addTo(LocalDate.now(), 1));

        System.out.println("\n================");
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plusDays(1);
        LocalDate yesterday = today.minusDays(1);
        System.out.println("today: " + today);
        System.out.println("tomorrow: " + tomorrow);
        System.out.println("yesterday: " + yesterday);

        System.out.println("tomorrow is after today: " + tomorrow.isAfter(today));
        System.out.println("tomorrow is before today: " + tomorrow.isBefore(today));

        System.out.println("yesterday is after today: " + yesterday.isAfter(today));
        System.out.println("yesterday is before today: " + yesterday.isBefore(today));

        System.out.println("\n===========Task 3 =============");

        Set<LocalDate> setDays = Set.of(
                LocalDate.now(),
                LocalDate.of(2000, 4, 15),
                LocalDate.of(2024, 3, 10),
                LocalDate.of(1981, 3, 1),
                LocalDate.of(2029, 1, 28)
        );
        System.out.println("days between max and min date: " + daysBetweenMinMaxDate(setDays));
    }

    public static long daysBetweenMinMaxDate(Set<LocalDate> dates) {
        SortedSet<LocalDate> tempSet = new TreeSet<>(dates);
        System.out.println(tempSet);
        return ChronoUnit.DAYS.between(tempSet.getFirst(), tempSet.getLast());
    }

}
