package homeworks.homework_21;

public class TestClasses {
    public static void main(String[] args) {

        Display display = new Display("Sony", 25);
        display.printSize();

        Fish fish = new Fish("Shark", 10);
        fish.setFreshwater(false);
        fish.printFish();

        Student student = new Student("Василий", 17);
        student.setYear(3);
        System.out.println();
        System.out.printf("Студент учится на %d курсе", student.getYear());
    }
}
