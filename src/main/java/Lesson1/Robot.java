package Lesson1;

public class Robot implements Player {
    static final int MAX_RUN = 10;
    static final int MAX_JUMP = 0;
    static final String TYPE = "Робот";

    @Override
    public boolean run(Obstacle runningTrack) {
        if (runningTrack.GetParameter() > MAX_RUN) {
            System.out.println("Робот НЕ пробежал");
            return false;
        } else {
            System.out.println("Робот пробежал");
        }
        return true;
    }

    @Override
    public boolean jump (Obstacle wall) {
        if (wall.GetParameter() > MAX_JUMP) {
            System.out.println("Робот НЕ прыгнул");
            return false;
        } else {
            System.out.println("Робот прыгнул");
        }
        return true;
    }

    @Override
    public String getType() {
        return TYPE ;
    }
}
