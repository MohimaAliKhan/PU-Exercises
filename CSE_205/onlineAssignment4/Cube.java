
package onlineAssignment4;


public class Cube extends ThreeDObject{
    private double a;

    public Cube(double a) {
        super("Cube");
        this.a = a;
    }

    @Override
    public double wholeSurfaceArea() {
        return 6*a*a;
    }

    @Override
    public double volume() {
       return a*a*a;
    }
    
}
