package homeworks.homework_47;

import java.util.List;
import java.util.Objects;

public class Task3 {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Anna", 25, "New York"),
                new Person("Klaus", 40, "Berlin"),
                new Person("Hans", 35, "Hamburg"),
                new Person("Felix", 55, "Berlin")
        );
        System.out.println(filter(people, 25, "BERLIN"));
    }

    private static List<Person> filter(List<Person> list, Integer age, String city) {
        return list.stream()
                .filter(Objects::nonNull) // Not null check
                .filter(person -> person.getAge() > age)
                .filter(person -> Objects.nonNull(person.getCity())) // Not null getCity check
                .filter(person -> person.getCity().equalsIgnoreCase(city))
                .toList();
    }
}
