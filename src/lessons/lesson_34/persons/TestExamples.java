package lessons.lesson_34.persons;

import homeworks.homework_24.Calculator;
import lessons.lesson_27.Autobus;
import lessons.lesson_27.BusDriver;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TestExamples {

    //    @BeforeAll Выполняется один раз перед выполнением первого тестового метода
//    @AfterAll Выполняется один раз после выполнения всех тестовых методов


    // Метод, который выполняется перед КАЖДЫМ тестовым методом
    @BeforeEach
    void setUp(){
        System.out.println("Метод @BeforeEach setUp()");
    }
//    @AfterEach - метод выполняется после каждого тестового метода

//   @Disabled - указывает, что тест отключен и выполняться не будет

    // Test указывает, что метод является тестовым
    // Таким образом JUnit знает, что этот метод нужно запустить во время выполнения тестов
    @Test
    @Disabled
    public void testAddition() {
        System.out.println("Test addition");
        double result = Calculator.addition(2, 3);

        // Реальное / фактическое значение в переменной result
        // Ожидаемое значение - 5

        // Методы проверки утверждений
        Assertions.assertEquals(5, result); // метод проверяет равны ли 2 значения
        Assertions.assertNotEquals(0, result); // тест буден пройден, если результаты не совпадут
        Assertions.assertTrue(result > 3); // условие верное
        // Статический импорт позволяет использовать методы, без обращения к классу
        assertEquals(5, result);
        assertFalse(result > 10);
        assertNull(null); // Тест будет пройден, если объект равен null
        assertNotNull(result); // Проверяет что объект не равен null
    }

    @Test
    public void emptyTest() {
        System.out.println("Test empty");
        // Метод пройден, в котором нет ни одного неверного утверждения
    }

    // Параметризованные тесты

    @ParameterizedTest
    @ValueSource(strings = {"apple", "banana", "kiwi", "cherry"})
    public void testFruits(String fruit) {
        System.out.println("Current value: " + fruit);
        assertNotNull(fruit);
        assertTrue(fruit.length() > 4);
    }

    // Статистические свойства объектов сохраняются, а не сбрасываются
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    public void testStatic(int value) {
        System.out.println("Static value: " + value);
        Autobus bus = new Autobus(new BusDriver("Alex", "2323-2323"), 20);
        System.out.println(bus);
    }

    // Могут быть источники данных в формате CSV

    // Источник данных - метод
    @ParameterizedTest
    @MethodSource("testDataFruits")
    public void testMethodSourceFruits(String fruit) {
        System.out.println("Current fruit: " + fruit);
        assertNotNull(fruit);
    }

    static Stream<String> testDataFruits() {
        return Stream.of("apple", "banana", null,  "kiwi", "cherry");
    }

    @ParameterizedTest
    @MethodSource("testDataInt")
    void testMethodSourceInt(int value) {
        System.out.println("Current value: " + value);
        assertNotEquals(100, value);
    }

    static Stream<Integer> testDataInt() {
        return Stream.of(1, 2, -10, 0, 19);
    }

   @ParameterizedTest
   @MethodSource("testDataArguments")
    public void testMethodSourceArguments(int value, int expected, boolean isEquals) {
        System.out.println(value + " | " + expected + " | " + isEquals);
        int result = value + value;
        assertEquals(expected, result);
    }

    static Stream<Arguments> testDataArguments() {
        return Stream.of(
                Arguments.of(2, 4, true),
                Arguments.of(2, 4, false)

        );
    }

    @ParameterizedTest
    @MethodSource("testPersonData")
    void testMethodSourcePerson(Person person, String newEmail) {
        System.out.println("Current value: " + person);
        System.out.println("New email: " + newEmail);
    }

    static Stream<Arguments> testPersonData() {
        Person person = new Person("tttt@email.com", "pasdf2234#Po");

        return Stream.of(
                Arguments.of(person, "werwer@sdf.ru"),
                Arguments.of(new Person("werwer@we.ru", "Pa$$w0rd"), "asdf@.ru")
        );

    }
}