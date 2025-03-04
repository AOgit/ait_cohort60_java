package homework_26.task1;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String name) {
        super(name);
    }

    public Rectangle(String name, double width, double height) {
        super(name);
        this.setDimension(width, height);
    }

    public void setDimension(double width, double height) {
        this.setWidth(width);
        this.setHeight(height);
    }

    public void calculateArea() {
        System.out.println("Площадь прямоугольника: " + this.width * this.height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width > 0 ? width : 0;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height > 0 ? height : 0;
    }
}
