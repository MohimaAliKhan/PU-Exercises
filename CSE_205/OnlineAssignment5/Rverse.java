
package OnlineAssignment5;

import java.util.Scanner;
public class Rverse {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num,reverse=0;
        System.out.print("Enter the intiger number: ");
        num=input.nextInt();
        while(num!=0){
            reverse=reverse*10+num%10;
            num=num/10;
            
        }
        System.out.println("The reverse num: "+reverse);
        
    }
}
