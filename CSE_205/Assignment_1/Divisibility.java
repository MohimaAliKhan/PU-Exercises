package Assignment_1;
import java.util.Scanner;


public class Divisibility {
    public static void main (String[] args){
         Scanner input =new Scanner (System.in);
         
         int n;
  
         System.out.print("Enter number: ");
        n= input.nextInt();
        
        if (n%5==0){
            System.out.print("The number is divisible by 5. ");
        }
        else {
             System.out.println("The number is not divisible by 5. ");
        }    
         
         
        
     }
    
}
