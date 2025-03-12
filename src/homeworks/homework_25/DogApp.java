package homeworks.homework_25;

public class DogApp {
    public static void main(String[] args) {

       String[] dogNames = new String[]{"Пончо", "Леший", "Бургер", "Зефирка", "Чебурашка"};
       Dog[] dogs = new Dog[dogNames.length];
       // заполняем массив участниками
       for (int i = 0; i < dogs.length; i++)  dogs[i] = new Dog(dogNames[i]);
//        System.out.println(Arrays.toString(dogs))dd;

        System.out.println("\nСоревнование началось!");
        Dog.pause(1);
        System.out.println("На старт! Внимание! Марш!");
        Dog.pause(1);

        for (int i = 0; i < Dog.barriers.length; i++) {
            System.out.println("\n===================================================");
            System.out.printf("Попытка участников взять %d-й барьер высотой %d см\n", i + 1, Dog.barriers[i]);
            System.out.println("===================================================");
            for (int j = 0; j < dogs.length; j++)
            {
                System.out.println();
                System.out.printf("%d-й участник: \n", j + 1);
                System.out.println(dogs[j]);
                dogs[j].jumpBarrier(Dog.barriers[i]);
            }
        }

        System.out.println("\n===РЕЗУЛЬТАТЫ СОРЕВНОВАНИЙ===");
        for (int i = 0; i < dogs.length; i++) {
            System.out.printf("Участник с именем %s преодолел %d барьерa/ов;\n", dogs[i].getName(), dogs[i].getPrizes());
        }
        System.out.println("=============================");

    }
}
