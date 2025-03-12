package lessons.lesson_17;

public class MethodsExample {
    public static void main(String[] args) {
       sayHello();

       char ch = 'A';
       printDecimalCodeOfChar(ch);
       char anotherChar = 'B';
       printDecimalCodeOfChar(anotherChar);
       printDecimalCodeOfChar('6');
       int[] array = {1, 23, 43, -13, 5, 234, 0, 123};
       printArray(array);
       int[] array2 = {1, 23, 24, -123, 23, 34};
       printArray(array2);
       String[] strings = {"Hello", "Java", "Test", "World"};
       printArray(strings);
    }

    public  static void testParameterOrder(String str, int x) {
        System.out.println("INT + STRING: " + x + " | " + str);
    }

    public  static void testParameterOrder(int x, String str) {
       System.out.println("INT + STRING: " + x + " | " + str);
   }

    public static void printArray(String[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i != array.length -1 ? ", " : "]\n"));
        }
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i != array.length -1 ? ", " : "]\n"));
        }
    }

    public static void sayHello() {
        System.out.println("Hello, World!");
    }

    public static void printDecimalCodeOfChar(char ch1) {
        System.out.println((int) ch1);
    }

}
