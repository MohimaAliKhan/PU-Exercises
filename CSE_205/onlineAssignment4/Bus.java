
package onlineAssignment4;


public class Bus extends Vehicle  {
    private int routeNumber;
    
    Bus(int routeNumber,double regnNumber,int speed,String color,String ownerName){
        super(regnNumber,speed,color,ownerName);
        this.routeNumber=routeNumber;
    }
    @Override
   public void showData(){
       super.showData();
       System.out.println("This is bus class.");
       System.out.println("The rout-number of this Bus is "+routeNumber+".");
       
   }  
}
