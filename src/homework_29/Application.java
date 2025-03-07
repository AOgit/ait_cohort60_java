package homework_29;

public class Application {
    public static void main(String[] args) {
        GameCharacter[] characters = {new Archer(), new Mage(), new Warrior()};

        for (int i = 0; i < characters.length; i++) {
            System.out.printf("%s. Защищайся!\n", characters[i].attack());
        }
    }
}
