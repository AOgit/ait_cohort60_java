package lesson_30.flyable;

// если хоть один из методов имплементированного интерфеса не реализован, значит
// такой клас нужно объявить абстрактным
public class Airplane extends Transport implements Flyable{
    public Airplane(int capacity) {
        super(capacity);
    }

    @Override
    public boolean takePassenger(){
        if (amountPassengers < capacity){
            amountPassengers++;
            return true;
        }
        return false;
    }

    @Override
    public void fly() {
        System.out.println("Airplane flying");
    }
}
