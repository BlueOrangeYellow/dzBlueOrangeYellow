package home_work_2.arrays;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class ArraysUtils {

    public static void main(String[] args) {

        int[] container = arrayFromConsole();
        System.out.println("Заданный пользователем массив");
        for (int i = 0; i < container.length; ++i)
            System.out.print(container [i] + " ");
        System.out.println();

        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер случайного массива");
        String vvod = in.nextLine();
        int size = Integer.parseInt(vvod);

        Scanner in2 = new Scanner(System.in);
        System.out.println("Введите максимальное число, которое вы хотели бы видеть как случайное");
        String vvod2 = in.nextLine();
        int maxValueExclusion = Integer.parseInt(vvod2);

        int[] container2 = arrayRandom(size,maxValueExclusion);
        System.out.println("Массив из рандомных значений");
        for (int m = 0; m < container2.length; ++m)
            System.out.print(container2[m]+" ");
    }
    public static int[] arrayFromConsole(){
        Scanner enter = new Scanner(System.in);
        System.out.println("Введите размер массива ");
        int size = enter.nextInt();
        int[] array=new int[size];
        for (int j = 0; j < array.length; ++j){
            System.out.println("Введите элемент массива номер " + j);
            array [j] = enter.nextInt();
        }
        return array;
    }
    public static int[] arrayRandom(int size2, int maxValueExclusion2){
        int[] array = new int[size2];
        Random rnd = new Random();
        int diff = maxValueExclusion2-0;
        for (int k = 0; k < array.length; ++k)
        {
            array[k]= rnd.nextInt(diff);
        }
        return array;
    }


}
