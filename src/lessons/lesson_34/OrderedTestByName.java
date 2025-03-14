package lessons.lesson_34;

// Тесты будут выполняться в алфавитном порядке
// названий тестовых методов

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class OrderedTestByName {

    @Test
    void testB() {
        System.out.println("testB");
    }

    @Test
    void testA() {
        System.out.println("testA");
    }

    @Test
    void testC() {
        System.out.println("testC");
    }

    @Test
    void testL() {
        System.out.println("testL");
    }
}
