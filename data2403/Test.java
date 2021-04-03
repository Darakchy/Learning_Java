package data2403;

public class Test {
    public static void main(String[] args) {
        Figure circle = new Circle(3);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());
        circle.info();
        Circle circle1 = new Circle(4);
        System.out.println(circle1.calculateArea());
        System.out.println(circle1.calculatePerimeter());
        circle1.info();



        calculateArea(new Circle(3));


    }

    static int calculateArea(AreaCalculator calculator) {
        return calculator.calculateArea();
    }

    static void printInfo(Figure figure) {
        System.out.println("asdasd");
        figure.info();
    }
}
