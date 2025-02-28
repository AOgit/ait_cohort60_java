package lesson_24.persons;

import java.util.Arrays;

public class PersonApp {
    public static void main(String[] args) {

        Person garry = new Person("Garry", 31, "Photo");
        System.out.println(garry.toString());
        Person john = new Person("John", 75, "Reading, music");
        System.out.println(john.toString());
        Person[] people = new Person[5];
        System.out.println(Arrays.toString(people));
        people[0] = garry;
        people[1] = john;
        people[2] = new Person("Tom", 5, "Crying");
//        System.out.println(Arrays.toString(people));
        System.out.println(people[0].toString());
        garry.setName("Not Garry already");
        System.out.println(people[0].toString());
        for(int i = 0; i < people.length; i++)
        {
            if(people[i] == null) continue;
            System.out.print(i + " " + people[i].getName() + ". ");
            System.out.println(people[i].toString());
        }

    }
}
