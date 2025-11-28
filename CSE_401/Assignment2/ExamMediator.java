public interface ExamMediator {
    void sendScriptsAndMarks(Student[] students);
    void publishResults(Student[] students);
    void requestRecheck(int studentId);
}
