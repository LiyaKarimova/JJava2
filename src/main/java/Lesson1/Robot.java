package Lesson1;

public class Robot implements Action{
    static final int MAX_RUN = 500;
    static final int MAX_JUMP = 0;
    
    @Override
    public void run(Obstacle runningTrack) {
        System.out.println("Робот пробежал");
    }

    @Override
    public void jump(Obstacle wall) {
        System.out.println("Робот прыгнул");
    }
}
