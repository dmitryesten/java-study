package net.thumbtack.denisenko.trainee.introduction.circle;

import net.thumbtack.denisenko.trainee.introduction.point2d.Point2D;
import net.thumbtack.denisenko.trainee.lesson2.figure.Figure;

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

    public Circle (double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }


    public static String printCoordinats(Circle circle){
        return "Координаты ("+ circle.getX()+"; "+ circle.getY()+ "), радиус = "+circle.getRadius();
    }


    public static double area(Circle circle){
        return Math.PI * circle.getRadius() * circle.getRadius();
    }


    public static double length(Circle circle){
        return 2 * Math.PI * circle.getRadius();
    }


    public static boolean isPointInCircle(Point2D point, Circle circle){
        return (Math.sqrt(point.getX()*point.getX() + point.getY()*point.getY()) < circle.getRadius());
    }


    public boolean isPointInCircle(int pointX, int pointY){
        return ( (pointX*pointX + pointY*pointY) < getRadius() * getRadius());
    }


    public void move(int newX, int newY){
        x += newX;  y += newY;
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

    public void setY(int y) {
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
