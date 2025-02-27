
package onlineAssignment4;


public class Box extends ThreeDObject {
    private double l;
    private double w;
    private double h;

    public Box(int l, int w, int h) {
        super("Box");
        this.l = l;
        this.w = w;
        this.h = h;
    }
    @Override
    public double wholeSurfaceArea(){
        
      return 2*(l*w+w*h+h*l);  
    }
    @Override
    public double volume(){
        return l*w*h;
    }
}
