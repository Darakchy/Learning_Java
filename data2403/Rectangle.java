package data2403;

public class Rectangle extends Figure {
    private int aSide;
    private int bSide;

    public void setaSide(int aSide) {
        this.aSide = aSide;
    }

    public void setbSide(int bSide) {
        this.bSide = bSide;
    }

    public int getaSide() {
        return aSide;
    }

    public int getbSide() {
        return bSide;
    }

    public Rectangle(int aSide, int bSide) {
        this.aSide = aSide;
        this.bSide = bSide;
    }

    @Override
    void info() {
        System.out.println("Rectangle");
    }

    @Override
    public int calculateArea() {
        return aSide * bSide;
    }

    @Override
    public int calculatePerimeter() {
        return (aSide + bSide) * 2;
    }
}
