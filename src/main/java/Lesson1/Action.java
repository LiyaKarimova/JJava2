package Lesson1;

public interface Action {

    boolean run (Obstacle runningTrack);

    boolean jump (Obstacle wall);

    String getType ();


}
