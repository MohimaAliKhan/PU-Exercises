
package onlineAssignment4;


public class Cylinder extends ThreeDObject {
    private double r;
    private double l;

    public Cylinder(double r, double l) {
        super("Cylinder");
        this.r = r;
        this.l = l;
    }

    @Override
    public double wholeSurfaceArea() {
      return 2*Math.PI*r*l;  
    }

    @Override
    public double volume() {
        return Math.PI*r*r*l;
    }
    
    
}
