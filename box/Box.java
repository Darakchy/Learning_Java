package box;

public class Box {
    int a;
    int b;
    int c;

    public Box() {
    }

    public Box(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int volume() {
        return a * b * c;
    }

    public int totalArea() {
        return (a * b + b * c + c * a) * 2;
    }

    public void sort() {
        if (a > b) {
            int buf = a;
            a = b;
            b = buf;
        }
        if (b > c) {
            int buf = b;
            b = c;
            c = buf;
        }
        if (a > b) {
            int buf = a;
            a = b;
            b = buf;
        }
    }

    public void printInfo() {
        System.out.printf("a = %d b = %d c = %d%n", a, b, c);
    }
}
