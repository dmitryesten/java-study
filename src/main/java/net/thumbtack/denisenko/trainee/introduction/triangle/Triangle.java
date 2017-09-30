package net.thumbtack.denisenko.trainee.introduction.triangle;

import net.thumbtack.denisenko.trainee.introduction.floatingoperation.FloatingOperations;
import net.thumbtack.denisenko.trainee.introduction.point2d.Point2D;
import net.thumbtack.denisenko.trainee.lesson2.figure.Figure;

import java.util.Objects;

public class Triangle extends Figure {

    private double x1;
    private double y1;

    private double x2;
    private double y2;

    private double x3;
    private double y3;


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

    public static boolean pointInTriangle(Point2D p, Triangle t){
         boolean a =(((p.getX() - t.getX1())*(t.getY1() - t.getY2())-(p.getY() - t.getY1())*(t.getX1() - t.getX2()) ) >= 0) ? true : false;
         boolean b =(((p.getX() - t.getX2())*(t.getY2() - t.getY3())-(p.getY() - t.getY2())*(t.getX2() - t.getX3()) ) >= 0) ? true : false;
         boolean c =(((p.getX() - t.getX3())*(t.getY3() - t.getY1())-(p.getY() - t.getY3())*(t.getX3() - t.getX1()) ) >= 0) ? true : false;
        return !(a && b && c);
    }

    public boolean pointInTriangle(double x, double y){
        boolean a =((x - getX1())*(getY1() - getY2())-(y - getY1())*(getX1() - getX2()) ) >= 0 ? true : false;
        boolean b =((x - getX2())*(getY2() - getY3())-(y - getY2())*(getX2() - getX3()) ) >= 0 ? true : false;
        boolean c =((x - getX3())*(getY3() - getY1())-(y - getY3())*(getX3() - getX1()) ) >= 0 ? true : false;
        return a && b && c;
    }


    public static boolean isIsosceles(Triangle t){
        return  FloatingOperations.compareValues(Triangle.lengthA(t), Triangle.lengthB(t)) &&
                FloatingOperations.compareValues(Triangle.lengthA(t), Triangle.lengthC(t)) &&
                FloatingOperations.compareValues(Triangle.lengthC(t), Triangle.lengthB(t));
    }


    public static double area(Triangle tr){
        return Math.sqrt(Triangle.semiperimeter(tr) * (Triangle.semiperimeter(tr) - Triangle.lengthA(tr)) *
                (Triangle.semiperimeter(tr) - Triangle.lengthB(tr))*(Triangle.semiperimeter(tr) - Triangle.lengthC(tr)) );
    }



    private static double lengthA(Triangle tr) {
        return Math.sqrt( (tr.x1-tr.x2)*(tr.x1-tr.x2) + (tr.y1 -tr.y2)*(tr.y1 -tr.y2) );
    }

    private static double lengthB(Triangle tr) {
        return Math.sqrt( (tr.x2-tr.x3)*(tr.x2-tr.x3) + (tr.y2 -tr.y3)*(tr.y2 -tr.y3) );
    }

    private static double lengthC(Triangle tr) {
        return Math.sqrt( (tr.x1-tr.x2)*(tr.x1-tr.x2) + (tr.y1 -tr.y2)*(tr.y1 -tr.y2) );
    }

    private static double semiperimeter(Triangle tr){
        return (Triangle.lengthA(tr) + Triangle.lengthB(tr) + Triangle.lengthB(tr)) / 2;
    }

    public void move(int x, int y){
        setX1(getX1() + x);
        setX2(getX2() + x);
        setX3(getX3() + x);

        setY1(getX1() + y);
        setY2(getY2() + y);
        setY3(getY3() + y);
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public double getX3() {
        return x3;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public double getY3() {
        return y3;
    }

    public void setY3(double y3) {
        this.y3 = y3;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return x1 == triangle.x1 &&
                y1 == triangle.y1 &&
                x2 == triangle.x2 &&
                y2 == triangle.y2 &&
                x3 == triangle.x3 &&
                y3 == triangle.y3;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x1, y1, x2, y2, x3, y3);
    }
}
