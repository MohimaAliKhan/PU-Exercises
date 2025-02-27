
package onlineAssignment4;

public class Car2 extends Vehicles {
    private int numberOfPassengers;
    
    
    public Car2(int numberOfPassengers,int numberOfWheels,int speed ){
        super(numberOfWheels,speed);
        this.numberOfPassengers=numberOfPassengers;
        
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
    
     public void showData(){
       super.showData();
       System.out.println("This is Truck class.");
       System.out.println("The number of passengers of this Truck is "+numberOfPassengers+".");
       
   }  
    
    
}
