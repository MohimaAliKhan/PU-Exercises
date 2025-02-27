
package onlineAssignment4;


public class TestObject {
    public static void main(String[] args) {
        Cylinder a=new Cylinder(3,5);
        Cube b=new Cube (4);
        Box c=new Box (2,3,4);
        System.out.println("The surface Area of Box:"+c.wholeSurfaceArea());
        System.out.println("The voume of Box:"+c.volume());
        
        System.out.println("The surface Area of Cube:"+b.wholeSurfaceArea());
        System.out.println("The voume of Cube:"+b.volume());
        
        System.out.println("The surface Area of Cylider:"+a.wholeSurfaceArea());
        System.out.println("The voume of Cylider:"+a.volume());
        
    }
 
}
