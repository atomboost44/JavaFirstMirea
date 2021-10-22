package ru.mirea.task1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int fact(int num)
    {
        int b=1;
        for (int i = 1; i<=num;i++){
            b*=i;
        }
        return b;
    }

    public static void sum(int[] copyArray)
    {
        int sum=0;
        for(int i =0;i<copyArray.length;i++)
        {
            sum+=copyArray[i];
        }
        System.out.print("Сумма значений массива {for}: "+sum+"\n");
        sum=0;
        int i = 0;
        while(i<copyArray.length)
        {
            sum+=copyArray[i];
            i++;
        }
        System.out.print("Сумма значений массива {while}: "+sum+"\n");
        i=0;
        sum=0;
        do
        {
            sum+=copyArray[i];
            i++;
        }while (i<copyArray.length);
        System.out.print("Сумма значений массива {do-while}: "+sum+"\n");
    }
    public static  void printArray(String str, int[] array)
    {
        System.out.print(str+"\n");
        for(int i =0; i<array.length;i++)
        {
            System.out.print(array[i]+"\n");
        }
    }
    public static void sortArray(int[] array)
    {
        for (int step = array.length / 2; step > 0; step /= 2)
        {
            for (int i = step; i < array.length; i++) {
                for (int j = i - step; j >= 0 && array[j] > array[j + step] ; j -= step) {
                    int x = array[j];
                    array[j] = array[j + step];
                    array[j + step] = x;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int[] array = {1,2,3};
        sum(array);
        Random rnd = new Random();
        int[] array1 = new int[10];
        for(int i =0;i<array1.length;i++)
        {
            array1[i]=rnd.nextInt()%100;
        }
        printArray("Неотсортированный массив: ",array1);
        sortArray(array1);
        printArray("Отсортированный массив: ",array1);
        System.out.print("\nГармонический ряд: ");
        int count = 10;
        for (int i = 1; i<=count;i++){
            System.out.print("1/"+i+" ");
        }
        System.out.print("\nВведите число ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("\nФакториал числа "+num+" равен "+fact(num));
    }
}