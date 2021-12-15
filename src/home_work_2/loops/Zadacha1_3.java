package home_work_2.loops;

import java.util.Scanner;

public class Zadacha1_3 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите число, которое хотели бы возвести в степень");
        double number = console.nextDouble();
        System.out.println("Введите положительное целое число, являющееся степенью");
        long stepen = console.nextLong();
        double number1 = number;
        long stepen1 = stepen;

        if (stepen < 1) {
            System.out.println("Введенная степень не является положительным числом");
        }

        while (stepen > 1) {
            stepen--;
            number *= number1;
        }
        System.out.println(number1 + "^" + stepen1 + "=" + number);
    }
}
