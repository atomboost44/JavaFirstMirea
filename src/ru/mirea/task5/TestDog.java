package ru.mirea.task5;

import java.util.Scanner;

public class TestDog
{
    public static void main(String[] args)
    {
        String name;
        Scanner scan = new Scanner(System.in);
        System.out.print("Выберите пароду собаки: \n1 - Лабрадор \n2 - Овчарка \n3 - Кавказская овчарка\n ");
        int num;
        num = scan.nextInt();
        System.out.print("Введите кличку собаки: ");
        name = scan.next();
        if(num==1)
        {
            Labrador lb = new Labrador(name);
            System.out.print("У вас лабрадор по имени "+lb.setName());
        }
        else if(num == 2)
        {
            Shepherd sh = new Shepherd(name);
            System.out.print("У вас овчарка по имени "+sh.setName());
        }
        else  if(num == 3)
        {
            Caucazian caucazian = new Caucazian(name);
            System.out.print("У вас кавказская овчарка по имени "+caucazian.setName());
        }
    }
}