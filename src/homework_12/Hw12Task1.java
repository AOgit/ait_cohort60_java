package homework_12;

public class Hw12Task1 {
    public static void main(String[] args) {
//        Task 1
//        Объявите 4 переменных типа int со значениями 0, 1, 2, 3.
//        Объявите ещё одну переменную int и сохраните в неё сумму этих переменных, деленную на 4. Получается,
//            у вас будет среднее арифметическое этих чисел в одной переменной.
//                Выведите на экран значение переменной.
//        Сколько программа отбросила в остаток при операции деления?
        int var1 = 0;
        int var2 = 1;
        int var3 = 2;
        int var4 = 3;
        int result = (var1 + var2 + var3 + var4) / 4;
        int result1 = (var1 + var2 + var3 + var4) % 4;
        System.out.println(result);
        System.out.println(result1);
    }
}
