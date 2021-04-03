package taskFromHABR;

public class Cylinder extends SolidOfRevolution {
    private double h;

    public Cylinder(double h, double r) {
        this.h = h;
        setRadius(r);
        setVolume(Math.PI * r * r * h);
    }
}
