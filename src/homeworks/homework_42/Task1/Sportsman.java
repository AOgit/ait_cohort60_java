package homeworks.homework_42.Task1;

import java.util.Comparator;

public class Sportsman implements Comparable<Sportsman> {
    private String name;
    private int age;
    private double score;

    public Sportsman(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "\nSportsman{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                "}";
    }

    @Override
    public int compareTo(Sportsman sportsman) {
        return this.getName().compareTo(sportsman.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
