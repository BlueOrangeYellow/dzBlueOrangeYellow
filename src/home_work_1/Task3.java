package home_work_1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Для подсчета объема шара заданного пользователем радиуса
        Scanner a = new Scanner(System.in);
        System.out.println("Задайте радиус шара:");
        double v = a.nextDouble();
        double v1 = (4*Math.PI*Math.pow(v, 3))/3;
        System.out.println("Объем шара = "+v1);

        //Для подсчета площади круга заданного пользователем радиуса
        Scanner b = new Scanner(System.in);
        System.out.println("Задайте радиус круга:");
        double s = b.nextDouble();
        double s1 = (1*Math.PI*Math.pow(s, 2));
        System.out.println("Площадь круга = "+s1);

        //Для определения большего из заданных пользователем чисел
        Scanner c = new Scanner(System.in);
        System.out.println("Задайте первое число:");
        double x = b.nextDouble();
        Scanner d = new Scanner(System.in);
        System.out.println("Задайте второе число:");
        double y = b.nextDouble();
        double maximum = Math.max(x, y);
        System.out.println("Большее из введенных -  " + maximum);
    }
}