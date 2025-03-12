package homeworks.homework_21;

public class Fish {
    String name;
    boolean isFreshwater;
    int length;

    public Fish(String name, int length){
        this.name = name;
        this.length = length;
    }

    public void setFreshwater(boolean freshwater) {
        this.isFreshwater = freshwater;
    }

    public boolean getFreshwater() {
        return this.isFreshwater;
    }

    public void printFish() {
        System.out.printf("Name: %s, length: %d, live in fresh water: %b", this.name, this.length, this.isFreshwater);
    }
}
