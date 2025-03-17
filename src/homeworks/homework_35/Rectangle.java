package homeworks.homework_35;

import _lists.MyArrayList;
import _lists.MyList;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    @Override
    public String toString() {
//        StringBuilder string = new StringBuilder("Прямоугольник [");
//        string.append("длина=").append(length);
//        string.append(" ширина=").append(width).append("]");
//        return string.toString();
        return String.format("Прямоугольник [длина=%s, ширина=%s]", length, width);
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length > 0 ? length : 0;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width > 0 ? width : 0;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Rectangle rectangle)) return false;
        return Double.compare(getLength(), rectangle.getLength()) == 0 && Double.compare(getWidth(), rectangle.getWidth()) == 0;
    }


    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(5, 10);
        Rectangle rectangle3 = new Rectangle(-5, 10);
        Rectangle rectangle4 = new Rectangle(-3, 10);

        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);
        System.out.println(rectangle4);
        System.out.println("Прямоугольник 1 равен прямоугольнику 2: " + rectangle1.equals(rectangle2));
        // По факту сравниваем только ширину, так как длина отрицательная
        // Логику сеттеров и сравнения можно прописать иную, в зависимости от техзадания
        System.out.println("Прямоугольник 3 равен прямоугольнику 4: " + rectangle3.equals(rectangle4));
        System.out.println();

        // Task 3
        MyList<Rectangle> rectangles = new MyArrayList<>();
        rectangles.add(new Rectangle(5.0, 3.0));
        rectangles.add(new Rectangle(4.0, 2.0));
        rectangles.add(new Rectangle(5.0, 3.0)); // Дубликат
        rectangles.add(new Rectangle(6.0, 4.0));
        rectangles.add(new Rectangle(5.0, 3.0)); // Дубликат

        System.out.println("Список до удаления дубликатов:");
//        System.out.println(rectangles);
        for (Rectangle rect : rectangles) {
            System.out.println(rect);
        }

        Rectangle rectangleToRemove = new Rectangle(5.0, 3.0);
        int result = RectangleUtils.removeDuplicates(rectangles, rectangleToRemove);
        String str = result > 0 ? String.format("Удалено %d дубликатa/ов", result) : "Дубликаты не найдены";
        System.out.println(str);

        System.out.println("\nСписок после удаления дубликатов:");
        for (Rectangle rect : rectangles) {
            System.out.println(rect);
        }
    }

}
