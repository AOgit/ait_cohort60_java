package homeworks.homework_48;

public class Student {
    private String name;
    private int age;
    private String major; // специальность
    private int year;     // курс
    private double grade; // средняя оценка

    public Student(String name, int age, String major, int year, double grade) {
        this.name = name;
        this.age = age;
        this.major = major;
        this.year = year;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return String.format("%s, %d year, %s, %d course, %.2f average grade ||",
                name, age, major, year, grade);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }

    public int getYear() {
        return year;
    }

    public double getGrade() {
        return grade;
    }
}
