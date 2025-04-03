package homeworks.homework_47;

import java.util.List;

public class Taks2 {

    public static void main(String[] args) {
        List<String> quotes = List.of(
                "Жизнь — это то, что происходит, пока ты строишь планы. @ Джон Леннон",
                "Не стоит ждать идеальных условий для начала. Начни там, где ты есть, используй то, что у тебя есть. @ Артур Аш",
                "Мы строим свои мечты, а жизнь между ними. @ Джонатан Ливингстон",
                "Будущее зависит от того, что мы делаем в настоящем. @ Махатма Ганди",
                "Жизнь — это не то, что с нами происходит, а то, как мы на это реагируем. @ Эпиктет"
        );
        System.out.println(stringsFilter(quotes, 'ж'));

    }

    private static List<String> stringsFilter(List<String> list, char ch) {
        return list.stream()
//                .filter(string -> string.toLowerCase().toCharArray()[0] == Character.toLowerCase(ch))
//                .filter(s -> s.charAt(0) == ch)
//                .filter(s -> s.substring(0,1).equalsIgnoreCase(String.valueOf(ch)))
                .filter(s -> s.toUpperCase().startsWith(String.valueOf(ch)))
                .sorted()
                .map(string -> String.format("\n%s", string))
                .toList();
    }
}
