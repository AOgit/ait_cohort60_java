package homeworks.homework_28.task3;

public class App {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{new Rectangle(4, 5), new Circle(5), new Square(8)};
        for (int i = 0; i < shapes.length; i++) {
           shapes[i].calculateArea();
        }
    }
}
