package Lesson1;

public class Cat implements Action{
    static final int MAX_RUN = 100;
    static final int MAX_JUMP = 20;

    @Override
    public void run(Obstacle runningTrack) {
        System.out.println("Кот пробежал");
    }

    @Override
    public void jump(Obstacle wall) {
        System.out.println("Кот прыгнул");
    }
}
