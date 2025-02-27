
package Assignment_1;
import java.util.Scanner;

public class FarenToCel {
    public static void main (String[] args){
         Scanner input =new Scanner (System.in);
         int f ;
         float c;
         System.out.println("Enter Fahrenheit :");
        f = input.nextInt();
        c = (float) (5/9*(f-32));
        System.out.println("Celsius :"+c);
     }
    
}
