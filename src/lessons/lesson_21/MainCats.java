package lessons.lesson_21;

public class MainCats {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", "Червоний");
        cat.sayMeow();
        cat.run();
        cat.sleep();

        System.out.println("Имя кота: " + cat.name);
        System.out.println("Возраст кота: " + cat.age);
        System.out.println("Цвет кота: " + cat.color);
        cat.whoAmI();
        System.out.println("================");
        Cat cat1 = new Cat("Васька", "Schwarz", 3);
        System.out.println("Имя кота: " + cat1.name);
        System.out.println("Возраст кота: " + cat1.age);
        System.out.println("Цвет кота: " + cat1.color);

        System.out.println("================");
        Cat catClone = cat1;
        catClone.whoAmI();
        System.out.println("================");
        cat1.age = 7;
        catClone.whoAmI();
        System.out.println("================");
        catClone = new Cat("Caesar", "white", 5);
        catClone.whoAmI();
        catClone = null; // переменная не ссылается ни на какой объект
    }
}
