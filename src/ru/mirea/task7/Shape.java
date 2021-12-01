package ru.mirea.task7;

public abstract class Shape
{
    protected String color;
    protected boolean filled;
    public Shape(){}
    public Shape(String color,boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }
    public String getColor()
    {
        return this.color;
    }
    public void  setColor(String color)
    {
        this.color = color;
    }
    public boolean isFilled()
    {
        return filled;
    }
    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public  abstract String ToString();
}
class Circle extends Shape
{
    protected double radius;
    public Circle(){}
    public Circle(double radius)
    {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled)
    {
        this.radius = radius;
        this.filled = filled;
        this.color = color;
    }
    public double getRadius(){return this.radius;}
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    @Override
    public double getArea()
    {
        return 0;
    }
    @Override
    public double getPerimeter()
    {
        return 0;
    }
    @Override
    public String ToString()
    {
        return null;
    }
}
class Rectangle extends Shape
{
    protected double width;
    protected double length;
    public Rectangle(){}
    public Rectangle(double width, double length)
    {
        this.length = length;
        this.width = width;
    }
    public  Rectangle(double width, double length, String color, boolean filled)
    {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }
    public double getWidth() {
        return width;
    }
    public void setWight(double width)
    {
        this.width = width;
    }
    public double getLength()
    {
        return this.length;
    }
    public void setLength(double length)
    {
        this.length = length;
    }
    @Override
    public double getArea() {
        return 0;
    }
    @Override
    public double getPerimeter() {
        return 0;
    }
    @Override
    public String ToString() {
        return null;
    }
}
class Square extends Rectangle
{
    private  double side;
    public  Square(){}
    public  Square(double side){ this.side = side;}
    public  Square(double side, String color, boolean filled)
    {
        this.side = side;
        this.filled = filled;
        this.color = color;
    }
    public double getSide() {
        return side;
    }
    public  void setSide(double side)
    {
        this.side = side;
    }
    @Override
    public void setWight(double width)
    {
        this.width = width;
    }
    @Override
    public void setLength(double length)
    {
        this.length = length;
    }@Override
public String ToString()
{
    return null;
}
}