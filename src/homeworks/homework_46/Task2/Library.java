package homeworks.homework_46.Task2;

import java.util.*;

public class Library {
    static Set<Book> books = new HashSet<>();
    static {
        books.add(new Book("Мартин Иден", "Джек Лондон" ));
        books.add(new Book("Чайка по имени Джонатан Ливингстон", "Ричард Бах"));
    }

    public static void main(String[] args) {
        String[] titles = {"Мартин Иден", "Эркюль Пуаро"};
        for (String title: titles) {

            Optional<Book> OptionalBook = findBookByTitle(title);
            if (OptionalBook.isPresent()){
                Book book = OptionalBook.get();
                System.out.printf("Книга \"%s\" найдена, автор: %s\n", book.getTitle(), book.getAuthor());
            } else {
                System.out.printf("Книга \"%s\" не найдена\n", title);
            }

        }
    }
    public static Optional<Book> findBookByTitle(String title) {
        for (Book book: books) {
            if (book.getTitle().equals(title)) return Optional.of(book);
        }
        return Optional.empty();
    }
}
