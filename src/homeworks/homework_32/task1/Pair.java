package homeworks.homework_32.task1;

public class Pair<T> {
    private T var1;
    private T var2;

    public Pair(T var1, T var2) {
       this.var1 = var1;
       this.var2 = var2;
    }

    public T getFirst() {
       return this.var1;
    }

    public T getSecond() {
        return this.var2;
    }

    public void setFirst(T var) {
        this.var1 = var;
    }

    public void setSecond(T var) {
        this.var2 = var;
    }

    public void swap(){
        T temp = this.var1;
        this.var1 = this.var2;
        this.var2 = temp;
    }
}
