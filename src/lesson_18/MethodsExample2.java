package lesson_18;

public class MethodsExample2 {

    public static void main(String[] args) {
        int temp = 55;
        changeMe(temp);
        System.out.println(temp);

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printArray(numbers);
        changeMe(numbers);
        printArray(numbers);

        int[] link2 = numbers;
        link2[2] = -1000;
        printArray(numbers);
        printArray(link2);

        // null - ничто, специальное значение, указывающее, что ссылка не ссылается на объект в памяти
        numbers = null;
//        numbers[0] = 10; // Ошибка возникает во время работы программы NullPointerException
                         // Нельзя взять нулевой элемент у ничего
        link2[9] = 0;
        printArray(link2);
//         numbers = {1, 2, 3, 4}; // не работает, нужно создавать новый объект в памяти
        numbers = new int[]{10, 20, 30};
        printArray(numbers);

        String hello = "Hello";
        changeMe(hello);
        System.out.println("hello main: " + hello);
        String str2 = hello.toUpperCase(); // создается новый объект
    }

   public static void changeMe(String str){
       System.out.println("Start value: " + str);
       str = str + "!!!"; // создается новый объект (тип String иммутабельный, его изменить нельзя)
       System.out.println("str method: " + str);
   }

    public static void changeMe(int[] array){
        array[0] = 1000;
    }

    public static void changeMe(int x) {
        x = 100;
    }

    // Метод "красиво" выводящий все элементы массива ЦЕЛЫХ ЧИСЕЛ
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) { // перебираю индексы массива
            System.out.print(array[i] + (i != array.length - 1 ? ", " : "]\n"));
        }
    }

}
