package lessons.lesson_34.persons;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PersonTest {

    Person person;
    final static String START_EMAIL = "john@test.com";
    final static String START_PASSWORD = "qwerty1QS%";

    @BeforeEach
    void setUP() {
       person = new Person(START_EMAIL, START_PASSWORD);
    }

   // 1. Беру валидный E-mail
   // 2. Устанавливаю его сеттером person-y
   // 3. Мы ожидаем: что у person в поле email будет значение, которое мы установили в шаге 2
    @ParameterizedTest
    @ValueSource(strings = {"wr234234@csdf.we", "werwer@tww.com.de"})
    void testValidEmailSet(String validEmail) {
       person.setEmail(validEmail);
        Assertions.assertEquals(validEmail, person.getEmail());
    }

    // 1. Берем НЕ валидный email
    // 2. Устанавливаем его сеттером
    // 3. Ожидаемый результат: Email установлен не будет
    //      3.1 Поле email у person НЕ будет равно "не валидный email"
    //      3.2 Значение поля email осталось прежним

   @ParameterizedTest
   @ValueSource(strings = {"notvalidemail.de", "notnalid@ema@il.de", "notvalid@emaild.e", "notvalid@em%ail.de"})
    void testNotValidEmailSet(String NotValidEmail) {
        person.setEmail(NotValidEmail);
        Assertions.assertNotEquals(NotValidEmail, person.getEmail());
        Assertions.assertEquals(START_EMAIL, person.getEmail());
   }

    // 0. Беру валидный Password
    // 1. Устанавливаю его сеттером person-y
    // 2. Мы ожидаем: что у person в поле password будет значение, которое мы установили в шаге 2
    @ParameterizedTest
    @ValueSource(strings = {"Pa$$w-1rd", "qwerty.D1e"/*, "Pass"*/})
    void testValidPasswordSet(String validPassword) {
        person.setPassword(validPassword);
        Assertions.assertEquals(validPassword, person.getPassword());
    }

    @ParameterizedTest
    @ValueSource(strings = {"Pa$$w-1r", "PA$$W0RD", "pa$$w0rd", "Passw0rd", "Pa$$word"/*, "Pa$$w0rd"*/})
    void testNotValidPasswordSet(String notValidPassword) {
        person.setPassword(notValidPassword);
        Assertions.assertNotEquals(notValidPassword, person.getPassword());
        Assertions.assertEquals(START_PASSWORD, person.getPassword());
    }
}
