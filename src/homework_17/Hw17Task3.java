package homework_17;
//Написать метод, принимающий на вход целое число. Метод должен вывести на экран 2 в степени этоЧисло
//Например: Если в метод пришло число 3 - метод должен вывести число 8 (так как 2 в степени 3 = 8)
//класс Math для нахождения степени числа использовать нельзя ;)
//P.S. А почему вы решили, что число может прийти только положительное? ;)

public class Hw17Task3 {

    public static void main(String[] args) {
        numberPower(4);
        numberPower(-4);
        numberPower(0);
    }

    public static void numberPower(int num){
//        System.out.println(Math.pow(2, num));
        double res = 1;
        for (int i = 0; i < (num > 0 ? num : -num); i++) res *= 2;
        System.out.println(num > 0 ? (int)res : 1 / res);
    }

}
