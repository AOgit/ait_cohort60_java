package lessons.lesson_45;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;

public class MapExample {
    public static void main(String[] args) {
//        Map<Integer, String> oldTable = new Hashtable<>(); // Устаревшая, медленная. Не рекомендуется к использованию
        Map<String, String> phoneBook = new HashMap<>();

        // Добавить пару ключ-значение
        // V put (K key, V value) -> возвращает старое значение
        // Если такого ключа еще не было - вернет null
        System.out.println(phoneBook.put("Hanna", "+49-11111"));
        phoneBook.put("Max", "+49-222222");
        phoneBook.put("John", "+49-33333");

        System.out.println("phoneBook: " + phoneBook);

        String oldValue = phoneBook.put("John", "+49-44444");
        System.out.println("oldValue: " + oldValue);
        System.out.println("phoneBook: " + phoneBook);

        System.out.println("================ GET ================");

        // Взятие значения по ключу
        // V get (K key) - возвращает значение по ключу. Если ключа нет - вернет null
        String value = phoneBook.get("Hanna");
        System.out.println("phoneBook.get(\"Hanna\"): " + value);

        Map<String,String> book2 = new HashMap<>();
        book2.put("Sebastian", "+49-55555");
        book2.put("Michael", "+49-77777");

        // putAll - принимает карту (Map) и копирует все пары ключ-значение из этой карты
        phoneBook.putAll(book2);

        System.out.println("phonebook: " + phoneBook);

        // boolean containsKey(Object key) - вернет True, если карта содержит такой ключ
        // boolean containsValue(Object value) - вернет True, если карта содержит такое значение

        System.out.println("Michael: " + phoneBook.containsKey("Michael"));
        System.out.println("Michael_789: " + phoneBook.containsKey("Michael_789"));
        System.out.println("+49-44444: " + phoneBook.containsValue("+49-44444"));

        // getOrDefault(Object key, V defaultValue)
        // Возвращает значение по ключу. Если ключа нет - вернет значение по-умолчанию (второй параметр метода)

        String val2 = phoneBook.getOrDefault("Hanna", "Default");
        System.out.println(val2);
        val2 = phoneBook.getOrDefault("Key", "Default");
        System.out.println(val2);

        System.out.println(Objects.hashCode(null)); // hashCode null равен 0

        // 16 buckets. Коэффициент заполнения 0.75
        Map<Integer, String> construct = new HashMap<>(); // Создается пустой список ключ-значение
        construct = new HashMap<>(30, 0.90f); // Создается пустой словарь на 32 ячейки
        // (так как хеширование работает только со степенью двойки) Коэффициент заполнения 0.9

        Map<Integer, String> otherMap = new HashMap<>();
        otherMap.put(1, "a");

        construct = new HashMap<>(otherMap);
        System.out.println("construct: " + construct);

        // V remove(Object key) - удаляет пару ключ-значение. Возвращает старое значение или null
        // V remove(Object key, Object value) - удаялет пару ключ-значение, только если оба соответствуют

        System.out.println("phoneBook: " + phoneBook);
        System.out.println(phoneBook.remove("Sebastian")); // Ключ есть. Удалит пару. Вернет старое значение
        System.out.println("phoneBook: " + phoneBook);
        System.out.println(phoneBook.remove("Sebastian")); // Ключа нет, вернет null

        // void clear() - очищает карту
        // int size()
        System.out.println(phoneBook.size());
        // boolean isEmpty() - вернет true, если словарь пустой







    }
}
