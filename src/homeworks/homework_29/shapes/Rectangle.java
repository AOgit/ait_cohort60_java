package homeworks.homework_29.shapes;

public class Rectangle extends Shape {
    private double sideA;
    private double sideB;

    public  Rectangle(double sideA, double sideB) {
        if(sideA < 0 || sideB < 0) return;
        this.sideA = sideA;
        this.sideB = sideB;
    }

   @Override
   public double area() {
       return sideA * sideB;
   }

   @Override
    public double perimeter() {
        return 2 * (sideA + sideB);
   }
}
