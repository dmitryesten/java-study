package net.thumbtack.denisenko.trainee.figure.geometry2D;

import net.thumbtack.denisenko.trainee.figure.Colored;

public abstract class Figure implements Colored {

    public abstract void move(int newX, int newY);
    public abstract double area();
    public abstract String printCoordinates();
    public abstract boolean isPointInFigure(Point2D point);

}
