package net.thumbtack.denisenko.trainee.introduction.task9;

import net.thumbtack.denisenko.trainee.introduction.task7.Point2D;

public class Triangle {

    private int x1;
    private int y1;

    private int x2;
    private int y2;

    private int x3;
    private int y3;


    public Triangle(Point2D point1, Point2D point2, Point2D point3){
        this.x1 = point1.getX();
        this.y1 = point1.getY();

        this.x2 = point2.getX();
        this.y2 = point2.getY();

        this.x3 = point3.getX();
        this.y3 = point3.getY();
    }


    public static String printCoordinats(Triangle triangle){
        return "Angle_№1: ("+triangle.getX1()+ ", " + triangle.getY1()+") " + "\r\n" +
                "Angle_№2: ("+triangle.getX2()+ ", " + triangle.getY2()+ ") " + "\r\n"+
                "Angle_№3: ("+ triangle.getX3()+ ", " + triangle.getY3()+ ") " + "\r\n";
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getX3() {
        return x3;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public int getY3() {
        return y3;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }

}
