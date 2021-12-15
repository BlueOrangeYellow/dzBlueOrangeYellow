package home_work_2.loops;

import java.util.Scanner;

public class Zadacha1_1_2 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        long number = console.nextLong();

        if (number <= 0) {
            System.out.println("Пожалуйста, обратите внимание на необходимость ввода натурального числа");
            return;
        }

        Long b = recursion(number);
        System.out.print(b);

        //a - number
    }

    private static Long recursion(Long a) {
        Long result = 1l;
        if (a == 1) {
            System.out.print("1=");
        return result;
        }
        System.out.print(a + "*");
        result = a * recursion(a-1);
        return result;
    }
}
//
/*
if (a == 1) {
            return 1;
        }
        else {
            System.out.print(a + "*");
            return a * recursion(a - 1);
        }
 */
/* Scanner console = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        long n
        if (number <= 0){
            System.out.println("Пожалуйста, обратите внимание на необходимость ввода натурального числа");
            return;
        }umber = console.nextInt();

        */
