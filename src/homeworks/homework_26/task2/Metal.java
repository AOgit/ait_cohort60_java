package homeworks.homework_26.task2;

public class Metal extends Material {
    private double hardness;

    public Metal(String name, double hardness) {
        super(name);
        this.setHardness(hardness);
    }

    public double getHardness() {
        return hardness;
    }

    public void setHardness(double hardness) {
        this.hardness = hardness > 0 ? hardness : 0;
    }

}
