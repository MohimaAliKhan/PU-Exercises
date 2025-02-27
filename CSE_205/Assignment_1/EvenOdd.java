package Assignment_1;
import java.util.Scanner;


public class EvenOdd {
    public static void main (String[] args){
         Scanner input =new Scanner (System.in);
         
         int num;
         
         
         
         System.out.print("Enter number: ");
        num= input.nextInt();
        
        if (num%2==0){
            System.out.print("The number is even number. ");
        }
        else {
             System.out.print("The number is not oddnumber. ");
        }    
         
         
        
     }
    
}
