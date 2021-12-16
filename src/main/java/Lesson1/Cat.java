package Lesson1;

public class Cat implements Player {
    static final int MAX_RUN = 100;
    static final int MAX_JUMP = 20;
    static final String TYPE = "Кот";

    @Override
    public boolean run(Obstacle runningTrack) {
        if (runningTrack.GetParameter() > MAX_RUN) {
            System.out.println("Кот НЕ пробежал");
            return false;
        } else {
            System.out.println("Кот пробежал");
        }
        return true;
    }

    @Override
    public boolean jump(Obstacle wall) {
        if (wall.GetParameter() > MAX_JUMP) {
            System.out.println("Кот НЕ прыгнул");
            return false;
        } else {
            System.out.println("Кот прыгнул");
        }
        return true;
    }

    @Override
    public String getType() {
        return TYPE;
    }
}
