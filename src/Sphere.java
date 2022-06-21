public class Sphere implements Shape_3D{

    private double diameter;

    public Sphere (double diameter){
        this.diameter = diameter;
    }

    public double getVolume(){
        return (Math.PI / 6) * (diameter * diameter *diameter);
    }

}
