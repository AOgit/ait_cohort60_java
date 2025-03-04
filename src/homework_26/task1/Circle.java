package homework_26.task1;

public class Circle extends Shape{
    private double radius;
    public static final double PI = 3.141592653589793;

    public Circle(String name) {
        super(name);
    }

    public Circle(String name, double radius) {
        super(name);
        this.setRadius(radius);
    }

    public void calculateArea(){
        System.out.println("Площадь круга: " + Circle.PI * Math.pow(radius, 2) );
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius > 0 ? radius : 0;
    }
}
