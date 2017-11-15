package net.thumbtack.denisenko.trainee.figure.geometry;

import net.thumbtack.denisenko.trainee.exceptions.ColorException;
import net.thumbtack.denisenko.trainee.enums.Color;
import net.thumbtack.denisenko.trainee.interfaces.Colored;
import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Point2D;

import java.io.Serializable;

public abstract class Figure implements Colored, Serializable{

    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public abstract void move(double newX, double newY);
    public abstract double area();
    public abstract String printCoordinates();
    public abstract boolean isPointInFigure(Point2D point);

    public Color getColor(){
        return color;
    }
    public void setColor(Color color){
        this.color = color;
    }
    public void setColor(String color) throws ColorException {
        this.color = Color.colorFromString(color);
    }

}
