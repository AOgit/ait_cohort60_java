package lessons.lesson_46;

import java.util.*;

public class MapExample3 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "red");
        map.put(4, "green");
        map.put(15, "yellow");
        map.put(16, "blue");
        map.put(0, "white");
        map.put(100, "black");
        map.put(17, "orange");
        map.put(7, "red");

        // Collection<V> values()  -  возвращает коллекцию всех значений карты
        Collection<String> values = map.values();
        System.out.println("map.values(): " + values);
        // Set<K> keySet() - возвращает set, состоящий из всех ключей карты
        Set<Integer> keys = map.keySet();
        System.out.println("map.keySet(): " + keys);

        // могу перебрать ключи в цикле и получить все значения
        for (Integer key: keys) {
            System.out.println(map.get(key) + "; ");
        }
        System.out.println();

        keys.remove(17);
        System.out.println("keys: " + keys);
        System.out.println("map: " + map);

       // Внимание! Метод keySet i values возвращают
        // представление / проекция (view) соответстующих ключей и значений карты
        // Эта проекция поддерживается самой картой, что означает, что они напрямую связаны с внутренними данными Map
        // Поэтому любые изменения, внесенные в эти представления, отражаются на исходной карте.
        // Причем эта связь двусторонняя.
        System.out.println("============================");
        System.out.println(map);
        values.remove("green");
        System.out.println("values: " + values);
        System.out.println("map: " + map);
        System.out.println("keys: " + keys);
        System.out.println("=============map.remove=================");
        map.remove(16);
        System.out.println("map: " + map);
        System.out.println("values: " + values);
        System.out.println("keys: " + keys);
        System.out.println("===================");
        // удалить один или несколько объектов
//        values.remove("red");
        values.removeAll(List.of("red"));
        System.out.println("map: " + map);
        System.out.println("values: " + values);
        System.out.println("keys: " + keys);

       Set<Integer> keysCopy = map.keySet();
       keysCopy.
               remove(0);
        System.out.println("keysCopy: " + keysCopy);
        System.out.println("map: " + map);
        System.out.println("===================");
        // Чтобы разорвать связь нужно явно создать новый сет:
        Set<Integer> keysCopy1 = new HashSet<>(map.keySet());
        keysCopy1.remove(100);
        System.out.println("keysCopy: " + keysCopy1);
        System.out.println("map: " + map);

        System.out.println("===================");
        // Set<Map.Entry<Integer, String>> entrySet() - возвращает set вхождений всех пар ключ-значений
        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.println("entry: " + entry + " | " + entry.getKey() + " => " + entry.getValue());
            entry.setValue("Java!");
        }
        System.out.println(map);

        // foreach - перебор всех пар ключ-значение с возможностью применить к ним какую-то функцию
        System.out.println("========================");
        System.out.println(map.put(11, "orange")); // если такого ключа нет - добавляется новая пара ключ-значение
        // если ключ уже есть - значение будет переписано
        // и возвращено старое значение
        System.out.println(map.put(11, "green"));
        System.out.println("map: " + map);
        // replace (K,V) - Если такого ключа нет, новая пара НЕ создается
        System.out.println(map.replace(200, "red")); // ключа нет - новая пара НЕ добавляется
        // Если ключ есть - значение будет переписано
        // И возврат старое значение
        System.out.println(map.replace(15, "red"));
        System.out.println(map);

        System.out.println("================ forech =====================");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            // могу что-то делать с этими значениями
            System.out.println(key + ": " + value);
        }
        System.out.println("==================================");
        // foreach() - Перебор всех пар ключ-значение с возможностью применить к ним какую-то функцию
        map.forEach((k, v) -> System.out.println(k + "= " + v));
        map.forEach((key, value) -> {
            System.out.println("Iteration: ");
            System.out.println("key: " + key + " | Value: " + value);
            System.out.println("=====================");

        });

    }
}
