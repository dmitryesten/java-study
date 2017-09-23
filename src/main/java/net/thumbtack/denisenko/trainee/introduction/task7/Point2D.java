package net.thumbtack.denisenko.trainee.introduction.task7;


import java.util.Objects;

public class Point2D {


    private int x;
    private  int y;

    public Point2D(){
        this(0, 0);
    }


    public Point2D(int abscissaOx, int ordinateOy){
        this.x = abscissaOx;
        this.y = ordinateOy;
    }



    public  int getX(){
        return x;
    }


    public  int setX(int oX){
        return x = oX;
    }


    public  int getY(){
        return y;
    }


    public  int setY(int oY){
        return y = oY;
    }


    public void move(int valueMoveOX, int valueMoveOY){
        x += valueMoveOX;
        y += valueMoveOY;
    }


    public static String printCoordinates(Point2D point){
        return "OX: "+ point.getX()+"; OY: "+ point.getY();
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
