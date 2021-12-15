package home_work_2.loops;


import java.util.Scanner;

public class Zadacha1_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число");
        String vvod = in.nextLine();

        long number = Long.parseLong(vvod);
        /*
        181232375 - 9 цифр
         */
        long number1 = number;
        int a = 0;
        while (number != 0) {
            a++;
            number /= 10;
        }
        System.out.println("Число состоит из " + a + " цифр");
        int b = a - 1; // для примера с 9 цифрами - 8
        long stepen = 1;
        long itog = 1;
        while (a > 1) {
            while (b > 0) {
                stepen *= 10;
                b = b - 1;
            }
            long result = number1 / (stepen) % 10;
            itog = itog * result;
            System.out.print(result + "*");
            stepen /= 10;
            a--;
            if (a == 1) {
                System.out.print(number1 % 10 + "=" + itog*(number1 % 10));
            }
        }
    }
}
    //if (a == 2) {
////                System.out.print(number1 % 10 + "= " + itog);
// 181232375
// http://proglang.su/java/numbers-parseint
/*
        int a = 0;
        while (number != 0) {
            a++;
            number /= 10;
        }
        System.out.println("Число состояло из " + a + " цифр");
         */

/*
        while (a <= 0) {
        int result = number1 / 10
        System.out.print()
*/