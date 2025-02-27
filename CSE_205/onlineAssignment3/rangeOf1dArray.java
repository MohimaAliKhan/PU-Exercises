
package onlineAssignment3;
import java.util.Scanner;

public class rangeOf1dArray {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int size,i,max,min,range;
        
        System.out.print("Enter the size of array:");
        size=input.nextInt();
        
        int array[]=new int[size];
        System.out.print("Enter the elements of array:");
        for(i=0;i<size;i++){
           array[i]=input.nextInt();
        }
        
        max=array[0];
        min=array[0];
        
        for(i=1;i<size;i++){
           if(array[i]>max){
               max=array[i];
           }
           if(array[i]<min){
               min=array[i];
           }
        }
        
        range=max-min;
        System.out.println("The range of this array is "+range);
    }
}
