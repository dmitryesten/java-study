package net.thumbtack.denisenko.trainee.geometry2D;

import java.util.Objects;

public class Circle extends Figure {

    private double x;
    private double y;
    private double radius;

    public Circle (Point2D point, double radius) {
        this.x = point.getX();
        this.y = point.getY();
        this.radius = radius;
    }

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public String printCoordinates(){
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



    public  double length(){
        return 2 * Math.PI * getRadius();
    }



    public void move(int newX, int newY){
        setX(getX()+ newX);
        setY(getY() + newY);
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return x == circle.x &&
                y == circle.y &&
                radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, radius);
    }


}
