
package onlineAssignment2;

import java.util.Scanner;

public class problem_6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the minimum limit and maximum limit:");
        int min =input.nextInt();
        int max =input.nextInt();
        int sum=0;
        while(min<=max){
          sum=sum+min;
          min++;
        }
         System.out.println("The sum of natural number is "+sum);   
    }
    
}
