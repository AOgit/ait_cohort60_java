package homeworks.homework_32.task3;

public class NumericPair <T extends Number, E extends Number>{
    private T var1;
    private E var2;

    public NumericPair(T var1, E var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    public double sum() {
        return this.var1.doubleValue() + this.var2.doubleValue();
    }
}
