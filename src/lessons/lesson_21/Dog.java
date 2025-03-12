package lessons.lesson_21;

public class Dog {

    String name;
    int weight;

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("Я кушаю, ням-ням!");
        this.weight++;
    }

    public void run() {
        // 1. Достаточен ли вес собачки для совершения пробежки
        // 2. Если вес слишком мал - собачка должна поесть перед тренировкой
        while (this.weight < 3) {
            System.out.println("Мой вес: " + this.weight);
            System.out.println("Сорян, я слишком худая и голодная. Надо поесть!!");
            eat();
        }
        System.out.println("Я бегаю...");
        this.weight -= 2;
        System.out.println("Мой вес после пробежки: " + this.weight);
        System.out.println();
    }

    public void info() {
        System.out.println("I'm dog " + name + ", my weight: " + weight);
    }

}
