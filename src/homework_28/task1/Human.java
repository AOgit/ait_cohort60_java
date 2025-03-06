package homework_28.task1;

public class Human {
    protected int speed = 10;
    protected int restTime = 15;

    protected void run() {
        System.out.printf("Бегу со скоростью %d км\n", this.speed);
        this.rest();
    }

    private void rest() {
        System.out.printf("Необходим отдых %d мин\n", this.restTime);
    }

    @Override
    public String toString() {
        return   String.format("%s {speed: %d, restTime: %d}", this.getClass().getSimpleName(), this.speed, this.restTime);
    }
}
