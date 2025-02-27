package lesson_23;

public class Cat {

    private String name;
    private int age;
    private int weight;
    protected boolean isProtected;
    boolean isDefault;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    // Геттеры и сеттеры - специальные публичные методыб дающие возможность
    // получать или изменять значение поля

   public int getAge() {
        return this.age;
   }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age){
//        if (age < 0 || age > 30) return;
//        this.age = age;

//        if (!(age < 0 || age > 30)) this.age = age;
        if (age > 0 && age < 30) this.age = age;
    }

    public void setWeight(int weight) {
        // Имеем возможность проверить входящее значение
        if (weight < 0) this.weight = 0;
        if (!(weight > 50)) this.weight = weight;
    }

    public void  sayMeow(){
        System.out.println("Meow! " + name);
    }

    public void testMethod(){
        System.out.println("Test!");
    }

    public String toString(){
        String result = String.format("Cat %s, age: %d, weight: %d", name, age, weight);
        return result;
    }


}
