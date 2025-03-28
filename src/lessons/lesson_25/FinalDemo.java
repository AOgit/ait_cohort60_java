package lessons.lesson_25;

// Ключевое слово final. Может быть применено к классам, членам классов, переменным
public class FinalDemo {
   // После инициализации (присвоения первого значения) - изменить значение в переменной нельзя
//    private final int capacity = 10;
    private final int capacity;

    // Ссылочный тип данных. Нельзя изменить значение переменной (привязать новый объект)
    // Нельзя привязать новую ссылку. Но можно изменять состояние объекта
    private final int[] ints = new int[5];

    public FinalDemo(int capacity) {
        this.capacity = capacity;
        // Нельзя поменять значение final переменной
//        this.capacity++;

        // Нельзя присвоить ссылку на другой объект или null
//        this.ints = new int[2];
        // Но могу изменять состояние, например, элементы массива
        ints[0] = 100;
        ints[1] = 200;
        ints[2] = 300;
    }

    // Параметры метода тоже можно пометить как final
    // Внутри метода невозможно изменить значение переменной
   public void finalArguments(final int x, final int[] array) {
        // нельзя изменить x
//       x++;
       // не могу присвоить ссылку на новый объект
//       array = new int [10];
       // но могу изменять состояние объекта
       ints[0] = 100;
       ints[1] = 200;
       ints[2] = 300;
   }

}
