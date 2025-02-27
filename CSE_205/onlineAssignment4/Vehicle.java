
package onlineAssignment4;


public class Vehicle {
    private double regnNumber;
    private int speed;
    private String color;
    private String ownerName;
    public Vehicle(double regnNumber,int speed,String color,String ownerName){
        this.regnNumber=regnNumber;
        this.speed=speed;
        this.color=color;
        this.ownerName=ownerName;
    }
    void showData(){
        System.out.println("This is a vehicle class");
        System.out.println("The registration-number of this is "+regnNumber+".");
        System.out.println("The speed of this is "+speed+".");
        System.out.println("The color of this is "+color+".");
        System.out.println("Owner name of this vehicle is "+ownerName+".");
    }
}
