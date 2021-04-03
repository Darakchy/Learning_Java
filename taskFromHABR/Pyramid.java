package taskFromHABR;

public class Pyramid extends Shape {
    public double h;
    public double s;

    public Pyramid(double h, double s) {
        this.h = h;
        this.s = s;
        setVolume(s * h / 3);
    }

}

