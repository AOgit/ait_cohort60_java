package homework_17;
//Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.
//        {1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]
//   Перегрузить метод, если в него приходит массив + индекс,
//   то часть массива слева до этого индекса распечатывается в обычном порядке,
//   а начиная с этого индекса в обратном:
// {1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]


public class Hw17Task2 {

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 4, 3, 6, 7};
        arrRevers(numbers);
        arrRevers(numbers, 2);
    }

    public static void arrRevers(int[] numbers, int inx) {
        System.out.print("[");
        for (int i = 0; i < inx; i++){
            System.out.print(numbers[i] + ", ");
        }
        for (int i = numbers.length - 1; i >= inx; i--){
            System.out.print(numbers[i] + (i == inx ? "]\n" : ", "));
        }
    }

    public static void arrRevers(int[] numbers) {
        System.out.print("[");
        for (int i = numbers.length - 1; i >= 0; i--){
            System.out.print(numbers[i] + (i == 0 ? "]\n" : ", "));
        }
    }

}