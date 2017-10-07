package net.thumbtack.denisenko.trainee.figure.geometry;

import net.thumbtack.denisenko.trainee.figure.Colored;
import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Point2D;

public abstract class Figure implements Colored {

    // REVU color ?
    public abstract void move(int newX, int newY);
    public abstract double area();
    public abstract String printCoordinates();
    public abstract boolean isPointInFigure(Point2D point);

}
