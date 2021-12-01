package ru.mirea.task7;

public class MovableCircle implements Movable
{
    private int radius;
    MovablePoint center;
    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        this.radius = radius;
    }
    public String toString()
    {
        return "radius = "+this.radius;
    }
    @Override
    public void moveUp()
    {
        center.moveUp();
    }
    @Override
    public void moveDown()
    {
        center.moveDown();
    }
    @Override
    public void moveLeft()
    {
        center.moveLeft();
    }
    @Override
    public void moveRight()
    {
        center.moveRight();
    }
}