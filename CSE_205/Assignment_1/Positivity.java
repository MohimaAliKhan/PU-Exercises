package Assignment_1;
import java.util.Scanner;


public class Positivity {
    public static void main (String[] args){
         Scanner input =new Scanner (System.in);
         
         int num;
        
         System.out.print("Enter number: ");
        num= input.nextInt();
        
        if (num>0){
            System.out.println("The number is positive number. ");
        }
        else {
             System.out.println("The number is negetive number. ");
        }    
         
         
        
     }
    
}
