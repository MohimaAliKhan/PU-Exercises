
package onlineAssignment3;
import java.util.Scanner;
public class countingPrime {
    static boolean isPrime(int num){
        int i;
        if(num<=1){return false;}
        for(i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,i;
        int numberOfPrime=0;
        System.out.print("Enter size of array:");
        n=input.nextInt();
        
        int[] array=new int[n];
        
        System.out.print("Enter elements:");
        for(i=0;i<n;i++){
            array[i]=input.nextInt();
        }
        for(i=0;i<n;i++){
            numberOfPrime+=isPrime(array[i])?1:0;
        }
        System.out.println("Number of prime in the given array is "+numberOfPrime);
        
        
    }
}
