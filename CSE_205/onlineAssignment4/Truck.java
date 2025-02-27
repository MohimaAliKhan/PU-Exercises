
package onlineAssignment4;


public class Truck extends Vehicles {
    private int loadLimit;
    
    
    public Truck(int loadLimit,int numberOfWheels,int speed ){
        super(numberOfWheels,speed);
        this.loadLimit=loadLimit;
        
    }

    public int getLoadLimit() {
        return loadLimit;
    }

    public void setLoadLimit(int loadLimit) {
        this.loadLimit = loadLimit;
    }
    public void showData(){
       super.showData();
       System.out.println("This is Truck class.");
       System.out.println("The load limit of this Truck is "+loadLimit+".");
       
   }  
}
