package home_work_1;

/*
1. Если имя будет равно имени "Вася" тогда в консоль должно вывести сообщение "Привет!" на одной строке, а на второй "Я тебя так долго ждал".
2. Если имя будет равно имени "Анастасия" тогда в консоль должно вывести сообщение "Я тебя так долго ждал".
3. В случае если это будет другое имя то вывести сообщение "Добрый день, а вы кто?".
 */

import java.util.Objects;
import java.util.Scanner;

public class Task5_3 {
    public static void main(String[] args) {
        System.out.println("Назовись");
        Scanner a = new Scanner(System.in);
        String name = a.nextLine(); // блок аналогичен 5_1

        switch (name) {
            case "Вася":
                System.out.println("Привет");
                System.out.println("Я тебя так долго ждал");
                break; // если не указать, тянутся подряд и следующие строки
            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а Вы кто?");
                break;
        }
        }
    }
