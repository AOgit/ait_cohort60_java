package consultations.cons_13;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    private void sayHello() {
        System.out.println("Привет, меня зовут " + this.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
