

package Assignment_1;
import java.util.Scanner;


public class Circle {
    public static void main (String[] args){
         Scanner input =new Scanner (System.in);
         
         int radius;
         float pi,area,perimeter;
         pi = (float) 3.1416;
         
         System.out.print("Enter radius: ");
        radius= input.nextInt();
         
         area = pi*radius*radius;
         perimeter = 2*pi*radius;
         
        System.out.println("Area: "+area);
        System.out.println("Perimeter: "+perimeter);
     }
    
}
