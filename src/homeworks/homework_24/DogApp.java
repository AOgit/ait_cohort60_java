package homeworks.homework_24;

public class DogApp {
    public static void main(String[] args) {
        System.out.println("\nСоревнование началось!");
        Dog.pause(1);
        System.out.println("На старт! Внимание! Марш!");
        Dog.pause(1);

        System.out.println("\n=======Первый участник=======");
        Dog pluto = new Dog("Плуто", -5);
        System.out.println(pluto);
        Dog.pause(3);
        pluto.jumpBarrier(5);
        Dog.pause(1);

        System.out.println("\n=======Следующий участник=======");
        Dog kosmos = new Dog("Космос", 10000000);
        System.out.println(kosmos);
        Dog.pause(7);
        kosmos.jumpBarrier(50);
        kosmos.jumpBarrier(199);
        Dog.pause(1);

        System.out.println("\n=======Следующий участник=======");
        Dog keksik = new Dog("Кексик", 180);
        System.out.println(keksik);
        Dog.pause(3);
        // keksik.training();
        keksik.jumpBarrier(190);
        keksik.jumpBarrier(19);
        keksik.jumpBarrier(-5);
        keksik.jumpBarrier(250);
        Dog.pause(1);

        System.out.println("\n=======Следующий участник=======");
        Dog  pelmen = new Dog("Пельмень", 20);
        System.out.println(pelmen);
        Dog.pause(3);
        pelmen.jumpBarrier(15);
        pelmen.jumpBarrier(46);
        Dog.pause( 2);

        System.out.println("\n=============================");
        System.out.println("Общее кол-во участников: " + Dog.getTotalDogs());
        System.out.println("Общее кол-во медалей всех участников: " + Dog.getTotalPrizes());
        System.out.printf("Kол-во медалей на 1 участника: %.1f", (double) Dog.getTotalPrizes() / Dog.getTotalDogs());
    }
}
