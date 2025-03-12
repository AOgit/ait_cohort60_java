package lessons.lesson_30.flyable;

public interface Flyable {
   void fly();

   // Если два одинаоквых дефолных метода в разных интерфейсах
   // и оба имплементируем в один класс, тогда надо явно реализовывать также в классе,
   // иначе компилятор выдаст ошибку

//   default void methodA(){
//      System.out.println("default methodA in Flyable");
//   }
}
