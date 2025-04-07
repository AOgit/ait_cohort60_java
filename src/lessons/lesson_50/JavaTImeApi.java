package lessons.lesson_50;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class JavaTImeApi {
    // Java Time Api

    /*
    util.Date
    util.Calendar
    text.SimpleDateFormat

    Joda-Time
     */
    public static void main(String[] args) {
       // LocalDate - представляет дату (год, месяц, день) без времени
        LocalDate date = LocalDate.now();
//        LocalDate date = LocalDate.of(2024, 2,22);
        System.out.println("date: " + date);

        // Прибавить 1 день к дате
        LocalDate tomorrow = date.plusDays(1);
        System.out.println("tomorrow: " + tomorrow);
        System.out.println("plusWeeks: " + date.plusWeeks(1));
        System.out.println("minusMonth: " + date.minusMonths(2));

        LocalDate date1 = LocalDate.of(2002, 2, 15);
        System.out.println("date1: " + date1);

        date1 = LocalDate.of(2002, Month.FEBRUARY, 15);
        System.out.println("date1: " + date1);

        System.out.println("год" + date1.getYear() + "; месяц: " + date1.getMonth() + "; месяц-цифра: " + date1.getMonthValue());
        System.out.println("число: " + date1.getDayOfMonth() + "; день недели: "
                + date1.getDayOfWeek() + "; день-года: " + date1.getDayOfYear());

        System.out.println("Сколько дней в месяце: " + date1.lengthOfMonth()
                + "; дней в году: " + date1.lengthOfYear() + "; был ли год високосным: " + date1.isLeapYear());

        // Преобразование строки в объект даты
        String dateString = "2000-10-25";
        LocalDate date2 = LocalDate.parse(dateString);
        System.out.println(date2.getDayOfMonth() + "/" + date2.getMonthValue() + "/" + date2.getYear());

        // LocalTime - представляет время (часы, минуты, секунды, наносекунды)
        LocalTime time = LocalTime.now();
        System.out.println("time: " + time);

        LocalTime time1 = LocalTime.of(21, 33);

        time1 = LocalTime.of(22, 23, 24, 2234234);
        System.out.println("time1: " + time1);

        LocalTime time2 = time1.plusHours(5);
        System.out.println("time1 + 5 hour: " + time2);

        System.out.println("time.plusMinutes(65): " + time2.plusMinutes(65));
        System.out.println("time.minusSeconds(30): " + time2.minusSeconds(30));

        System.out.println(time.getHour() + ":" + time.getMinute() + ":" + time.getSecond() + ":" + time.getNano());
        String timeString = "15:18:45";
        LocalTime parseTime = LocalTime.parse(timeString);
        System.out.println(parseTime);

        System.out.println("\n============================= LocalDateTime =================");
        // LocalDateTime - представляет дату и время
        LocalDateTime now = LocalDateTime.now(); // Текущая дата и время
        System.out.println("now" + now);

        LocalDate localDate = LocalDate.of(2011, Month.AUGUST, 15);
        LocalTime localTime = LocalTime.of(15,22, 59);

        LocalDateTime dateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("dateTime" + dateTime);

        dateTime = LocalDateTime.of(2025, 12, 31, 23, 59);
        System.out.println(dateTime.getDayOfWeek());
        System.out.println(dateTime.getDayOfWeek().getValue());
        System.out.println("dateTime.plusHours(1): " + dateTime.plusHours(1));
        System.out.println("dateTime.minusYears(1): " + dateTime.minusYears(1));

        System.out.println("\n============== ZonedDateTime ====================");
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime + " | " + zonedDateTime.getZone());

        System.out.println("============= isAfter, isBefore, until, equals ===================");
        LocalDate date3 = LocalDate.of(2020, 10, 16);
        LocalDate date4 = LocalDate.of(2020, 6, 25);


        // isAfter, isBefore, until, equals  есть у всех объектов, представляющих дату и/или время

        // boolean isAfter - проверяет, что текущий объект после (позже) указанного объекта
        boolean isAfter = date3.isAfter(date4);
        System.out.println("data3.isAfter(date4): " + isAfter);

        System.out.println("data3.isBefore(date4): " + date3.isBefore(date4));

        // equals - проверяем даты/время на равенство
        System.out.println("date3.equals(date4): " + date3.equals(date4));

        // long until - метод измеряет время между текущим и указанным объектом даты/времени

        long between = date3.until(date4, ChronoUnit.DAYS);
        System.out.println("between: " + between);

        LocalDateTime dateTime1 = LocalDateTime.now();
        LocalDateTime dateTime2 = dateTime1.minusDays(15);
        System.out.println("until days: " + dateTime2.until(dateTime1, ChronoUnit.DAYS));
        System.out.println("until seconds: " + dateTime2.until(dateTime1, ChronoUnit.SECONDS));

        LocalDateTime dateTime3 = dateTime1.plus(10, ChronoUnit.DAYS);
        System.out.println("dateTime1.plus(10, ChronoUnit.DAYS): " + dateTime3);
        dateTime3 = dateTime1.minus(10, ChronoUnit.DAYS);
        System.out.println("dateTime1.minus(10, ChronoUnit.DAYS): " + dateTime3);

        // метод ChronoUnit - between -> long
        long hoursBetween = ChronoUnit.HOURS.between(dateTime1, dateTime2);
        System.out.println("ChronoUnit.HOURS.between: " + hoursBetween);

        System.out.println("==================== Instant, Duration, Period ================");

        // Instant - представляет собой точку на временной шкале в Григорианском календаре с точностью до наносекунд
        // Unix epoch (Epoch time) - Эпоха юникс. Началась с 1 января 1970 года.
        // момент времени, который основан на кол-ве секунд и наносекунд, прошедших с 1 января 1970 года

        Instant nowInstant = Instant.now();

        long millis = nowInstant.toEpochMilli();
        System.out.println("noInstant.toEpochMilli(): " + millis);

        Instant instant = Instant.ofEpochMilli(millis);
        System.out.println(instant);

        // Duration, Period - представляют собой отрезки времени (временные интервалы),
        // но используются для разных типов временных единиц
        // Duration - продолжительность в секундах и наносекундах
        // Period - разница (продолжительность) в днях, месяцах, годах

        System.out.println("\n=========== DateTimeFormatter ================");

        // DateTimeFormatter - форматирование даты и времени

        LocalDateTime nowLDT = LocalDateTime.now();
        System.out.println("nowLDT: " + nowLDT);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss a");
        String formattedString = nowLDT.format(formatter);
        System.out.println("formattedString: " + formattedString);

        /*
        y - год
        M - месяц
        d - день
        H - час в формате от 0 до 23, флаг 'a' для отображения AM/PM
        p - час в формате от 0 до 12
        m - минута
        s - секунда

       Кол-во повторений символа определяет формат отображения значения
       yyyy - 4-x значный год
       yy - 2-х значный год 2023 -> 23
       M - месяц в сыром формате -> "2", "12"
       MM - месяц в двузначном формате -> "02", "12"
       то же самое с днями
         */

        String dateForParse = "23-10-26 19:15";
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm");
        LocalDateTime parseDate = LocalDateTime.parse(dateForParse, formatter1);
        System.out.println(parseDate.getDayOfWeek() + " | " + parseDate.getHour());

        System.out.println("======== Task 1 =============");

        String dateForParse2 = "15-12-2022 20:46";

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        LocalDateTime parseDate2 = LocalDateTime.parse(dateForParse2, formatter2);

        System.out.println(parseDate2.getMonthValue());
        System.out.println(parseDate2.getDayOfMonth());
        System.out.println(parseDate2.getHour());

        System.out.println("======== Task 2 =============");

        String dateForParse3 = "13-01-2023 00:47";

        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        LocalDateTime parseDate3 = LocalDateTime.parse(dateForParse3, formatter3);
        System.out.println(parseDate3.getDayOfWeek());
        System.out.println(ChronoUnit.DAYS.between(parseDate3, parseDate2));


    }
}
