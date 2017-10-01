package net.thumbtack.denisenko.trainee.geometry2D;

public abstract class Figure  {

    public abstract void move(int newX, int newY);
    public abstract double area();
    public abstract String printCoordinates();
    public abstract boolean isPointInFigure(Point2D point);

}
