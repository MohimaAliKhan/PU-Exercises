
package onlineAssignment4;

public class Texi extends Car2 {
     private int routeNumber;
    
    Texi(int routeNumber,int numberOfPassengers,int numberOfWheels,int speed ){
        super(numberOfPassengers,numberOfWheels,speed);
        this.routeNumber=routeNumber;
    }

    public int getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(int routeNumber) {
        this.routeNumber = routeNumber;
    }
    
    @Override
   public void showData(){
       super.showData();
       System.out.println("This is Texi class.");
       System.out.println("The rout-number of this Bus is "+routeNumber+".");
       
   }  
    
}
