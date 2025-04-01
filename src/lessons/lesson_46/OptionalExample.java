package lessons.lesson_46;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalExample {
    private static List<User> users = new ArrayList<>();
    static {
        users.add(new User(5, "Peter", 50));
        users.add(new User(15, "Max", 15));
    }

    public static void main(String[] args) {
        // Optional<T> - это класс-обертка, который может содержать значение типа T
        // Основная задача - уменьшить кол-во ошибок, возникающих при обращении к NULL


//       Optional<User> optUser = getById2(1);
//        System.out.println(optUser.get());


        Optional<User> optUser = getById(10);

        // boolean isPresent() - мы можем проверить, есть ли в обертке значение
        if(optUser.isPresent()) {
            // Метод get() - позволяет получить значение, завернутое в Optional
            // Если вызвать его на пусто (содержащим null) - получим NPE
            User user = optUser.get();
            System.out.println("User: " + user);
            System.out.println("Имя: " + user.getName());
        } else {
            System.out.println("Пользователь не найден");
        }
        // boolean isEmpty() - вернет true, если Optional пустой
        // orElse(T defaultValue) - распакует объект если он есть, или вернет значение по умолчанию

        User current = getById(1).orElse(null);
        System.out.println(current);


        //NPE NullPointerException
//        System.out.println(user.getName());

    }

   /*
   Как создать Optional
   Optional.of(value) - создает Optional, содержащий значение. (не пустой / не null)
   Если передать null - будет ошибка
   Optional.empty() - создает пустой empty
   Optional.ofNullable(value) - создает Optional, который содержит значение или пустой
    */


    // Обертка указывает на необходимость проверки на null
   public static Optional<User> getById(int id) {
        // Список пользователей
       // Перебираем пользователей, сравниваем id
       for (User user: users) {
           if (user.getId() == id) {
               return Optional.of(user);
           }
       }
       // TO DO
       return Optional.empty();
   }
    // Обертка указывает на необходимость проверки на null
    public static Optional<User> getById2(int id) {
        // Список пользователей
        // Перебираем пользователей, сравниваем id
        User result = null;

        for (User user: users) {
            if (user.getId() == id) {
                result = user;
            }
        }
        // TO DO
        return Optional.ofNullable(result);
    }

}
