package Lesson1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Action cat = new Cat();
        Action person = new Person();
        Action robot = new Robot();

        Wall wall = new Wall(0);
        RunningTrack runningTrack = new RunningTrack(10);
        Wall wall1 = new Wall(200);
        Wall wall2 = new Wall(10);
        RunningTrack runningTrack1 = new RunningTrack(300);

        ArrayList <Action> arrayPlayer = new ArrayList();
        arrayPlayer.add(cat);
        arrayPlayer.add(person);
        arrayPlayer.add(robot);

       // Object [] arrayPlayer = {cat,person,robot};


        ArrayList <Obstacle> arrayObstacle = new ArrayList();
        arrayObstacle.add(wall);
        arrayObstacle.add(runningTrack);
        arrayObstacle.add (wall1);
        arrayObstacle.add(wall2);
        arrayObstacle.add(runningTrack1);



        for (int i = 0; i < arrayPlayer.size(); i++ ) {
            for (int j = 0; j < arrayObstacle.size(); j++){
                if (arrayObstacle.get(j).GetType("WALL")) {
                    if (arrayPlayer.get(i).jump(arrayObstacle.get(j))){
                    } else {
                        System.out.println("Игрок №  сошел с дистанции");
                        break;
                    }
                } else {
                    if (arrayPlayer.get(i).run(arrayObstacle.get(j))){
                    } else {
                        System.out.println("Игрок сошел с дистанции");
                        break;
                    }
                }
            }

        }



    }
}
