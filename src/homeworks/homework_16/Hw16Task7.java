package homeworks.homework_16;

public class Hw16Task7 {
    public static void main(String[] args) {
//        Написать метод, который принимает массив строк.
//        Вывести на экран все символы самой длинной строки из массива.
//        Пример:
//        { "One", "Two", "Twenty" } ->
//        T
//                w
//        e
//                n
//        t
//                y

        // Cделаем допущение, что в массиве содержится только одна самая длинная строка
        // в противном случае, вначале нужно подсчитать кол-во самых длинных строк, потом
        // объявить массив с размером этого кол-ва и записать все длинные строки туда, а потом уже выводить
       String[] arrStr = new String[]{ "One", "Two", "Twenty", "Five" };
       int maxLenInx = 0;
       int i = 0;
       while (i < arrStr.length) {
           if(arrStr[i].length() > arrStr[maxLenInx].length()) maxLenInx = i;
           i++;
       }
//     System.out.println(arrStr[maxLenInx]);
       i = 0;
       while (i < arrStr[maxLenInx].length()) System.out.println(arrStr[maxLenInx].charAt(i++));
    }
}
