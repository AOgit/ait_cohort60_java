package homeworks.homework_16;

public class Hw16Task6 {
    public static void main(String[] args) {
//        Дан массив целых чисел. Поменять местами элементы с максимальным и минимальным значениями.
//        Пример:
//        { 5, 6, -25, 0, 31, -15 } -> { 5, 6, 31, 0, -25, -15 }
          int[] numbers = new int[]{ 5, 6, -25, 0, 31, -15 };
          int inx_min = 0;
          int inx_max = 0;
          int i = 1;
          while (i < numbers.length){
              if(numbers[inx_max] < numbers[i]) inx_max = i;
              if(numbers[inx_min] > numbers[i]) inx_min = i;
              i++;
          }
          int max = numbers[inx_max];
          numbers[inx_max] = numbers[inx_min];
          numbers[inx_min] = max;
//          i = 0;
//          while (i < numbers.length) system.out.print(numbers[i++] + " ");
    }
}
