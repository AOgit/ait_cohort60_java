package homeworks.homework_45;

import homeworks.homework_44.StringUtil;

import java.util.*;

public class FrequencyDictionary {
    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

        Map<String, Integer> frequencyMap = frequencyDictionary(text);
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));

        Map<String, Integer> frequencyMap1 = frequencyDictionary1(text);
        frequencyMap1.forEach((key, value) -> System.out.println(key + ": " + value));

        Map<String, Integer> frequencyMap2 = frequencyDictionary2(text);
        frequencyMap2.forEach((key, value) -> System.out.println(key + ": " + value));

        Map<String, Integer> frequencyMap3 = frequencyDictionary1(text);
        frequencyMap3.forEach((key, value) -> System.out.println(key + ": " + value));


        Map<Character, Integer> frequencyCharsMap = frequencyCharsDictionary(text);

        System.out.println("\nВхождение символов: ");
        frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v+ "; "));
        System.out.println();
    }

    private static Map<String, Integer> frequencyDictionary(String text) {
        Map<String, Integer> wordsMap = new LinkedHashMap<>();
            for(String word: StringUtil.stringToList(text)){
                wordsMap.put(word, wordsMap.getOrDefault(word, 0) + 1);
            }
            return wordsMap;
    }

    // Методы merge, compute - Методы используются для вычисления новых значений в карте
    // на основе ключ и значение
    private static Map<String, Integer> frequencyDictionary1(String text) {
        Map<String, Integer> wordsMap = new LinkedHashMap<>();
        for (String word : StringUtil.stringToList(text)) {
           /*
           compute(K key, BiFunction<K,V> remappingFunction)
           Метод compute позволяет вычислить новое значение ключа, используя функцию пересчета
           Новое значение может зависеть от текущего ключа и текущего значения
           Если функция пересчета вернет null,  то пара с текущим ключом удаляется из карты
            */
            wordsMap.compute(word, (key1, value) -> value == null ? 1 : ++value);

        }
        return wordsMap;
    }

    // Методы merge, compute - Методы используются для вычисления новых значений в карте
    // на основе ключ и значение
    private static Map<String, Integer> frequencyDictionary2(String text) {
        Map<String, Integer> wordsMap = new LinkedHashMap<>();
        for (String word : StringUtil.stringToList(text)) {

            // computeIfPresent - вычисляет новое значение, ТОЛЬКО ЕСЛИ ключу было ассоциировано
            // какое-то не null значение
            // get(key) возвращает null
            wordsMap.computeIfPresent(word, (key, value) -> value + 1);
            wordsMap.computeIfAbsent(word, key -> 1);

        }
        return wordsMap;
    }

    // Методы merge, compute - Методы используются для вычисления новых значений в карте
    // на основе ключ и значение
    private static Map<String, Integer> frequencyDictionary3(String text) {
        Map<String, Integer> wordsMap = new LinkedHashMap<>();
        for (String word : StringUtil.stringToList(text)) {
/*
            merge(K key, V newValue, BiFunction<K,V> remappingFunction)
            Метод merge используется для объединения значений по ключу
                - Если ключа нет (или вернул null), новое пара key:newValue вставляется в карту
                - Если ключ уже существует и вернул не-Null,  применяется функция объединения, которая может использовать старое и новое значения
*/
            wordsMap.merge(word, 1, (oldValue, newValue) -> oldValue + newValue);
        }
        return wordsMap;
    }



        private static Map<Character, Integer> frequencyCharsDictionary(String text) {
        NavigableMap<Character, Integer> charMap = new TreeMap<>();
        for(char Ch: text.toCharArray()){
            charMap.put(Ch, charMap.getOrDefault(Ch, 0) + 1);
        }
        return charMap;
    }
}
