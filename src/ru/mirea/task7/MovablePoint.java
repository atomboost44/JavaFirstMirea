package ru.mirea.task7;

public class MovablePoint implements Movable
{
    private int x,y;
    private int xSpeed, ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x= x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString()
    {
        return "x = "+x+" y = "+y+" xSpeed = "+xSpeed+" ySpeed = "+ySpeed;
    }
    @Override
    public void moveUp(){}
    @Override
    public void moveDown(){}
    @Override
    public void moveLeft(){}
    @Override
    public void moveRight(){}
}