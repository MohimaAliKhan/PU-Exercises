
package onlineAssignment2;

import java.util.Scanner;
public class problem_4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number:");
        int numb =input.nextInt();
        int i,rev=numb%10;
        while(numb/10!=0){
          numb=numb/10;
          rev=rev*10+numb%10;
        }
        System.out.println("The reverse number:"+rev);
    }
}
