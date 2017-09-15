package net.thumbtack.denisenko.trainee.introduction;

public class Point2D {


    private static int abscissaOx;
    private static int ordinateOy;

    public Point2D(){
        this(0, 0);
    }


    Point2D(int abscissaOx, int ordinateOy){
        this.abscissaOx = abscissaOx;
        this.ordinateOy = ordinateOy;
    }


    public static int getAbscissaOx(){
        return abscissaOx;
    }


    public static int setAbscissaOx(int oX){
        return abscissaOx = oX;
    }


    public static int getOrdinateOy(){
        return ordinateOy;
    }


    public static int setOrdinateOy(int oY){
        return ordinateOy = oY;
    }


    public static void movePoint(int valueMoveOX, int valueMoveOY){
        abscissaOx += valueMoveOX;
        ordinateOy += valueMoveOY;
    }


    public static String printCoordinates(){
        return "OX: "+ getAbscissaOx()+"; OY: "+ getOrdinateOy();
    }

    /*
    public boolean equals(){
        return true;
    }

    public int hashCode(){
        return 0;
    }
    */

}
