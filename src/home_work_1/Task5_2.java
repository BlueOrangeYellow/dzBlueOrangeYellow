package home_work_1;

/*
1. Если имя будет равно имени "Вася" тогда в консоль должно вывести сообщение "Привет!" на одной строке, а на второй "Я тебя так долго ждал".
2. Если имя будет равно имени "Анастасия" тогда в консоль должно вывести сообщение "Я тебя так долго ждал".
3. В случае если это будет другое имя то вывести сообщение "Добрый день, а вы кто?".
 */

import java.util.Objects;
import java.util.Scanner;

public class Task5_2 {
    public static void main(String[] args) {
        System.out.println("Назовись");
        Scanner a = new Scanner(System.in);
        String name = a.nextLine(); // блок аналогичен 5_1

        /*
        начинаем с if применимо к Вася
         */
        if (Objects.equals(name, "Вася")) {
            System.out.println("Привет");
            System.out.println("Я тебя так долго ждал");
        }// аналогичен 5_1

        else // "в паре" с первым if
            if (Objects.equals(name, "Анастасия")) { // "входит в состав первого else
            System.out.println("Я тебя так долго ждал");
        }
            else { // "в паре со вторым if и входит в состав первого else
                System.out.println("Добрый день, а Вы кто?");
            }
    }
}
