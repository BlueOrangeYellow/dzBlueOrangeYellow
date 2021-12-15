package home_work_2.loops;

import java.util.Scanner;

public class Zadacha1_1_1 {
    public static void main(String[] args) {
        /*
        1. Циклы. Для преобразования строки в число можно использовать http://proglang.su/java/numbers-parseint, если хотите можете добавить проверки на корректность ввода данных. Число положительное, максимум long:
    1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе. Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю. Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
    	1.1.1. Используя только цикл
         */
        Scanner console = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        long number = console.nextInt();

        if (number <= 0){
            System.out.println("Пожалуйста, обратите внимание на необходимость ввода натурального числа");
            return;
        }

        long i = 1;
        long itog = 1;
        while (i < number) {
            System.out.print(i + "*");
            itog *= i;
            i += 1;
        }
        itog *= i;
        System.out.print(i + "=" + itog);
    }
}
