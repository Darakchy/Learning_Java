package box;

public class Main {
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.a = 4;
        b1.b = 4;
        b1.c = 3;

        Box b2 = new Box();
        b2.a = 1;
        b2.b = 2;
        b2.c = 2;

        Box b3 = new Box();
        b3.a = 7;
        b3.b = 10;
        b3.c = 4;

        float cons = 0.25f;

//        Box[] boxes = {b1, b2, b3};
//        System.out.print("Volume is => ");
//        vol(boxes);
//        System.out.println();
//        System.out.print("Consume is => ");
//        consume(boxes, cons);


//        b3.printInfo();
//        b3.sort();
//        b3.printInfo();
    }

    static void vol(Box[] volumes) {
        for (int i = 0; i < volumes.length; i++) {
            System.out.print(volumes[i].volume() + " ");
        }
    }

    static void consume(Box[] boxes, float cons) {
        for (int i = 0; i < boxes.length; i++) {
            System.out.print(boxes[i].totalArea() * cons + " ");
        }
    }

    static boolean boxInBox(Box box1, Box box2) {
        box1.sort();
        box2.sort();
        return (box1.a < box2.a && box1.b < box2.b && box1.c < box2.c);
    }



    static boolean boxInBoxWithClass(int a1, int b1, int c1, int a2, int b2, int c2){
        Box box1 = new Box(a1, b1, c1);
        Box box2 = new Box(a2, b2, c2);
        box1.sort();
        box2.sort();
        return (box1.a < box2.a && box1.b < box2.b && box1.c < box2.c);
    }
    static boolean boxInBoxWithoutClass(int a1, int b1, int c1, int a2, int b2, int c2){








        return true;
    }

}
