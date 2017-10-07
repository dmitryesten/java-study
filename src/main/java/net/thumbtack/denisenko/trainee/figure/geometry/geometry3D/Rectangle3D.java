package net.thumbtack.denisenko.trainee.figure.geometry.geometry3D;

import net.thumbtack.denisenko.trainee.figure.Color;
import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Point2D;
import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Rectangle;

import java.util.Objects;

public class Rectangle3D extends Rectangle {

    private double widthX;
    private double lengthY;
    private double heightZ;

    private String color;


    public Rectangle3D(){
        this(1, 1, 1);
    }

    public Rectangle3D(Point3D topLeftBase, Point3D bottomRightBase){
        super(topLeftBase, bottomRightBase);
        this.widthX = bottomRightBase.getX() - topLeftBase.getX();
        this.lengthY = topLeftBase.getY() -  bottomRightBase.getY();
        this.heightZ = topLeftBase.getZ();
    }

    public Rectangle3D(Point3D topLeftBase, Point3D bottomRightBase, String color){
        super(topLeftBase, bottomRightBase);
        this.widthX = bottomRightBase.getX() - topLeftBase.getX();
        this.lengthY = topLeftBase.getY() -  bottomRightBase.getY();
        this.heightZ = topLeftBase.getZ();
        this.color = color;
    }

    public Rectangle3D(Point3D topLeftBase, Point3D bottomRightBase, Color color){
        super(topLeftBase, bottomRightBase);
        this.widthX = bottomRightBase.getX() - topLeftBase.getX();
        this.lengthY = topLeftBase.getY() -  bottomRightBase.getY();
        this.heightZ = topLeftBase.getZ();
        this.color = color.toString();
    }

    public Rectangle3D(Point2D topLeftBase, Point2D bottomRightBase, int height){
        super(topLeftBase, bottomRightBase);
        this.widthX = bottomRightBase.getX() - topLeftBase.getX();
        this.lengthY = topLeftBase.getY() -  bottomRightBase.getY();
        this.heightZ = height;
    }

    public Rectangle3D(Point2D topLeftBase, Point2D bottomRightBase, int height, String color){
        super(topLeftBase, bottomRightBase);
        this.widthX = bottomRightBase.getX() - topLeftBase.getX();
        this.lengthY = topLeftBase.getY() -  bottomRightBase.getY();
        this.heightZ = height;
        this.color = color;
    }

    public Rectangle3D(Point2D topLeftBase, Point2D bottomRightBase, int height, Color color){
        super(topLeftBase, bottomRightBase);
        this.widthX = bottomRightBase.getX() - topLeftBase.getX();
        this.lengthY = topLeftBase.getY() -  bottomRightBase.getY();
        this.heightZ = height;
        this.color = color.toString();
    }


    public Rectangle3D(int width, int length, int height){
        super(width, length);
        this.widthX = width;
        this.lengthY = length;
        this.heightZ = height;
    }

    public Rectangle3D(int width, int length, int height, String color){
        super(width, length);
        this.widthX = width;
        this.lengthY = length;
        this.heightZ = height;
        this.color = color;
    }

    public Rectangle3D(int width, int length, int height, Color color){
        super(width, length);
        this.widthX = width;
        this.lengthY = length;
        this.heightZ = height;
        this.color = color.toString();
    }


    public String printCoordinates(Rectangle3D r){
        return super.printCoordinates() + "\r\nHeight: "+ r.heightZ;
    }


    public void move(int newX, int newY){
        super.move(newX, newY);
    }


    public void reduceBase(int n){
        super.reduceRectangle(n, n);
    }


    public double area(){
        return super.area();
    }


    public  double volume (){
        return widthX * lengthY * heightZ;
    }


    public boolean isPointInFigure(int x, int y, int z){
        return super.isPointInFigure(x, y) && heightZ >= z;
    }


    public boolean isPointInFigure(Point3D p){
        return super.isPointInFigure(p) && heightZ >= p.getZ();
    }


    public static boolean isRect3DCrossingWithOtherRect3D(Rectangle3D r1, Rectangle3D r2){
        return Rectangle3D.isRectangleCrossingWithOtherRectangle(r1, r2);
    }

    public static boolean isRectangleContainedInOtherRectangle(Rectangle3D innerRect, Rectangle3D externalRect){
        return Rectangle.isRectangleContainedInOtherRectangle(innerRect, externalRect) && externalRect.heightZ >= innerRect.heightZ;
    }


    public double getHeightZ() {
        return heightZ;
    }

    public void setHeightZ(int heightZ) {
        this.heightZ = heightZ;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle3D)) return false;
        if (!super.equals(o)) return false;
        Rectangle3D that = (Rectangle3D) o;
        return Double.compare(that.widthX, widthX) == 0 &&
                Double.compare(that.lengthY, lengthY) == 0 &&
                Double.compare(that.heightZ, heightZ) == 0 &&
                Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), widthX, lengthY, heightZ, color);
    }
}
