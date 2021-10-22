package ru.mirea.task3;
public class Circle
{
    double radius;
    Circle(){}
    Circle(double radius)
    {
        this.radius = radius;
    }
    public double setRad()
    {
        return this.radius;
    }
    public double getRad(double radius)
    {
        return this.radius = radius;
    }
    public double Perimetr()
    {
        return 2*Math.PI*this.radius;
    }
}