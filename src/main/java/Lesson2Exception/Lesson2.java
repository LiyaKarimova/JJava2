package Lesson2Exception;



public class Lesson2 {
    public static void main(String[] args) {
        //создаем массив
        String[][] array1 = new String[][]{
                {"1", "2", "3", "4"},
                {"1", "g", "3", ""},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
        };

        try {
            newArray(array1);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("Программа закончилась");
    }


    public static void newArray(String[][] myArray) throws MyArraySizeException, MyArrayDataException{
        boolean hasMistake = false;
        for (int i = 0; i < myArray.length; i++) {
            if( myArray[i].length != 4){
                hasMistake = true;
                break;
            }
        }

        if (myArray.length != 4 || hasMistake) {
            throw new MyArraySizeException();
        }
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                try {
                    sum += Integer.parseInt(myArray[i][j]);
                } catch (NumberFormatException exception) {
                    throw new MyArrayDataException(i,j);
                }
            }
            System.out.println(sum);
        }


//        try {
//            int sum = 0;
//            for (i = 0; i < myArray.length; i++) {
//                for (String str:myArray[i]) {
//                   int a = Integer.parseInt(str);
//                    System.out.println(a);
//                }
//            }
//            System.out.println(sum);
//        } catch (NumberFormatException exception) {
//            throw new MyArrayDataException("Ошибка в элементе " + i + ":" + j);
//        }


    }


}
