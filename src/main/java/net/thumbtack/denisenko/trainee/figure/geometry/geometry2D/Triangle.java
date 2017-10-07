package net.thumbtack.denisenko.trainee.figure.geometry.geometry2D;

import net.thumbtack.denisenko.trainee.figure.Color;
import net.thumbtack.denisenko.trainee.figure.geometry.Figure;
import net.thumbtack.denisenko.trainee.mathoperation.FloatingOperations;

import java.util.Objects;

public class Triangle extends Figure {

    private double x1;
    private double y1;

    private double x2;
    private double y2;

    private double x3;
    private double y3;

    private String color;


    public Triangle(Point2D point1, Point2D point2, Point2D point3){
        this.x1 = point1.getX();
        this.y1 = point1.getY();

        this.x2 = point2.getX();
        this.y2 = point2.getY();

        this.x3 = point3.getX();
        this.y3 = point3.getY();
    }

    public Triangle(Point2D point1, Point2D point2, Point2D point3, String color){
        this.x1 = point1.getX();
        this.y1 = point1.getY();

        this.x2 = point2.getX();
        this.y2 = point2.getY();

        this.x3 = point3.getX();
        this.y3 = point3.getY();
        this.color = color;
    }

    public Triangle(Point2D point1, Point2D point2, Point2D point3, Color color){
        this.x1 = point1.getX();
        this.y1 = point1.getY();

        this.x2 = point2.getX();
        this.y2 = point2.getY();

        this.x3 = point3.getX();
        this.y3 = point3.getY();
        this.color = color.toString();
    }


    public String printCoordinates(){
        return "Angle_№1: ("+getX1()+ ", " +getY1()+") " + "\r\n" +
                "Angle_№2: ("+getX2()+ ", " +getY2()+ ") " + "\r\n"+
                "Angle_№3: ("+getX3()+ ", " +getY3()+ ") " + "\r\n";
    }

    @Override
    public boolean isPointInFigure(Point2D p) {
        boolean a =(((p.getX() - getX1())*(getY1() - getY2())-(p.getY() - getY1())*(getX1() - getX2()) ) >= 0) ? true : false;
        boolean b =(((p.getX() - getX2())*(getY2() - getY3())-(p.getY() - getY2())*(getX2() - getX3()) ) >= 0) ? true : false;
        boolean c =(((p.getX() - getX3())*(getY3() - getY1())-(p.getY() - getY3())*(getX3() - getX1()) ) >= 0) ? true : false;
        return !(a && b && c);
    }


    public boolean isPointInFigure(double x, double y){
        boolean a =((x - getX1())*(getY1() - getY2())-(y - getY1())*(getX1() - getX2()) ) >= 0 ? true : false;
        boolean b =((x - getX2())*(getY2() - getY3())-(y - getY2())*(getX2() - getX3()) ) >= 0 ? true : false;
        boolean c =((x - getX3())*(getY3() - getY1())-(y - getY3())*(getX3() - getX1()) ) >= 0 ? true : false;
        return !(a && b && c);
    }


    public boolean isIsosceles(){
        return  FloatingOperations.compareValues(lengthA(), lengthB()) &&
                FloatingOperations.compareValues(lengthA(), lengthC()) &&
                FloatingOperations.compareValues(lengthC(), lengthB());
    }


    public double area(){
        return Math.sqrt(semiPerimeter() * (semiPerimeter() - lengthA()) *
                (semiPerimeter() - lengthB())*(semiPerimeter() - lengthC()) );
    }



    private double lengthA() {
        return Math.sqrt( (getX1()-getX2())*(getX1()-getX2()) + (getY1()-getY2())*(getY1()-getY2()) );
    }

    private double lengthB() {
        return Math.sqrt( (getX2()-getX3())*(getX2()-getX3()) + (getY2()-getY3())*(getY2()-getY3()) );
    }

    private double lengthC() {
        return Math.sqrt( (getX1()-getX2())*(getX1()-getX2()) + (getY1()-getY2())*(getY1()-getY2()) );
    }

    private double semiPerimeter(){
        return (lengthA()+ lengthB() + lengthC()) / 2;
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


    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(Color color) {
        this.color = color.toString();
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
