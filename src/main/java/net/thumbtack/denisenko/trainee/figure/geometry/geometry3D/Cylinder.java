package net.thumbtack.denisenko.trainee.figure.geometry.geometry3D;

import net.thumbtack.denisenko.trainee.exceptions.ColorException;
import net.thumbtack.denisenko.trainee.figure.Color;
import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Circle;
import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Point2D;

import java.util.Objects;

public class Cylinder extends Circle{

    private String color;
    private double height;


    public Cylinder(Point3D p, int radius){
        super(p,radius);
        this.height = p.getZ();
    }

    public Cylinder(Point3D p, int radius, String color) throws ColorException{
        super(p,radius);
        this.height = p.getZ();
        try {
            this.color = color;
        }catch (IllegalArgumentException ex){
            throw new ColorException("Error print color: ", color);
        }
    }

    public Cylinder(Point3D p, int radius, Color color){
        super(p,radius);
        this.height = p.getZ();
        this.color = color.toString();
    }

    public Cylinder(Point2D p, double radius, double height){
        super(p, radius);
        this.height = height;
    }

    public Cylinder(Point2D p, double radius, double height, Color color){
        super(p, radius);
        this.height = height;
        this.color = color.toString();
    }

    public Cylinder(Point2D p, double radius, double height, String color) throws ColorException{
        super(p, radius);
        this.height = height;
        try {
            this.color = color;
        }catch (IllegalArgumentException ex){
            throw new ColorException("Error print color:", color);
        }
    }


    public Cylinder(double x, double y, double radius, double height) {
        super(x, y, radius);
        this.height = height;
    }

    public Cylinder(double x, double y, double radius, double height, Color color) {
        super(x, y, radius);
        this.height = height;
        this.color = color.toString();
    }

    public Cylinder(double x, double y, double radius, double height, String color) throws ColorException {
        super(x, y, radius);
        this.height = height;
        try {
            this.color = color;
        }catch (IllegalArgumentException ex){
            throw new ColorException("Error print color:", color);
        }
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
