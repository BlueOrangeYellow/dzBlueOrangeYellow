package home_work_2.arrays;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class ArraysUtils2 {

    public static void main(String[] args) {

        int[] container = arrayFromConsole();
        System.out.println("Заданный пользователем массив");
        for (int i = 0; i < container.length; ++i)
            System.out.print(container[i] + " ");
        System.out.println();

        ShowElements(container);
        System.out.println();

        ShowSecondElements(container);
        System.out.println();

        Reverse(container);
    }

    public static int[] arrayFromConsole() {
        Scanner enter = new Scanner(System.in);
        System.out.println("Введите размер массива ");
        int size = enter.nextInt();
        int[] array = new int[size];
        for (int j = 0; j < array.length; ++j) {
            System.out.println("Введите элемент массива номер " + (j + 1));
            array[j] = enter.nextInt();
        }
        return array;
    }

    public static void ShowElements(int[] arr) {
        int k = 0;
        do {
            System.out.print(arr[k] + " ");
            ++k;
        } while (k < arr.length);
        System.out.println();

        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            ++i;
        }
        System.out.println();
        for (int m = 0; m < arr.length; ++m) {
            System.out.print(arr[m] + " ");
        }
        System.out.println();
        for (int l : arr) {
            System.out.print(l + " ");
        }
        System.out.println();
    }

    public static void ShowSecondElements(int[] arr) {
        System.out.println("Каждый второй элемент массива");

        int k = 1;
        do {
            System.out.print(arr[k] + " ");
            k += 2;

        } while (k < arr.length);
        System.out.println();

        int i = 1;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i += 2;
        }
        System.out.println();
        for (int m = 1; m < arr.length; m += 2) {
            System.out.print(arr[m] + " ");
        }
        System.out.println();

        int abc = 1;
        for (int l : arr) {
            if (abc % 2 == 0) {
                System.out.print(l + " ");
            }
            ++abc;
        }
        System.out.println();

    }

    public static void Reverse(int[] arr) {
        System.out.println("Вывод элементов в обратном порядке");
        int k = arr.length - 1;
        do {
            System.out.print(arr[k] + " ");
            --k;
        } while (k > -1);
        System.out.println();

        int i = arr.length - 1;
        while (i > -1) {
            System.out.print(arr[i] + " ");
            --i;
        }
        System.out.println();

        for (int m = arr.length - 1; m > -1; --m) {
            System.out.print(arr[m] + " ");
        }
        System.out.println();

        int t = +1;
        for (int l : arr) {
                System.out.print(arr[arr.length - t]  + " ");
                ++t;
        }
        System.out.println();

    }
}

