package homeworks.homework_28.task3;

public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(int width, int height){
       this.width = width;
       this.height = height;
    }

    @Override
    public void calculateArea(){
        System.out.println("Площадь прямоугольника: " + this.width * this.height);
    }

}
