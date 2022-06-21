public class Main {
    public static void main(String[] args) {

        Sphere sphere1 = new Sphere(10);
        System.out.println("Sphere volume is " + sphere1.getVolume());
        System.out.println("====================");

        Square square1 = new Square(24, 48);
        System.out.println("Square is " + square1.getSquare());
        System.out.println("====================");

        Pyramid pyramid = new Pyramid(17, 24);
        System.out.println("Pyramid volume is " + pyramid.getVolume());
    }
}