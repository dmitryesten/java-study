package net.thumbtack.denisenko.trainee.introduction;

// REVU move to another package, create it
public class Point2D {

// REVU simply x and  y
    private int abscissaOx;
    private  int ordinateOy;

    public Point2D(){
        this(0, 0);
    }


    public Point2D(int abscissaOx, int ordinateOy){
        this.abscissaOx = abscissaOx;
        this.ordinateOy = ordinateOy;
    }


    // REVU getX
    public  int getAbscissaOx(){
        return abscissaOx;
    }

    // REVU setX. and so on
    public  int setAbscissaOx(int oX){
        return abscissaOx = oX;
    }


    public  int getOrdinateOy(){
        return ordinateOy;
    }


    public  int setOrdinateOy(int oY){
        return ordinateOy = oY;
    }


    // REVU move. You already in class Point2D, what can you move else ?
    public void movePoint(int valueMoveOX, int valueMoveOY){
        abscissaOx += valueMoveOX;
        ordinateOy += valueMoveOY;
    }


    public static String printCoordinates(Point2D point){
        return "OX: "+ point.getAbscissaOx()+"; OY: "+ point.getOrdinateOy();
    }


}
