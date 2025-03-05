package homework_26.task1;

public class Main {
    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle("прямоугольник №1", 4, 5);
//        Circle circle = new Circle("Круг №1", 7);
        Rectangle rectangle = new Rectangle("Прямоугольник №1");
        rectangle.setDimension(4,5);
        rectangle.name = "Прямоугольник №2";
        rectangle.displayInfo();
        rectangle.calculateArea();
        rectangle.setColor("green");
        rectangle.displayInfo();
        System.out.println("==========");

        Circle circle = new Circle("Круг №1");
        circle.setRadius(7);
        circle.name = "Круг №2";
//        Class <?> clazz = Circle.class;
//        System.out.println(clazz.getSimpleName() );
        circle.displayInfo();
        circle.calculateArea();
        circle.setColor("red");
        circle.displayInfo();
    }
}
