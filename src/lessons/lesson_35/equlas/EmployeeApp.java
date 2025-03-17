package lessons.lesson_35.equlas;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Петр", "Петров", "21.10.2000");
        Employee employee1 = new Employee("Петр", "Иванов", "05.12.1998");
        Employee employee2 = new Employee("Иван", "Иванов", "21.10.2000");
        Employee employee3 = new Employee("Петр", "Петров", "21.10.2000");
        Employee employee4 = new Employee("Петр", "Петров", "01.01.2015");

        // Оператор == сравнивает ссылки, указывает ли две переменные на один и тот же обьект в памяти
        System.out.println("employee == employee1: " + (employee == employee1));
        System.out.println("employee == employee3: " + (employee == employee3));

        // Метод equals - логическое сравнение объектов пои их содержимому (сравнение по значению)
        System.out.println("employee equals employee1: " + (employee.equals(employee1)));
        System.out.println("employee equals employee3: " + (employee.equals(employee3)));
        System.out.println("employee equals employee4: " + (employee.equals(employee4)));
    }
}
