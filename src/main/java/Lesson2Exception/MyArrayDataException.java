package Lesson2Exception;

public class MyArrayDataException extends NumberFormatException {

    public MyArrayDataException (int i, int j){
        super("Ошибка в эллементе:" + i + "," + j);


    }



}
