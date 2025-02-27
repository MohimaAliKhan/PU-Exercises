
package onlineAssignment3;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in); 
        int n,i,sum=0;
        
        System.out.print("Enter size of array:");
            n=input.nextInt();
        
        int[] array=new int[n];
        
        System.out.print("Enter elements:");
        for(i=0;i<n;i++){
            array[i]=input.nextInt();
        }
        int k,tamp,j=n-1;
            k=n/2;
        for(i=0;i<k;i++){
            tamp=array[i];
            array[i]=array[j];
            array[j]=tamp;
            j--;
        }
        System.out.print("The array after reversing:");
        for(i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        
    }
}
