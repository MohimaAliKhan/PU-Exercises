import java.util.Random;

public class ExamController implements ExamMediator {
    private Teacher teacher = new Teacher();
    private Student[] students;
    private Random random = new Random();

    @Override
    public void sendScriptsAndMarks(Student[] students) {
        this.students = students;

        System.out.println("Scripts and marks of student ids 1,2,3,4,5 sent to exam controller office.");

        // Introduce mistakes with probability 0.5 or 0.6
        boolean mistakeGenerated = false;
        for (Student s : students) {
            if (!mistakeGenerated || random.nextDouble() < 0.6) { // ensure at least one mistake
                int oldMark = s.getMark();
                int newMark = teacher.recheckMark(oldMark);
                if (newMark != oldMark) {
                    s.setMark(newMark);
                    mistakeGenerated = true;
                    System.out.println("Mistake found! Student id " + s.getId() +
                                       ", Old mark: " + oldMark + ", Corrected mark: " + newMark);
                }
            }
        }

        if (!mistakeGenerated) {
            // force at least one mistake
            Student s = students[random.nextInt(students.length)];
            int oldMark = s.getMark();
            int newMark = teacher.recheckMark(oldMark);
            s.setMark(newMark);
            System.out.println("Mistake found! Student id " + s.getId() +
                               ", Old mark: " + oldMark + ", Corrected mark: " + newMark);
        }
    }

    @Override
    public void publishResults(Student[] students) {
        System.out.println("\nPublishing Results:");
        for (Student s : students) s.printMark();
    }

    @Override
    public void requestRecheck(int studentId) {
        System.out.println("Re-examine request got from student id " + studentId);
        for (Student s : students) {
            if (s.getId() == studentId) {
                int oldMark = s.getMark();
                int newMark = teacher.recheckMark(oldMark);
                s.setMark(newMark);
                System.out.println("Updated mark for student id " + studentId +
                                   ": Old = " + oldMark + ", New = " + newMark);
            }
        }
    }
}
