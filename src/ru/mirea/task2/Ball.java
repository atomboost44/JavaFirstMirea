package ru.mirea.task2;

public class Ball
{
    final double PI = 3.14;
    double R;
    double C;
    double S;
    double V;
    public Ball(double R)
    {
        this.R = R;
        V = 2*PI*this.R;
        S = PI*this.R*this.R;
        C = 2*PI*this.R;
    }
    public double getV()
    {
        return V;
    }
    public double getS()
    {
        return S;
    }
    public double getC()
    {
        return C;
    }
}