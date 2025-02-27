
package Assignment_1;
import java.util.Scanner;

public class CelsToFaren {
    
     public static void main (String[] args){
         Scanner input =new Scanner (System.in);
         int c;
         float f;
         System.out.println("Enter Celsius :");
        c = input.nextInt();
        f = (float) (1.8*c+32);
        System.out.println("Fahrenheit:"+f);
     }
    
}
