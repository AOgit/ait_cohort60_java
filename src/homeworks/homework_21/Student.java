package homeworks.homework_21;

public class Student {
    String name;
    int age;
    private int year; // курс в институте
    double averageGrade;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setYear(int year){
       this.year = year;
    }

    public int getYear() {
        return this.year;
    }
}
