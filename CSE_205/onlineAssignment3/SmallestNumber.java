
package onlineAssignment3;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in); 
        int n,i;
        
        System.out.print("Enter size of array:");
        n=input.nextInt();
        
        int[] array=new int[n];
        
        System.out.print("Enter elements:");
        for(i=0;i<n;i++){
            array[i]=input.nextInt();
        }
        
        int small=array[0];
        for(i=1;i<n;i++){
           if(small>array[i]){
               small=array[i];
           }
        }
        System.out.println("The smallest element:"+small);
    }
}
