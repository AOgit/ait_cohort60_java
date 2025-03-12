package lessons.lesson_28.animals;

public class TestToString {
    private  String title;

    public TestToString(String title) {
        this.title = title;
    }

    public static void main(String[] args) {

        TestToString test = new TestToString("test");

       // У всех классов есть родитель Object ->
       // у объекта любого класса есть метод toStirng (полученный от Object)
        // когда мы передаем ссылку на объект в место, где она должна быть преобразована в строку
        // (sout или конкатенация со строкой
        //

        System.out.println(test);
    }

}

