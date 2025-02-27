
package Assignment_1;
import java.util.Scanner;


public class SwapNum {
    public static void main (String[] args){
         Scanner input =new Scanner (System.in);
         int num1,num2,term;
        
         System.out.print("Enter first nunbmer: ");
        num1= input.nextInt();
        
         System.out.print("Enter second nunbmer: ");
         num2 = input.nextInt();
         
         term = num1;
         num1 = num2;
         num2 = term;
         
        System.out.println("After swaping...\n First nunbmer: "+num1);
        System.out.println("Second nunbmer: "+num2);
     }
    
}
