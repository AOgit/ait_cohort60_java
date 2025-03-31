package homeworks.homework_45;

import homeworks.homework_44.StringUtil;

import java.util.*;

public class FrequencyDictionary {
    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

        Map<String, Integer> frequencyMap = frequencyDictionary(text);
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));

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

    private static Map<Character, Integer> frequencyCharsDictionary(String text) {
        NavigableMap<Character, Integer> charMap = new TreeMap<>();
        for(char Ch: text.toCharArray()){
            charMap.put(Ch, charMap.getOrDefault(Ch, 0) + 1);
        }
        return charMap;
    }
}
