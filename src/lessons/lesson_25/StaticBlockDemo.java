package lessons.lesson_25;

public class StaticBlockDemo {
    static int counter = 5;
    static String[] colors = new String[3];

    private String title;
    private int capacity = 10;

    // Статистический блок инициализации
    // Вызывается ровно один раз в момент загрузки класса в JVM (до вызова конструктора)
    static {
        System.out.println("Static Block RUN");
        colors[0] = "red";
        colors[1] = "green";
        colors[2] = "yellow";
    }

  // НЕ статический блок инициализации
  // Выполняется при каждом создании объекта
  // Вызывается до конструктора
    {
        System.out.println("NON-static block RUN!");
        this.title = "Default";
        if (counter ==0) {
            this.capacity = 50;
        }
    }


    public StaticBlockDemo() {
        System.out.println("Constructor RUN");
    }

    public StaticBlockDemo(String title) {
        System.out.println("Constructor 2 RUN!");
        this.title = title;
    }

    static {
        System.out.println("Second static RUN");
    }


    public String toString() {
        return String.format("Title: %s, capacity: %d, static-counter: %d", title, capacity, counter);
    }

}
