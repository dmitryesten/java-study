package net.thumbtack.denisenko.trainee.introduction.circle;

import net.thumbtack.denisenko.trainee.introduction.point2d.Point2D;

import java.util.Objects;

public class Circle {

    private int x;
    private int y;
    private int radius;


    public Circle (Point2D point, int radius) {
        this.x = point.getX();
        this.y = point.getY();
        this.radius = radius;
    }

    public Circle (int x, int y, int radius) {
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
        return (Math.sqrt(pointX*pointX + pointY*pointY) < getRadius());
    }


    public void move(int newX, int newY){
        x += newX;  y += newY;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
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
