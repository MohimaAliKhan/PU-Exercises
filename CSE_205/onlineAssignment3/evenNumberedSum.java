
package onlineAssignment3;
import java.util.Scanner;

public class evenNumberedSum {
  public static void main(String[] args) {
        Scanner input=new Scanner(System.in); 
        int n,i,sum=0;
        
        System.out.println("Enter size of array:");
        n=input.nextInt();
        
        int[] array=new int[n];
        
        System.out.println("Enter elements:");
        for(i=0;i<n;i++){
            array[i]=input.nextInt();
        }
        for(i=0;i<n;i++){
            if(array[i]%2==0)
            sum=sum+array[i];
        }
        System.out.println("Sum of even numberd term:"+sum);
    }    
}
