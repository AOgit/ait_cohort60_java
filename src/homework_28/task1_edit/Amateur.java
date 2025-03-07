package homework_28.task1_edit;

public class Amateur extends Human {
    {
        typeRunner = "Спортсмен-амaтор";
    }
    protected Amateur() {
       super(10, 15);
    }

    protected Amateur(int speed, int restTime){
        super(speed, restTime);
    }
}
