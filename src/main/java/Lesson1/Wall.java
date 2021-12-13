package Lesson1;

public class Wall implements Obstacle {
    private int height;
    private final String TYPE = "WALL";

    public Wall (int height){
        this.height = height;
    }

//    public int getParameter () {
//        return height;
//    }

    @Override
    public int GetParameter() {
        return height;
    }

    @Override
    public boolean GetType(String type) {
        if (type.equals(TYPE)){
            return true;
        }
        return false;
    }
}
