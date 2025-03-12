package homeworks.homework_14;

public class Hw14Task1 {
    public static void main(String[] args) {
//        Task 1
//        Дан текст Programming is fun.
//                Напишите программу, которая проверяет, содержит ли эта строка слово “fun”,
//                и выведите результат в виде булевой переменной.
        boolean isContFun = "Programming is fun".contains("fun");
        System.out.println(isContFun);
    }
}
