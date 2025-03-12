package lessons.lesson_30.interfaces;

public class Application {
    public static void main(String[] args) {
        Book book = new Book("Мастер и Маргарита", "Булгаков М.");
        book.print();
        Journal journal = new Journal("Cosmopolitan", 154);
        journal.print();
        // Тип ссылки
        // Набор методов, доступных по ссылке - методы, которые прописаны в интерфейсе
        // Объект класса, который реализовал данный интерфейс
        Printable printable = journal; // Неявное автоматическое приведение типа ссылки
        Printable printable1 = new Book("Философия Java", "Б. Эккель");

        journal.defaultMethod();

        Printable.testStaticMethod("Hello!");

        System.out.println("\n=========================");

        ColorPrintable presentation = new Presentation("Inheritance", "NonameAuthor", "Inheritance in OOP");

        presentation.print();

        presentation.colorPrint();
    }
}
