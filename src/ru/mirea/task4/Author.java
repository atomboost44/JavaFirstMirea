package ru.mirea.task4;

import java.lang.String;
public class Author
{
    String name, email;
    char gender;
    public Author( String n, String e, char g)
    {
        name = n;
        email =e;
        gender = g;
    }
    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return  email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public char getGender()
    {
        return gender;
    }
    @Override
    public String toString()
    {
        return "Author{" + "name='" + name + '\'' + ", email='" + email + '\'' + ", gender=" + gender + '}';
    }
}