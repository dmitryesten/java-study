package net.thumbtack.denisenko.trainee.introduction;

// REVU move to another package, create it
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


}
