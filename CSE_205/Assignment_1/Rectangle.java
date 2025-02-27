
package Assignment_1;
import java.util.Scanner;


public class Rectangle {
    public static void main (String[] args){
         Scanner input =new Scanner (System.in);
         int length,bredth,area,perimeter;
        
         System.out.print("Enter length: ");
        length= input.nextInt();
        
         System.out.print("Enter bredth: ");
         bredth = input.nextInt();
         
         area = length*bredth;
         perimeter = 2*(length+bredth);
         
        System.out.println("Area: "+area);
        System.out.println("Perimeter: "+perimeter);
     }
    
}
