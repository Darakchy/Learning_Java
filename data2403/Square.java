package data2403;

public class Square extends Rectangle{
    public Square(int aSide) {
        super(aSide, aSide);
    }

    @Override
    void info() {
        System.out.println("Square");
    }
}
