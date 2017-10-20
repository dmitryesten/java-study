package net.thumbtack.denisenko.trainee.figure.geometry.geometry3D;

import net.thumbtack.denisenko.trainee.exceptions.ColorException;
import net.thumbtack.denisenko.trainee.figure.Color;
import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Circle;
import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Point2D;

import java.util.Objects;

public class Cylinder extends Circle{

 // REVU remove
	private Color color;
    private double height;


    public Cylinder(Point3D p, int radius, Color color){
        super(p,radius, color);
        this.height = p.getZ();
        this.color = color;
    }

    public Cylinder(Point3D p, int radius, String color) throws ColorException {
        this(p, radius, Color.colorFromString(color));
    }


    public Cylinder(Point2D p, double radius, double height, Color color){
        super(p, radius, color);
        this.height = height;
        this.color = color;
    }

    public Cylinder(Point2D p, double radius, double height, String color) throws ColorException {
        this(p, radius, height, Color.colorFromString(color));
    }

    public Cylinder(double x, double y, double radius, double height, Color color) {
        super(x, y, radius,color);
        this.height = height;
        this.color = color;
    }

    public Cylinder(double x, double y, double radius, double height, String color) throws ColorException {
        this(x, y, radius, height,Color.colorFromString(color));
    }



    final public String printCoordinates(Cylinder c){
        return super.printCoordinates() + "\r\n Heigtht: "+c.height;
    }


    public double area(){
        return super.area();
    }

    public double lateralSurface (){
        return area() * height;
    }

    public double volume(){
        return area() * height;
    }


    public void move(int x, int y){
        super.move(x, y);
    }


    public boolean isPointInFigure(int x, int y, int z){
        return super.isPointInFigure(x, y) && z <= getHeight();
    }


    public boolean isPointInFigure(Point3D point){
        return ( super.isPointInFigure(point) && point.getZ() <= getHeight() );
    }


    public double getHeight() {
        return height;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cylinder)) return false;
        if (!super.equals(o)) return false;
        Cylinder cylinder = (Cylinder) o;
        return Double.compare(cylinder.height, height) == 0 &&
                Objects.equals(color, cylinder.color);
    }


    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color, height);
    }

}
