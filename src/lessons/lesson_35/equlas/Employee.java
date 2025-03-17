package lessons.lesson_35.equlas;

import java.util.Objects;

public class Employee {
    private String firstName;
    private String lastName;
    private String dateOfBirth;

    public Employee(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (!(o instanceof Employee employee)) return false;
//        return Objects.equals(getFirstName(), employee.getFirstName()) && Objects.equals(getLastName(), employee.getLastName()) && Objects.equals(getDateOfBirth(), employee.getDateOfBirth());
//    }

    // Прописываю логику сравнения ЭТОГО (this) объекта с другим объектом любого типа данных
    @Override
    public boolean equals(Object obj) {
        // переменные ссылаются на один и тот же объект
        if (this == obj) return true;
        if (!(obj instanceof Employee)) return false;
        Employee employee = (Employee) obj;
//        return firstName.equals(employee.firstName) && lastName.equals(employee.lastName) && dateOfBirth.equals(employee.dateOfBirth);
        //null.equals(employee.firstName) -> аварийное завершение программы
        // Objects.equals(null, employee.firstName) -> просто вернет false

       // Делаем безопасное сравнение объектов
        return Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName) &&
                Objects.equals(dateOfBirth, employee.dateOfBirth);

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }


}
