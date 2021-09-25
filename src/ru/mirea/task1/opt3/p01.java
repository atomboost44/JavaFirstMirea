package ru.mirea.task1.opt3;
import java.util.Scanner;
public class p01
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int Sum = 0;
        int[] b = new int[20];
        for (int i = 0; i < 20; i++) {
            b[i] = i + 1;
            Sum = Sum + b[i];
        }
        System.out.println("Summa=" + Sum);
    }
}
