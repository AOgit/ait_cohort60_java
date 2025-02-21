package lesson_18;

public class MethodsWithReturn {

    public static void main(String[] args) {
//        int sum = 10 + 5;
//        int res = calculateSum(10, 5);
//        System.out.println(res);

//        System.out.println(powTwo(3));
//        System.out.println(powTwo(0));

        test(2);
        test(3);
        test (4);


    }

    public static void test(int x) {
        // не печатать числаб если x = 3
        if (x == 3) {
            return; // прекращает работу метода
        }
        System.out.println(x);
    }

    public static int test(long x) {
        return -1;
    }
    public static int powTwo(int x) {
       int result = 1;
       for (int i = 0; i < x; i++) {
          result *= 2;
       }
       return result;
    }

    public static int calculateSum(int a, int b){
        int result = a + b;
        System.out.println(result);
        return result;
    }




}
