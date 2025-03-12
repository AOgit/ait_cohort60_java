package homeworks.homework_23;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age) {
        this.name = name;
        this.setAge(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
      if (age >= 0 && age < 125 ) this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) this.salary = salary;
    }

    public void info(){
        System.out.printf("Employee name: %s, age: %d, salary: %.2f y.e.\n", name, age, salary);
    }
}
