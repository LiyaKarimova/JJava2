package Lesson1;

public class Wall implements Obstacle {
    private int height;
    private final Type TYPE = Type.WALL;

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
    public boolean checkType (Type type) {
        if (type == TYPE){
            return true;
        }
        return false;
    }
}
