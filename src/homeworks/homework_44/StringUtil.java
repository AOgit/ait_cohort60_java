package homeworks.homework_44;


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class StringUtil {

    public static Set<String> getUniqueSortedWords(String string) {
//        Comparator<String> comparator =  (String a, String b) -> a.length() - b.length();
//        Set<String> treeSet = new TreeSet<>(comparator);
//        Set<String> treeSet = new TreeSet<>((a, b) -> a.length() - b.length());

        SortedSet<String> treeSet = new TreeSet<>(Comparator.comparingInt(String::length));
        treeSet.addAll(stringToList(string));
        return treeSet;
    }

   private static List<String> stringToList(String string) {
       // заменить все Небуквы на пустоту
       String newString = string.replaceAll("[^a-zA-Zа-яА-я-1-9 ]", "");
//        newString = newString.replaceAll("\s+", " ");
       System.out.println(newString);
//        String str = String.join(" ", "Hello", "Java", "Test");
//        System.out.println(str);
       // Преобразование строки в массив слов
       String[] words = newString.split("\\s+");
       System.out.println(Arrays.toString(words));
       // Arrays.asList(T[] array) - преобразует массив в список (List)
       List<String> list = Arrays.asList(words);
       return list;
   }

    // Как по мне идеальная реализация
    public static char getFirstUniqueChar(String string) {
        // строку предварительно не чистил на ненужные символы
        for(char Ch: string.toCharArray()) {
            if(string.indexOf(Ch) ==  string.lastIndexOf(Ch)) return Ch;
        }
        return '\0';
    }

    // Потом бы регуляркой воспользовался
    public static String getFirstUniqueChar1(String string) {
        Pattern pattern = Pattern.compile("(.)(?!.*?\\1.*?$)");
        Matcher matcher = pattern.matcher(string);
        if (matcher.find()) return matcher.group();
        return "";
    }

    // Ну и использование Set для поиска
    public static char getFirstUniqueChar2(String string) {
        Set<Character> linkedHashSet = new LinkedHashSet<>();
        for(char Ch: string.toCharArray()) {
            if (!linkedHashSet.add(Ch)) linkedHashSet.remove(Ch);
        }
        return !linkedHashSet.isEmpty() ? linkedHashSet.iterator().next() : '\0';
    }
}
