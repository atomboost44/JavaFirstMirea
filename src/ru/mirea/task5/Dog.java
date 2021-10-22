package ru.mirea.task5;

import java.lang.String;
public abstract class Dog
{
    String name;
    public Dog(String name){ this.name = name; }
    public String setName(){ return name; }
}
class Labrador extends Dog
{
    public Labrador(String name)
    {
        super(name);
    }
    public String setName(){ return name; }
}
class Shepherd extends Dog
{
    public Shepherd(String name)
    {
        super(name);
    }
    public String setName(){ return name; }
}
class Caucazian extends  Shepherd
{
    public Caucazian(String name)
    {
        super(name);
    }
    public String setName(){ return name; }
}