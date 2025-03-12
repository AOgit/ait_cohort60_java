package homeworks.homework_28.task1_edit;

public class App {
    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human);
        human.run();
        System.out.println(new Amateur());
        new Amateur().run();
        System.out.println(new Profi());
        new Profi().run();
    }
}
