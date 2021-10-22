package ru.mirea.task6;
import java.lang.String;

public abstract class Entities implements Nameable, Priceable
{
    String name;
    String price;
    public Entities(String name, String price)
    {
        this.name = name;
        this.price = price;
    }
    @Override
    public void getName()
    {
        System.out.print(name);
    }
    @Override
    public void getPrice()
    {
        System.out.print(price);
    }
}
class Game extends Entities
{
    public Game(String name, String price)
    {
        super(name, price);
    }
}
class FootballClub extends Entities
{
    public FootballClub(String name, String price)
    {
        super(name, price);
    }
}