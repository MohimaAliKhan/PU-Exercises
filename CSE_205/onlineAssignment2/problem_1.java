
package onlineAssignment2;
import java.util.Scanner;

public class problem_1 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int num;
        System.out.println("Enter an integer:");
        num=input.nextInt();
        if(num%10==7||num/7==0){
            System.out.println("The integer "+num+" is Buzz number.");
        }
        else {
            System.out.println("The integer "+num+" is not Buzz number.");
        }
    }
 
}
