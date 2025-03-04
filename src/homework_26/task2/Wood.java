package homework_26.task2;

public class Wood extends Material {
    private double density;

    public Wood(String name, double density) {
        super(name);
        this.setDensity(density);
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density > 0 ? density : 0;
    }
}
