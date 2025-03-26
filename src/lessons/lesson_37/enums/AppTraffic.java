package lessons.lesson_37.enums;

import java.util.Arrays;

public class AppTraffic {
    public static void main(String[] args) {

        Colors color = Colors.RED;
        System.out.println("color = " + color);
        Colors[] colors = Colors.values(); // получаем все значения enum
        System.out.println(Arrays.toString(colors));

        // Возвращает константу Enum по указанному имени (строке)
        Colors red = Colors.valueOf("RED");

        // Enum безопасно сравнивать оператором == (не обязательно использовать equals())
        System.out.println(color == Colors.RED);
        // У каждой константы есть порядковый номер (начиная с нуля)
        System.out.println(color.ordinal());

    TrafficLight trafficLight = new TrafficLight("SN-001","Berlin", Colors.RED);
        System.out.println(trafficLight);
    }

}
