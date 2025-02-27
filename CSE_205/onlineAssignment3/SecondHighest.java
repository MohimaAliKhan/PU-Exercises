
package onlineAssignment3;

import java.util.Scanner;

public class SecondHighest {
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
        
        int largest=array[0];
        for(i=1;i<n;i++){
           if(largest<array[i]){
               largest=array[i];
           }
        }
        System.out.println("The Hihest number is "+largest); 
        int secondLargest=0;
        for(i=0;i<n;i++){
           if(secondLargest<array[i]&&array[i]<largest){
               secondLargest=array[i];
           }
        }
        System.out.println("The second Hihest number is "+secondLargest);    
    }
    
}
