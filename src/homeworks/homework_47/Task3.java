package homeworks.homework_47;

import java.util.List;

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
                .filter(person -> person.getAge() > age)
                .filter(person -> person.getCity().toLowerCase().equals(city.toLowerCase()))
                .toList();
    }
}
