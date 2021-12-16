package Lesson1;

public class RunningTrack implements Obstacle {
    private int length;
    private final Type TYPE = Type.RUNNINGTRACK;

    public RunningTrack (int length) {
        this.length = length;
    }

    @Override
    public int GetParameter() {
        return length;
    }

    @Override
    public boolean checkType (Type type) {
        if (type == TYPE){
            return true;
        }
        return false;
    }
}
