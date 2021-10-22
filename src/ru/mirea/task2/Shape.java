package ru.mirea.task2;

import java.util.Scanner;

public class Shape
{
    final double PI = 3.14;
    int R;
    double S;
    double D;
    Shape(int R)
    {
        this.R = R;
        S = 4*PI*R*R;
        D = 2*R;
    }

    @Override
    public String toString() {
        return "Shape: " +
                "PI=" + PI +
                ", R=" + R +
                ", S=" + S +
                ", D=" + D;
    }
    public static void main(String[] args)
    {
        int R;
        Scanner sc = new Scanner(System.in);
        System.out.print("Напишите радиус сферы: ");
        R = sc.nextInt();
        Shape sh = new Shape(R);
        System.out.print("\n"+sh.toString());
    }
}