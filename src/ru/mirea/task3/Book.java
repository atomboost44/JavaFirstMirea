package ru.mirea.task3;
import java.lang.String;
public class Book
{
    String writer;
    String name;
    int year;
    private String book;

    public Book(String n,int y)
    {
        name=n;
        year=y;
    }
    public Book(String w)
    {
        writer = w;
    }
    public Book(String n,String w)
    {
        name=n;
        writer=w;
    }
    public  Book(String n, String wr, int y)
    {
        name ="\""+ n+"\"";
        writer = wr;
        year = y;
    }
    public  Book(int y)
    {
        year = y;
    }
    public String getWriter()
    {
        return "\""+name+"\" "+writer;
    }
    public int getYear()
    {
        return year;
    }
    public String getBook()
    {
        return name+" "+writer+" "+year;
    }


}