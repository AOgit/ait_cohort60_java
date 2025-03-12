package lessons.lesson_21;

public class Cat {

    String name;
    String color;
    int age;

    // 1. Имя конструктора совпадает с именем класса
    // 2. Конструктор не имеет типа возвращаемого значения. Даже void не указывается
    // (так как автоматически возвращает экземпляр класса (объект))
    // 3. Конструктор вызывается автоматически при создании объекта
    // Конструктор по умолчанию
//    public Cat(){
//       // все поля получают значения по умолчанию для своего типа данных
//    }

    public Cat(String catName, String color) {
       this.name = catName;
       this.color = color;
       // Ключевое слово this используется внутри класса для ссылки на текущий объект
        // Оно поможет при разрешении конфликтов имен полей класса и параметров методов / конструктора
    }

    public Cat(String name, String color, int age) {
        this(name, color);
        this.age = age;
    }

    // Поведение будущих объектов
    public void sleep() {
        System.out.println("Я сплю!");
    }

    public void sayMeow() {
        System.out.println("Meow!");
    }

    public void run() {
        System.out.println("Я бегу!");
    }

    public void whoAmI() {
        System.out.printf("Я кот %s, возраст: %d, мой цвет %s\n", name, age, color);
    }

}
