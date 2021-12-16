package Lesson2Exception;



public class Lesson2 {
    public static void main(String[] args) {
        //создаем массив
        String[][] array1 = new String[4][4];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                array1[i][j] = "1";
            }
        }
        //записываем в одну из ячеек не число
        array1[2][2] = "h";
        //обрабатываем исключение на размер массива
        try {
            newArray(array1);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка. Размер массива больше 4 на 4");
        }
    }


    public static void newArray(String[][] myArray) throws MyArraySizeException {
        if (myArray.length > 4 || myArray[0].length > 4) {
            throw new MyArraySizeException();
        }
        try {
            int sum = 0;
            for (int i = 0; i < myArray.length; i++) {
                for (int j = 0; j < myArray.length; j++) {
                    System.out.print("Эллемент [" + i +"]["+ j +"]");
                    int a = Integer.parseInt(myArray[i][j]);
                    sum += a;
                    System.out.println(" = " + myArray[i][j]);
                }
            }
            System.out.println(sum);
        } catch (NumberFormatException exception) {
            System.out.print(" Ошибка. Эллемент массива не содержит число");
        }



    }


}
