
package onlineAssignment2;

import java.util.Scanner;
import java.lang.Math;

public class problem_5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value of a, b and c:");
        int a =input.nextInt();
        int b =input.nextInt();
        int c =input.nextInt();
        double discriminant=b*b-4*a*c;
        if(discriminant<0){
            System.out.println("The roots of this equation are undefined.");
        }
        else if(discriminant==0){
            float x=-b/(2*a);
            System.out.println("This equation has one root. That is "+x);
            
        }
        else{
            double x1=(-b+Math.sqrt( discriminant))/(2*a);
            double x2=(-b-Math.sqrt( discriminant))/(2*a);
            System.out.println("The roots : x1="+x1+" x2="+x2);
        }
        
    }
}
