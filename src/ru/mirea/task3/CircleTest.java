package ru.mirea.task3;

import java.util.Scanner;

public class CircleTest
{
    public static void main(String[] args)
    {
        Circle crc1 = new Circle(10);
        Circle crc2 = new Circle();
        Scanner sc = new Scanner(System.in);
        System.out.print("Напишите радиус второй окружности: ");
        crc2.getRad(sc.nextDouble());
        System.out.print("Радиус первой окружности: "+crc1.setRad()+"\n");
        System.out.print("Периметр второй окружности: "+crc2.Perimetr());

    }
}