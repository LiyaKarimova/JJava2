package Lesson1;

public class RunningTrack implements Obstacle {
    private int length;
    private final String TYPE = "RUNNINGTRACK";

    public RunningTrack (int length) {
        this.length = length;
    }

    @Override
    public int GetParameter() {
        return length;
    }

    @Override
    public boolean GetType(String type) {
        if (type.equals(TYPE)){
            return true;
        }
        return false;
    }
}
