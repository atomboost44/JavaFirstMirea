package ru.mirea.task5;

public abstract class Dish
{
    String price;
    int number;
    String color;
    Dish(int number){ this.number = number;}
    public void setColor(String color){this.color=color;}
}
class Plate extends Dish
{
    Plate(int number)
    {
        super(number);
    }
    public void setColor(String color){this.color=color;}
}
class Glass extends Dish
{
    Glass(int number)
    {
        super(number);
    }
    public void setColor(String color){this.color=color;}
}