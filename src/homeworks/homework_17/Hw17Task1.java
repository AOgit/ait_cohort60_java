package homeworks.homework_17;
// Написать метод, принимающий на вход строку. Метод должен вывести на экран число,
// соответсвующее количеству символов в строке.
// Например: Если в метод пришла строка "hello" - метод должен вывести число 5
// (так как в строке hello 5 символов)
public class Hw17Task1 {

    public static void main(String[] args) {
        stringLength("hello");
    }

    public static void stringLength(String str){
        System.out.println(str.length());
    }

}
