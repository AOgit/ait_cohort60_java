package homeworks.homework_48;

import java.util.*;
import java.util.stream.Collectors;

public class Task4 {

    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student("Alex", 20, "Economics", 2, 4.5),
                new Student("Maria", 22, "Economics", 3, 4.7),
                new Student("James", 21, "Physics", 2, 4.2),
                new Student("Elena", 23, "Literature", 4, 3.8),
                new Student("John", 19, "Biology", 1, 4.9),
                new Student("Olga", 22, "Law", 3, 3.6),
                new Student("David", 21, "Economics", 2, 4.4),
                new Student("Sofia", 20, "Law", 2, 3.9),
                new Student("Maxim", 23, "Biology", 4, 4.1),
                new Student("Valera", 24, "Biology", 3, 4.9)
        );
        // 1. Группировка по специальности
        Map<String, List<Student>> majorStudents = students.stream()
                .collect(Collectors.groupingBy(Student::getMajor));
        printMap(majorStudents);

        // 2. Группировка по курсу с использованием Set
        Map<Integer, Set<Student>> yearStudents = students.stream()
                .collect(Collectors.groupingBy(Student::getYear,
                        Collectors.toSet()));
        printMap(yearStudents);

        // 3. Подсчёт кол-ва студентов по специальности
        Map<String, Long> majorQuant = students.stream()
                .collect(Collectors.groupingBy(Student::getMajor,
                        Collectors.counting()));
        printMap(majorQuant);

        // 4. Средний бал по специальности
        Map<String, Double> averageGrade = students.stream()
                .collect(Collectors.groupingBy(Student::getMajor,
                        Collectors.averagingDouble(Student::getGrade)));
        printMap(averageGrade);

        // 5. Список оценок по специальности
        Map<String,List<Double>> majorGrades = students.stream()
                .collect(Collectors.groupingBy(Student::getMajor,
                        Collectors.mapping(Student::getGrade, Collectors.toList())));
        printMap(majorGrades);

        // 6. Суммарная статистика по возрасту
        IntSummaryStatistics studentsAgeStat = students.stream()
                .collect(Collectors.summarizingInt(Student::getAge));
        System.out.println(studentsAgeStat);

        // 7. Группировка по курсу, а внутри каждого курса по специальности
        Map<Integer, Map<String, List<Student>>> studentsGrouping = students.stream()
                .collect(Collectors.groupingBy(Student::getYear, Collectors.groupingBy(Student::getMajor)));
        printMap(studentsGrouping);
    }

    private static <K, V> void printMap (Map<K, V> map) {
        map.forEach((K, V) -> System.out.println(K + ": " + V));
        System.out.println("====================\n");
    }
}
