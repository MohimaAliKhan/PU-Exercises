package Assignment_1;
import java.util.Scanner;


public class GradingSystem {
    public static void main (String[] args){
         Scanner input =new Scanner (System.in);
         
         int phy,chm,mth,bio;
         float per;
         System.out.print("Enter physics,chemistry,math,biology marks: ");
         
          phy = input.nextInt();
          chm = input.nextInt();
          mth= input.nextInt();
          bio= input.nextInt();
           
           per = (phy+chm+mth+bio)/4;
           
        if (per<40)
         {System.out.println("Your grade=F\nPercentage="+per);}
        else if(per<60)
         { System.out.println("Your grade=E\nPercentage="+per);}
        else if(per<70)
          { System.out.println("Your grade=D\nPercentage="+per);}
        else if(per<80)
          {  System.out.println("Your grade=C\nPercentage="+per);}
        else if(per<90)
          { System.out.println("Your grade=B\nPercentage="+per);}   
       else
       { System.out.println("Your grade=A\nPercentage="+per); } 
    }
}
