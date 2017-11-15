package net.thumbtack.denisenko.trainee.figure.geometry.geometry2D;


import java.util.Objects;

public class Point2D {

    private double x;
    private double y;

    public Point2D(){
        this(0, 0);
    }

    public Point2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    public String printCoordinates(){
        return "OX: "+getX()+"; OY: "+getY();
    }


    public double getX(){
        return x;
    }


    public double setX(double oX){
        return x = oX;
    }


    public double getY(){ return y; }


    public double setY(double oY){
        return y = oY;
    }


    public void move(double valueMoveOX, double valueMoveOY){
        x += valueMoveOX;
        y += valueMoveOY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point2D point2D = (Point2D) o;
        return x == point2D.x &&
                y == point2D.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
