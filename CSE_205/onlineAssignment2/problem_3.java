
package onlineAssignment2;

import java.util.Scanner;
public class problem_3 {
    public static void main(String[] args) {
        int limit,i=1;
        Scanner input=new Scanner (System.in);
        System.out.println("Up to which number? ");
        limit=input.nextInt();
        int fibonacci[] =new int[50];
        fibonacci[0]=0;
        fibonacci[1]=1;
        while(fibonacci[i]<=limit){
             i++;
            fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
           
        }
        int j=0;
        System.out.print("The Series:");
        while(fibonacci[j]<=limit){
            System.out.print(fibonacci[j]+",");
            j++;
        }
        
    }
    
}