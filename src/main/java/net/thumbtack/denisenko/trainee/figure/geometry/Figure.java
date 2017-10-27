package net.thumbtack.denisenko.trainee.figure.geometry;

import net.thumbtack.denisenko.trainee.exceptions.ColorException;
import net.thumbtack.denisenko.trainee.figure.Color;
import net.thumbtack.denisenko.trainee.interfaces.Colored;
import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Point2D;

import java.io.Serializable;

public abstract class Figure implements Colored, Serializable{

	// REVU private
    public Color color;

    public abstract void move(int newX, int newY);
    public abstract double area();
    public abstract String printCoordinates();
    public abstract boolean isPointInFigure(Point2D point);

    public abstract Color getColor();
    public abstract void setColor(Color color);
    public abstract void setColor(String color) throws ColorException;

}
