
package onlineAssignment4;


public abstract class ThreeDObject {
    String name;

    public ThreeDObject() {
        this.name="Not defined yet";
    }
    
    ThreeDObject(String name){
        this.name=name;
    }
    abstract public double wholeSurfaceArea();
    abstract public double volume();
}
