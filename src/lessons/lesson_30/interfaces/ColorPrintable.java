package lessons.lesson_30.interfaces;

// Может расширять другой интерфейс
public interface ColorPrintable extends Printable {
    // Дочерний интерфейс наследует все методы родительского интерфейса
    void colorPrint();
}
