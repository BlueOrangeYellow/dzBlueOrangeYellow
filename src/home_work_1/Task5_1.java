package home_work_1;

/*
1. Если имя будет равно имени "Вася" тогда в консоль должно вывести сообщение "Привет!" на одной строке, а на второй "Я тебя так долго ждал".
2. Если имя будет равно имени "Анастасия" тогда в консоль должно вывести сообщение "Я тебя так долго ждал".
3. В случае если это будет другое имя то вывести сообщение "Добрый день, а вы кто?".
 */
import java.util.Objects;
import java.util.Scanner;

public class Task5_1 {
    public static void main(String[] args) {
        System.out.println("Назовись"); // видит юзер
        Scanner a = new Scanner(System.in); // для ввода юзером
        String name = a.nextLine(); // теперь name = введенное юзером
        /*
        Задаём первое if
         */
        if (Objects.equals(name,"Вася")) { // сравнение заданного юзером name и "Вася"
            System.out.println("Привет");
            System.out.println("Я тебя так долго ждал");
        }// п.1 выполнен


        if (Objects.equals(name, "Анастасия")) {
            System.out.println("Я тебя так долго ждал");
    }// п.2 выполнен

        if ((!(Objects.equals(name,"Вася"))) && (!(Objects.equals(name, "Анастасия")))); // если И то, И другое неверно, выводим
            System.out.println("Добрый день, а Вы кто?");
    }// п.3 выполнен
}
