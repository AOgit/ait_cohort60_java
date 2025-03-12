package homeworks.homework_28.task3;

public class Circle extends Shape{
    private int radius;

    public Circle (int radius){
       this.radius = radius;
    }

    @Override
    public void calculateArea(){
        System.out.println("Площадь круга: " + Math.PI * radius * radius);
    }

}
