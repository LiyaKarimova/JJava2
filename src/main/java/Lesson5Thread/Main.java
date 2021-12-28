package Lesson5Thread;

import java.util.Arrays;

public class Main {
    static final int size = 10000000;
    static final int h = size / 2;

    public static void main(String[] args) throws InterruptedException {
//        arrayInOneThread();
//        arrayInTwoThread();
        System.out.println("Массивы равны:" + Arrays.equals(arrayInOneThread(),arrayInTwoThread()));
    }


    public static float [] arrayInOneThread() {
        float[] arr = new float[size];
        for (float b : arr) {
            b = 1.0f;
        }
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.currentTimeMillis();
        System.out.println("Один поток: " + (System.currentTimeMillis() - a));
        return arr;
    }

    public static float [] arrayInTwoThread() throws InterruptedException {
        float[] newArr = new float[size];
        for (float b : newArr) {
            b = 1.0f;
        }
        long a = System.currentTimeMillis();
        //два новых массива
        float[] arr1 = new float[h];
        float[] arr2 = new float[h];
        //делим на два
        System.arraycopy(newArr, 0, arr1, 0, h);
        System.arraycopy(newArr, h, arr2, 0, h);

        long time1Start = System.currentTimeMillis();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < arr1.length; i++) {
                    arr1[i] = (float) (arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
                System.out.println("Первая половина: " + (System.currentTimeMillis() - time1Start));
            }
        });

        long time2Start = System.currentTimeMillis();


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < arr2.length; i++) {
                    arr2[i] = (float) (arr2[i] * Math.sin(0.2f + (i + h) / 5) * Math.cos(0.2f + (i +h) / 5) * Math.cos(0.4f + (i +h) / 2));
                }
                System.out.println("Вторая половина: " + (System.currentTimeMillis() - time2Start));
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.arraycopy(arr1, 0, newArr, 0, h);
        System.arraycopy(arr2, 0, newArr, h, h);
        System.currentTimeMillis();
        System.out.println("Два потока:" + (System.currentTimeMillis() - a));
        return newArr;
    }
}
