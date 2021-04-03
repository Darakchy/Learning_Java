package Polimorphism;

public class BirdsMain {
    public static void main(String[] args) {
        Birds crow = new Crow();
        Birds sparrow = new Sparrow();
        Birds birds = new Birds();

        crow.song();
        sparrow.song();
        birds.song();
    }
}
