package homework_28.task3;

public class Square extends Shape{
    private int side;

    public Square(int side){
       this.side = side;
    }

    @Override
    public void calculateArea(){
        System.out.println("Площадь квадрата: " + this.side * this.side);
    }

}
