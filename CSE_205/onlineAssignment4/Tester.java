
package onlineAssignment4;


public class Tester {
    public static void main(String[] args) {
        Human a=new Human("Bangladesh",70,"Female");
        a.display();
        System.out.println("\n");
        Human b=new Human("Bangladesh",70,"Female","Mohima Akter","Student",22);
        b.display(); 
        System.out.println("\n");
        Human c=new Human("Tamanna Akter","Student",22);
        c.display();
    }
}
