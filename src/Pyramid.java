public class Pyramid implements Shape_3D {

    private double side1;
    private double height;

    public Pyramid(double side1, double height) {
        this.side1 = side1;
        this.height = height;
    }

    public double getVolume(){
        return (height / 3) * (side1 * side1);
    }
}
