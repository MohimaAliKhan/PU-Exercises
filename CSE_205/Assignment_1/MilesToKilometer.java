
package Assignment_1;
import java.util.Scanner;


public class MilesToKilometer {
    public static void main (String[] args){
         Scanner input =new Scanner (System.in);
         
         int miles;
         float kilometer;
         
         
         System.out.print("Enter miles vlue: ");
         miles= input.nextInt();
         
         kilometer= (float) (1.609*miles);
        
         System.out.println("Kilometer vlue: "+kilometer);
     }
    
}
