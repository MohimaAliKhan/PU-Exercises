
package onlineAssignment3;

import java.util.Scanner;


public class MergingArray {
     public static void main(String[] args) {
        Scanner input=new Scanner(System.in); 
        int n,m,i;
        System.out.print("Enter size of 2 array:");
        n=input.nextInt();
        m=input.nextInt();
        float [] array1=new float[n];
        float[] array2=new float[m];
        float[] mergingArray=new float[n+m];
        
        System.out.print("Enter elements of 1st array:");
        for(i=0;i<n;i++){
            array1[i]=input.nextFloat();
        }
        System.out.print("Enter elements of 2nd array:");
        for(i=0;i<m;i++){
            array2[i]=input.nextFloat();
        }
        for(i=0;i<n;i++){
           
           mergingArray[i]=array1[i]; 
        }
        int j=n;
        for(i=0;i<m;i++){
           
           mergingArray[j]=array2[i]; 
           j++;
        }
        System.out.print("The final array:");
        for(i=0;i<n+m;i++){
            System.out.print(mergingArray[i]+" ");
        }
    }
    
}
