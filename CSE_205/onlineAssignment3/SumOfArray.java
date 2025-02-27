
package onlineAssignment3;

import java.util.Scanner;
public class SumOfArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in); 
        int n,i;
        System.out.print("Enter size of array:");
        n=input.nextInt();
        int[] array1=new int[n];
        int[] array2=new int[n];
        int[] sum=new int[n];
        
        System.out.print("Enter elements of 1st array:");
        for(i=0;i<n;i++){
            array1[i]=input.nextInt();
        }
        System.out.print("Enter elements of 2nd array:");
        for(i=0;i<n;i++){
            array2[i]=input.nextInt();
        }
        for(i=0;i<n;i++){
            sum[i]=array1[i]+array2[i];
        }
        System.out.print("The final array:");
        for(i=0;i<n;i++){
            System.out.print(sum[i]+" ");
        }
    }
}
