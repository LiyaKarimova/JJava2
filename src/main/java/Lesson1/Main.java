package Lesson1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

// 1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
// 2. Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
// 3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
//4. * У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки. Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.

    public static void main(String[] args){
        Cat cat = new Cat();
        Person person = new Person();
        Robot robot = new Robot();

        Wall wall = new Wall(0);
        RunningTrack runningTrack = new RunningTrack(10);
        Wall wall1 = new Wall(200);
        Wall wall2 = new Wall(10);
        RunningTrack runningTrack1 = new RunningTrack(300);

        ArrayList <Player> arrayPlayer = new ArrayList();
        arrayPlayer.add(cat);
        arrayPlayer.add(person);
        arrayPlayer.add(robot);

       // Object [] arrayPlayer = {cat,person,robot};

        ArrayList <Obstacle> arrayObstacle = new ArrayList();
        arrayObstacle.add(wall);
        arrayObstacle.add(runningTrack);
        arrayObstacle.add(wall1);
        arrayObstacle.add(wall2);
        arrayObstacle.add(runningTrack1);


        for (Player player : arrayPlayer) {
            for (Obstacle obstacle : arrayObstacle) {
                if (obstacle.checkType(Type.WALL)) {
                    if (!player.jump(obstacle)) {
                        System.out.println(player.getType() + " сошел с дистанции");
                        break;
                    }
                } else {
                    if (!player.run(obstacle)) {
                        System.out.println("Игрок сошел с дистанции");
                        break;
                    }
                }
            }
        }



//        for (int i = 0; i < arrayPlayer.size(); i++ ) {
//            for (int j = 0; j < arrayObstacle.size(); j++){
//                if (arrayObstacle.get(j).GetType("WALL")) {
//                    if (!arrayPlayer.get(i).jump(arrayObstacle.get(j))){
//                        System.out.println( arrayPlayer.get(i).getType() + " сошел с дистанции");
//                        break;
//                    }
//                } else {
//                    if (!arrayPlayer.get(i).run(arrayObstacle.get(j))){
//                        System.out.println("Игрок сошел с дистанции");
//                        break;
//                    }
//                }
//            }
//
//        }



    }
}
