public class Square implements Shape_2D {
    private double length1;
    private double length2;

    public Square(double length1, double length2) {
        this.length1 = length1;
        this.length2 = length2;
    }

    @Override
    public double getSquare() {
        return length1 * length2;
    }
}
