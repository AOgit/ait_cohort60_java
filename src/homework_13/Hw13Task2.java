package homework_13;

public class Hw13Task2 {
    public static void main(String[] args) {

//        Task 2
//        Создайте строки:
//        "Java"
//        "is"
//        "a"
//        "powerful"
//        "language"
//        Склейте эти строки двумя разными способами, чтобы получить строку: "Java is a powerful language".
//                Выведите на экран получившуюся строку и её длину.}

        String java = "Java";
        String is = "is";
        String a = "a";
        String powerful = "powerful";
        String language = "language";
        String conResult = java.concat(" ").concat(is).concat(" ").concat(a).concat(" ").concat(powerful).concat(" ").concat(language);
        conResult = String.join(" ", java, is, a, powerful, language);
        System.out.println(conResult + " " + conResult.length());

//        Task 2.2
//        Замените в результирующей строке слово "powerful" на "super".
//                Опционально Создайте переменную типа boolean с ответом на вопрос: содержит ли строка подстроку "age"?
//                Выведите на экран значение этой переменной.


        String javaSuper = conResult.replace("powerful", "super");
//        System.out.println(javaSuper);
        boolean isSubAge = javaSuper.contains("age");
        System.out.println(isSubAge);
    }
}
