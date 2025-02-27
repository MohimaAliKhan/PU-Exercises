
package onlineAssignment3;

import java.util.Scanner;
public class Search {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in); 
        int n,i;
        System.out.println("Enter size of array:");
        n=input.nextInt();
        int[] array=new int[n];
        System.out.println("Enter elements:");
        for(i=0;i<n;i++){
            array[i]=input.nextInt();
        }
        System.out.println("Enter desired number:");
        int number;
        number=input.nextInt();
        boolean isFound=false;
        for(i=0;i<n;i++){
            if(array[i]==number){
                isFound=true;
                break;
            }
        }
        if(isFound==true){
           System.out.println("The number is found.");
        }
        else{
            System.out.println("The number is not found.");
        }
    }
   
   
}
