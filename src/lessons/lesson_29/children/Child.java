package lessons.lesson_29.children;

public class Child extends Parent {
     int age;
     // Если нет явных конструкторов то при компиляции будет добавлен конструктор
//    public Child() {
//        super();
//    }
    public Child() {
        // сначала я ДОЛЖЕН создать объект родителя,
        // иначе Java автоматически добавит пустой конструктор родителя
        // super() // если пустого конструктора нет, ошибка
        // ПОЭТОМУ лучше ЯВНО ВЫЗЫВАТЬ?? конструктор родителя в конструкторе ребенка
        super("Default");
        this.age = 20;
    }

    public Child (String name, int age) {
        // если не объявить конструктор, будет ошибка
        // так как в родителе нет пустого конструктора
        // а есть конструктор с полями
        super(name);
    }

    // невозможно переопределять final method в наследниках
//    @Override
//    void show() {
//        System.out.println("Another show");
//    }
}
