package homeworks.homework_28.task1_edit;

public class Human {
    protected int speed = 10;
    protected int restTime = 15;
    protected String typeRunner = "Человек";

   protected Human() {
       this(10, 15);
   }

    protected Human(int speed, int restTime) {
        this.speed = speed;
        this.restTime = restTime;
    }

    protected void run() {
        System.out.printf("%s бежит со скоростью %d км\n", this.typeRunner, this.speed);
        this.rest();
    }

    private void rest() {
        System.out.printf("%s необходим отдых %d мин\n", this.typeRunner, this.restTime);
    }

    @Override
    public String toString() {
        return   String.format("%s {speed: %d, restTime: %d}", this.getClass().getSimpleName(), this.speed, this.restTime);
    }
}
