import java.util.Random;

public class Teacher {
    private Random random = new Random();

    
    public int recheckMark(int oldMark) {
        int diff = random.nextInt(7) - 3; 
        int newMark = oldMark + diff;
        if (newMark < 0) newMark = 0;
        if (newMark > 100) newMark = 100;
        return newMark;
    }
}
