package homeworks.homework_25;

public class ImmutablePoint {
    final int x;
    final int y;

    public ImmutablePoint(){
        this.x = 1;
        this.y = 2;
    }
    // Сеттеры создавать нет смысла после автоматической инициализации
    // (первоначального присвоения значений) переменным примитивного типа с ключом final в конструкторе
    // такие переменные не cмогут изменить повторно свое значение

    public static void printMessage(final String message) {
//        message = "New message";
//        java: final-Parameter message darf nicht zugewiesen werden
        // Ошибка компиляции, параметр с ключом final нельзя изменять внутри метода
        System.out.println(message);

    }
}
