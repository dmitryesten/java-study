package net.thumbtack.denisenko.trainee.introduction;

public class Point2D {


    private int abscissaOx;
    private  int ordinateOy;

    public Point2D(){
        this(0, 0);
    }


    public Point2D(int abscissaOx, int ordinateOy){
        this.abscissaOx = abscissaOx;
        this.ordinateOy = ordinateOy;
    }


    public  int getAbscissaOx(){
        return abscissaOx;
    }


    public  int setAbscissaOx(int oX){
        return abscissaOx = oX;
    }


    public  int getOrdinateOy(){
        return ordinateOy;
    }


    public  int setOrdinateOy(int oY){
        return ordinateOy = oY;
    }


    public void movePoint(int valueMoveOX, int valueMoveOY){
        abscissaOx += valueMoveOX;
        ordinateOy += valueMoveOY;
    }


    public static String printCoordinates(Point2D point){
        return "OX: "+ point.getAbscissaOx()+"; OY: "+ point.getOrdinateOy();
    }


}
