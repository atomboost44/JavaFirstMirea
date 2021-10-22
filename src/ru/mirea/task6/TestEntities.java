package ru.mirea.task6;

public class TestEntities
{
    public static void main(String[] args)
    {
        String name = "Battlefield 2042";
        String price1 = "3499 rubles";
        String club = "PFC CSKA";
        String price2 = "400.000.000 dollars";
        Game gm = new Game(name,price1);
        gm.getName();
        System.out.print(" cost ");
        gm.getPrice();
        System.out.print("\n");
        FootballClub cb = new FootballClub(club,price2);
        cb.getName();
        System.out.print(" cost ");
        cb.getPrice();
    }
}