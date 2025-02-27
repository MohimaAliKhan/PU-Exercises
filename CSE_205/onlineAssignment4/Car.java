
package onlineAssignment4;


public class Car extends Vehicle {
    private String manufactureName;
    
    public Car(String manufactureName,double regnNumber,int speed,String color,String ownerName){
        super(regnNumber,speed,color,ownerName);
        this.manufactureName=manufactureName;
    }
    @Override
    public void showData(){
       super.showData();
       System.out.println("This is car class.");
       System.out.println("The manufacture name of this car is "+manufactureName+".");
   }
}
