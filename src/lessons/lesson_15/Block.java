package lessons.lesson_15;

public class Block {
    public static void main(String[] args) {

       int x = 10;

//       Анонимный блок
        {
            int y = 5;
            x = x + y;
            System.out.println(x);
            System.out.println(y);
        }

//        x = x + y; // Переменная y не доступна вне своей области видимости
        int y = 124;

    }
}
