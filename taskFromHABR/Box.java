package taskFromHABR;

public class Box extends Shape {
    public Box(double v) {
        setVolume(v);
    }

    public boolean add(Shape s) {
        System.out.println(s.getVolume() + " " + getVolume());
        if (s.getVolume() <= getVolume()) {
            setVolume(getVolume() - s.getVolume());
            return true;
        } else {
            return false;
        }

    }
}
