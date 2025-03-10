package homework_29.shapes;

public class ShapesApp {
    public static void main(String[] args) {
        Circle circle = new Circle(-10);
        System.out.println(circle);
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(10);
        shapes[1] = new Rectangle(10, 20);
        shapes[2] = new Triangle(3,4, 5);
        shapes[3] = new Triangle(3,4, 18);

        double sumArea = 0;
        double sumPerimeter = 0;

        for (int i = 0; i < shapes.length; i++) {
            double area = shapes[i].area();
            double perimeter = shapes[i].perimeter();
            System.out.printf("%s площадь: %.2f, периметр: %.2f\n",
                    shapes[i].getClass().getSimpleName(), area, perimeter);
            sumArea += shapes[i].area();
            sumPerimeter += shapes[i].perimeter();
        }
        System.out.println("Сумма площадей: " + sumArea);
        System.out.println("Сумма периметров: " + sumPerimeter);

        CircleSingleTone circle1 = CircleSingleTone.getCircle(-5);
        System.out.println(circle1);

        CircleSingleTone circle2 = CircleSingleTone.getCircle(5);
        System.out.println(circle2);
    }
}
