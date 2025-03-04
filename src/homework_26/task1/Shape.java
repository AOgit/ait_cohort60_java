package homework_26.task1;

public class Shape {
    protected String name;
    private String color;

    public Shape(String name) {
        this.name = name;
    }

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void displayInfo() {
        System.out.println("Имя фигуры: " + this.name + (this.color != null ? " Цвет фигуры: " + this.color : ""));
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
