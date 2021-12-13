package Lesson1;

public class Person implements Action {
    static final int MAX_RUN = 500;
    static final int MAX_JUMP = 30;

    @Override
    public boolean run(Obstacle runningTrack) {
        if (runningTrack.GetParameter() > MAX_RUN) {
            System.out.println("Человек НЕ пробежал");
            return false;
        } else {
            System.out.println("Человек пробежал");
        }
        return true;

    }

    @Override
    public boolean jump(Obstacle wall) {
        if (wall.GetParameter() > MAX_JUMP) {
            System.out.println("Человек НЕ прыгнул");
            return false;
        } else {
            System.out.println("Человек прыгнул");
        }
        return true;
    }
}
