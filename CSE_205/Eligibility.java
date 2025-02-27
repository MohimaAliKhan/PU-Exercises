import java.util.Scanner;
public class Eligibility {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int n;
        System.out.print("Enter the number of students:");
        n=input.nextInt();
       String students[]=new String[n];
       
       for(int i=0;i<n;i++){
            int math,chemistry,physics;
            
            System.out.print("Enter the marks of Math,chemistry and Physics for student-"+(i+1)+":");
            
            math = input.nextInt();
            chemistry=input.nextInt();
            physics=input.nextInt();
            
          if(math+physics>=150){
              students[i]="Eligible";
           }
          else if(math>=60 && physics>=50 && chemistry>=40){
              students[i]="Eligible";  
          }
          else{
              students[i]="Not Eligible";      
          }
          
       }
       for(int i=0;i<n;i++){
           System.out.println("Student"+(i+1)+": "+students[i]);
       }
    }
   
}
