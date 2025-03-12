package homeworks.homework_25;

import java.util.Random;

public class Dog {

    private String name;
    private int jumpHeight; // текущая высота прыжка в см
    private int jumpMax; // максимальная высота прыжка собаки
    private int prizes; // кол-во медалей выигранных собакой
    private static int totalDogs; // общее кол-во наград выигранных всеми собаками
    private static int totalPrizes; // общее кол-во наград выигранных всеми собаками
    private static final int MAX_HEIGHT = 200; // 191 cm мировой рекорд прыжка собаки в высоту

    // сомневаюсь, что целесообразно создавать в классе массив барьеров, а не выносить его в App
    // но пускай будет, потренируюсь создавать в классе static block initialization
    public static int[] barriers = new int[7];

    static {
        Random random = new Random();
        for (int i = 0; i < barriers.length; i++) barriers[i] = random.nextInt(70, 171);
    }

   public Dog(String name) {
       this.name = name;
       Random random = new Random();
       this.jumpHeight = random.nextInt(30, 81);
       this.jumpMax = this.jumpHeight * 2;
       totalDogs++;
   }

    public Dog(String name, int jumpHeight) {
        this.name = name;
        if(jumpHeight < 0){
            this.jumpHeight = 0; // собака не умеет прыгать и не научиться (
            System.out.println("Я очень ленивая собака. Тренировкам не поддаюсь...");
        }else if (jumpHeight  > MAX_HEIGHT) {
            System.out.println("Кто ты воин? :) Новый чемпион или очередной обманщик?");
            System.out.printf("Ладно, давай представим, что ты прыгаeшь в высоту %d см\n", MAX_HEIGHT);
            this.jumpHeight = MAX_HEIGHT;
        }else {
            this.jumpHeight = jumpHeight;
        }
        this.jumpMax = Math.min(this.jumpHeight * 2, MAX_HEIGHT);
        totalDogs++;
    }

    public String getName() {
        return this.name;
    }

    public static int getTotalDogs() {
        return totalDogs;
    }

    public static int getTotalPrizes() {
        return totalPrizes;
    }

    public static void pause(double sec){
        if (sec < 0) return;
        if (sec > 10) sec = 10;
        try {Thread.sleep((int) (sec * 1000));} catch (InterruptedException e) {}
    }

    public int getPrizes() {
        return this.prizes;
    }

    // для реалистичности каждый прыжок будет давать + 1 см в высоту
    private void jumping(){
        System.out.println("Прыгаю...");
        if (this.jumpHeight < this.jumpMax) this.jumpHeight++;
       pause(0.2);
    }

    public void training() {
        // Проверяем есть ли вообще смысл гонять псину
        if (this.jumpHeight == this.jumpMax) {
            System.out.println("Тренируйся не тренируйся, все равно выше не прыгну!");
            pause(1);
            return;
        }
        Random random = new Random();
        int addHeight = random.nextInt(7, 11);
        // Проверяем рандомное число на непревышение максимума
        if (this.jumpHeight + addHeight > this.jumpMax) {
            addHeight = this.jumpMax - this.jumpHeight;
        }
        System.out.println("Начинаю тренировку...");
        // Ждем пока потренируется
        //        try {Thread.sleep(addHeight * 1000);}catch (InterruptedException e) {}
        //        this.jumpHeight += addHeight;
        // Для реалистичности положим набор высоты в jumping()
        for (int i = 1; i <= addHeight; i++) this.jumping();
        System.out.printf("Тренировка окончена. Теперь я прыгаю на %d см выше. Нужен отдых\n", addHeight);
        pause(0.5);

    }

    public void jumpBarrier(int height) {
        System.out.printf("Высота барьера: %d см\n", height);
        pause(1);
        if (height < 0) {
            System.out.println("Ты мне предлагаешь прыгнуть в яму???");
            pause(1);
            return;
        } else if (height > MAX_HEIGHT) {
            System.out.println("Ты это серьезно?? Давай тогда я буду лучше учиться летать, а не прыгать!");
            pause(1);
            return;
        }
        if (height <= this.jumpMax){
            while (this.jumpHeight < height) {
                System.out.printf("Текущая высота прыжка в %s см недостаточна, нужна еще тренировка\n", this.jumpHeight);
                pause(1);
                this.training();
            }
                System.out.println("К победе готов!");
                pause(1);
                System.out.println("Подбегаю к барьеру...");
                pause(1);
                this.jumping();
                System.out.println("Барьер взят, медалька получена!");
                pause(1);
                this.prizes++;
                totalPrizes++;
        } else {
            System.out.printf("Эй, я ведь тебе не кенгуру на такую высоту прыгать!! Даже с тренировками выше %d см не прыгну!\n", this.jumpMax);
            pause(1);
        }
    }

    public String toString() {
        return String.format("Имя: %s, текущая высота прыжка: %d см, максимальная высота прыжка: %d см", this.name, this.jumpHeight, this.jumpMax);
    }

}
