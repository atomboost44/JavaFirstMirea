package ru.mirea.task2;

public class TestBook
{
    public static void main(String[] args)
    {
        String writer1 = "Alexandre Duma";
        String writer2 = "Herbert Frank";
        String name1 = "The Count of Monte Cristo";
        String name2 = "Dune";
        int year1 = 1844;
        int year2 = 1963;
        Book ob_wr1 = new Book(name1,writer1);
        Book ob_y1 = new Book(year1);
        Book book2 = new Book(name2,writer2, year2);
        System.out.print("Первая книга: ");
        System.out.print(ob_wr1.getWriter()+" "+ob_y1.getYear()+"\n");
        System.out.print(book2.getBook());
    }
}