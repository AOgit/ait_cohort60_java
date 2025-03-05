package homework_26;

public class Hw26Task3 {
    public static void main(String[] args) {
        System.out.println(abbr("научно исследовательский институт"));
    }

    public static String abbr(String string) {
       String[] words = string.split(" ");
       StringBuilder str = new StringBuilder();
       for (int i = 0; i < words.length; i++) {
          str.append(words[i].charAt(0));
       }
       return str.toString().toUpperCase();
    }
}
