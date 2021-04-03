package com.company;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.a = 5;
        r1.b = 3;


        Rectangle r2 = new Rectangle();
        r2.a = 2;
        r2.b = 7;


        Rectangle[] rectangles = {r1, r2};

        System.out.println("Area = " + totalArea(rectangles));

    }

    static int totalArea(Rectangle[] rectangles) {
        int buf = 0;
        for (int i = 0; i < rectangles.length; i++) {
            System.out.println(i + " => " + rectangles[i].area());
            buf += rectangles[i].area();

        }
        return buf;
    }
}
