package ru.mirea.task4;

public class BallTest
{
    public static void main(String[] args)
    {
        Ball ball = new Ball(10,5);
        System.out.print("X = " + ball.getX()+"\n");
        System.out.print("Y = " + ball.getY());
        ball.move(3,8);
        ball.toString();
    }
}