package taskFromHABR;

public class Ball extends SolidOfRevolution {
    public Ball(double r) {
        setRadius(r);
        setVolume(4 / 3 * Math.PI * r * r * r);
    }
}
