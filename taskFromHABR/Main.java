package taskFromHABR;

public class Main {
    public static void main(String[] args) {
        Shape pyramid = new Pyramid(5.5, 10.1);
        Shape ball = new Ball(0.1);
        Shape cylinder = new Cylinder(6.3,2.4);
        Box box = new Box(350.2);

        System.out.println(box.add(pyramid));
        System.out.println(box.add(ball));
        System.out.println(box.add(cylinder));
    }

}
