package ru.mirea.task5;

import java.util.Scanner;

public class DishTest
{
    public static void main(String[] args)
    {
        boolean choice=true;
        System.out.print("Выберите посуду, которую хотите купить:\n1) Glass\n2) Plate");
        Scanner sc = new Scanner(System.in);
        for(int i =0;choice==true;i++)
        {
            String color;
            System.out.print("\nНапишите номер посуды: ");
            int num= sc.nextInt();
            System.out.print("\nНапишите кол-во предметов: ");
            int number = sc.nextInt();
            if(num==1)
            {
                Glass gl = new Glass(number);
                System.out.print("\nНапишите цвет стаканов: ");
                color = sc.next();
                gl.setColor(color);
            }
            else if(num==2)
            {
                Plate pl = new Plate(number);
                System.out.print("\nНапишите цвет тарелок: ");
                color = sc.next();
                pl.setColor(color);
            }
            System.out.print("Хотите ещё? Да (1) или Нет (0) - ");
            int ch = sc.nextInt();
            if(ch == 0)
            {
                choice = false;
            }
        }
    }
}