package ru.mirea.task2;

public class TestDog
{
    public static void main(String[] args)
    {
        int age = 5;
        String name= "Бобик";
        Dog dg1 = new Dog(age,name);
        Dog dg2 = new Dog();
        System.out.print(dg1.toString());
        dg2.setName();
        dg2.setAge();
        dg2.ToHuman();
        System.out.print(dg2.toString());
    }
}