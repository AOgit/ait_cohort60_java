package homework_18;

import java.util.Arrays;
// Написать метод, принимающий на вход массив строк.
// Метод должен вернуть массив, состоящий из самой короткой и самой длинной строки изначального массива.
public class Hw18Task2 {

    public static void main(String[] args) {
        String[] arrStr = {null, "five", null, "twenty", "thousand"};
//        String[] arrStr = {null, null, null, null};
        System.out.println(Arrays.toString(shortLongStr(arrStr)));
    }

    public static String[] shortLongStr(String[] arrStr) {

        if (arrStr == null || arrStr.length == 0) return new String[0];

        String min = null;
        String max = null;
        for (int i = 0; i < arrStr.length; i++)
        {
            if(arrStr[i] == null && min == null) continue;
            if(min == null){
                min = arrStr[i];
                max = arrStr[i];
            }

            if (arrStr[i] != null && min.length() > arrStr[i].length()) min = arrStr[i];
            if (arrStr[i] != null && max.length() < arrStr[i].length()) max = arrStr[i];
        }
        return new String[]{min, max};
    }

}
