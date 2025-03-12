package lessons.lesson_29.children;

public class Parent {
     String name;
    // автоматически добавляется при компиляции пустой конструктор
     // если нет явно указанных
//    public Parent(){
//    }
     public Parent(String name) {
          this.name = name;
     }

     final void show() {
          System.out.println("Show must go on");
     }

}

