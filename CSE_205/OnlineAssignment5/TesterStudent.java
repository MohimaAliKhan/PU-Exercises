
package OnlineAssignment5;

import java.util.Scanner;
public class TesterStudent {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter The name & the roll and marks of Math and physics :");
        Student student1=new Student(input.nextLine(),input.nextInt(),input.nextInt(),input.nextInt());
        student1.display();
        student1.result();
    }
}
