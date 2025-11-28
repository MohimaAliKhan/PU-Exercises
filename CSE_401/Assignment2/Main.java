import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        ExamMediator mediator = new ExamController();

        
        Student[] students = new Student[5];
        for (int i = 0; i < 5; i++) {
            students[i] = new Student(i + 1, random.nextInt(101), mediator);
        }

        
        mediator.sendScriptsAndMarks(students);
        mediator.publishResults(students);

        
        while(true){
            System.out.print("\nEnter student id for recheck (0 if none): ");
            int id = sc.nextInt();
            if (id > 0 && id <= 5) {
             students[id - 1].applyRecheck();
                mediator.publishResults(students);
             }
             else break;
        }
       sc.close(); 
    }
}
