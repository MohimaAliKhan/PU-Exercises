
package onlineAssignment4;


public class Animal {
    private String residence;
    private int lifetime;
    private String gender;
    
    public Animal(){
        this.residence="not decleared";
        this.gender="not decleared";
        this.lifetime=0;
    }
    public Animal(String residence,int lifetime,String gender){
        this.residence=residence;
        this.gender=gender;
        this.lifetime=lifetime;
    }
    void display(){
        System.out.println("This animal's residence is "+residence);
        if(lifetime!=0){
            System.out.println("The averagelife duration of this animal is "+lifetime+".");
        }
        else{
        System.out.println("The averagelife duration of this animal is not decleared.");
        }
        System.out.println("And the gender is "+gender+".");
    }
    
    
}
