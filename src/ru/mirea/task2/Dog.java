package ru.mirea.task2;

import java.util.Scanner;

public class Dog
{
    Scanner sc = new Scanner(System.in);
    int age;
    String name;
    String ageInHuman;
    Dog(int age, String name)
    {
        this.age = age;
        this.name = name;
        ToHuman();
    }
    public Dog()
    {
        //конструктор для второй собаки
    }
    public void setName()
    {
        System.out.print("\nВведите имя новой собаки: ");
        this.name = sc.next();
    }
    public void setAge()
    {
        System.out.print("Введите возраст новой собаки: ");
        this.age = sc.nextInt();
    }
    public String ToHuman()
    {
        ageInHuman="\nВозраст собаки в человеческих годах "+age*7+" лет";
        return ageInHuman;
    }
    @Override
    public String toString()
    {
        String strAge = null;
        if (this.age <5){ strAge = "года";}
        else if(this.age>4){ strAge = "лет";}
        return "Собака " + name+" "+age+" "+strAge+" "+ageInHuman;
    }
}