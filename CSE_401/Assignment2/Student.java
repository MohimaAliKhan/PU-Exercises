public class Student {
    private int id;
    private int mark;
    private ExamMediator mediator;

    public Student(int id, int mark, ExamMediator mediator) {
        this.id = id;
        this.mark = mark;
        this.mediator = mediator;
    }

    public int getId() { return id; }
    public int getMark() { return mark; }
    public void setMark(int mark) { this.mark = mark; }

    public void printMark() {
        System.out.println("Student " + id + ": Mark = " + mark);
    }

    public void applyRecheck() {
        System.out.println("Re-examine request sent from student id " + id);
        mediator.requestRecheck(id);
    }
}
