
package onlineAssignment4;


public class Human extends Animal {
    private String name;
    private int age;
    private String profesion;

    public Human(String residence, int lifetime, String gender) {
        super(residence, lifetime, gender);
        this.name="Not yet known";
        this.profesion="Not yet known";
        this.age=0;
    }
    public Human(String name,String profesion,int age){
        this.name=name;
        this.profesion=profesion;
        this.age=age;
    }
   
    public Human(String residence, int lifetime, String gender,String name,String profesion,int age){
        super(residence, lifetime, gender);
        this.name=name;
        this.profesion=profesion;
        this.age=age;
    }
    void display(){
        super.display();
        System.out.println("So this is Human.");
        System.out.println("Name:"+name);
        if(age!=0){
            System.out.println("Age:"+age);
        }
        else{
        System.out.println("Age:Not yet Known");
        }
        System.out.println("Profesion:"+profesion);
    }
    
}
