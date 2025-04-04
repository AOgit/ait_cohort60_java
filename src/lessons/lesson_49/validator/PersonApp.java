package lessons.lesson_49.validator;

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("john@gmail.com", "Pa$$w0rd");
        System.out.println(person);
        System.out.println("==============\n");
        Person person1 = new Person("werwre2@df", "Pa$$w0rd");
        System.out.println("==============\n");
        person.setEmail("23");
    }
}
