package net.thumbtack.denisenko.trainee.figure.geometry.geometry2D;

import net.thumbtack.denisenko.trainee.exceptions.ColorException;
import net.thumbtack.denisenko.trainee.figure.Color;
import net.thumbtack.denisenko.trainee.figure.geometry.Figure;
import java.util.Objects;


public class Circle extends Figure {

	private double x;
    private double y;
    private double radius;
    private Color color;

    public Circle (){
        this( new Point2D(1,1), 1, (Color) null);
    }

    public Circle (Point2D point, double radius, Color color) {
        this.x = point.getX();
        this.y = point.getY();
        this.radius = radius;
        this.color = color;
    }
    public Circle (Point2D point, double radius, String color) throws ColorException{
        this( point, radius, Color.colorFromString(color));
    }


    public Circle(double x, double y, double radius, Color color) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
    }
    public Circle(double x, double y, double radius, String color) throws ColorException {
        this( x, y, radius, Color.colorFromString(color));
    }

    final public String printCoordinates(){
        return "Координаты ("+ getX()+"; "+ getY()+ "), радиус = "+getRadius();
    }

    @Override
    public boolean isPointInFigure(Point2D point) {
        return (Math.sqrt(point.getX()*point.getX() + point.getY()*point.getY()) < getRadius());
    }


    public boolean isPointInFigure(int pointX, int pointY) {
        return ( (pointX*pointX + pointY*pointY) < getRadius() * getRadius());
    }


    public double area(){
        return Math.PI * getRadius() * getRadius();
    }



    public double length(){
        return 2 * Math.PI * getRadius();
    }


    public void move(int newX, int newY){
        setX(getX() + newX);
        setY(getY() + newY);
    }


    public double getX() {
        return x;
    }

    private void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    private void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }


    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void setColor(String color) throws ColorException {
        this.color = Color.colorFromString(color);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.x, x) == 0 &&
                Double.compare(circle.y, y) == 0 &&
                Double.compare(circle.radius, radius) == 0 &&
                Objects.equals(color, circle.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, radius, color);
    }
}
