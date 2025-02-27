
package onlineAssignment3;

import java.util.Scanner;
public class sumAndAverage {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum =0;
        System.out.println("Enter the number of integer:");
        int n= input.nextInt();
        int numbers[]=new int [n];
        for(int i=0;i<n;i++){
            numbers[i]=input.nextInt();
        }
        for(int i=0;i<n;i++){
            sum=sum+numbers[i];
        }
        System.out.println("Sum:"+sum);
        int average =sum/n;
        System.out.println("Aversge:"+average);
    }
    
}
