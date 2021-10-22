package ru.mirea.task3;
import java.lang.String;
public class BookTest
{
    public static void main(String[] args)
    {
        String writer = "Фрэнк Герберт";
        String name = "Дюна";
        int year = 1844;
        Book ob_y = new Book(year);
        Book ob_wr = new Book(name,writer);
        System.out.print("Книга: ");
        System.out.print(ob_wr.getWriter()+" ");
        System.out.print(ob_y.getYear()+"\n");
        String name2 = "П...Ц";
        String aut = "Виктор Логинов";
        int year2 = 2021;
        Book ob2 = new Book(name2,aut,year2);
        System.out.print("Книга: "+ob2.getBook());
    }
}