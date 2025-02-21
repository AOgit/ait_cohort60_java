package homework_18;
// Написать метод, принимающий на вход массив целых чисел.
// Метод должен вернуть массив, состоящий только из простых чисел, присутствующих в изначальном массиве
// вход -> {0, 13, -25, 11, 31, 55, 98, 11, 5} -> выход {13, 11, 31, 11, 5}

import java.util.Arrays;

public class Hw18Task3 {

    public static void main(String[] args) {
        int[] arrInt = {0, 13, -25, 11, 31, 55, 98, 11, 5};
        int[] arrPrimes = primeInt(arrInt);
        System.out.println(Arrays.toString(arrPrimes));
    }

    public static int[] primeInt(int[] numbers) {
        int[] arrTemp = new int[numbers.length];
        int quant = 0;
        for (int i = 0; i < numbers.length; i++) {
            // делаем изначально допущение, что число простое, после чего делаем проверку
            boolean isPrime = true;
            int num = numbers[i] > 0 ? numbers[i] : -numbers[i];
            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && num != 0) arrTemp[quant++] = numbers[i];
        }
//      return Arrays.copyOf(arrTemp, quant);
        int[] primeNumbers = new int[quant];
        for (int i = 0; i < quant; i++) primeNumbers[i] = arrTemp[i];
        return primeNumbers;
    }

}
