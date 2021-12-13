package Lesson1;

public class Person implements Action {
    static final int MAX_RUN = 500;
    static final int MAX_JUMP = 30;

    @Override
    public void run(Obstacle runningTrack) {
        System.out.println("Человек пробежал");
    }

    @Override
    public void jump(Obstacle wall) {
        System.out.println("Человек прыгнул");

    }
}
