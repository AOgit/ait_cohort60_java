package lessons.lesson_30.interfaces;

public class Presentation implements ColorPrintable{
    private String title;
    private String author;
    private String thema;

    public Presentation(String title, String author, String thema) {
        this.title = title;
        this.author = author;
        this.thema = thema;
    }

    @Override
    public void colorPrint() {
        System.out.printf("Печатаю цветную презентацию: %s - %s - %s", title, author, thema);
    }

    @Override
    public void print() {
        System.out.printf("Печатаю чб презентацию: %s - %s - %s", title, author, thema);
    }
}
