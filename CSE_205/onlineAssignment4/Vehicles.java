
package onlineAssignment4;


public class Vehicles {
    private int numberOfWheels;
    private int speed;
    
    Vehicles(int numberOfWheels,int speed){
        this.numberOfWheels=numberOfWheels;
        this.speed=speed;
    }
    void showData(){
        System.out.println("This is a vehicles class");
        System.out.println("The speed of this vehicle is "+speed+".");
        System.out.println("The number of wheels of this vehicle is "+numberOfWheels+".");
        
    }
    
}
