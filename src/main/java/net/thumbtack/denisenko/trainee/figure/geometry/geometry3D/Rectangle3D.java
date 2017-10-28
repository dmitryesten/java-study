package net.thumbtack.denisenko.trainee.figure.geometry.geometry3D;

import net.thumbtack.denisenko.trainee.exceptions.ColorException;
import net.thumbtack.denisenko.trainee.enums.Color;
import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Point2D;
import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Rectangle;

import java.util.Objects;

public class Rectangle3D extends Rectangle {

    private double widthX;
    private double lengthY;
    private double heightZ;

    public Rectangle3D(){
        this(1, 1, 1, (Color) null);
    }


    public Rectangle3D(Point3D topLeftBase, Point3D bottomRightBase, Color color){
        super(topLeftBase, bottomRightBase, color);
        this.widthX = bottomRightBase.getX() - topLeftBase.getX();
        this.lengthY = topLeftBase.getY() -  bottomRightBase.getY();
        this.heightZ = topLeftBase.getZ();
    }

    public Rectangle3D(Point3D topLeftBase, Point3D bottomRightBase, String color) throws ColorException {
        this(topLeftBase, bottomRightBase, Color.colorFromString(color));
    }

    public Rectangle3D(Point2D topLeftBase, Point2D bottomRightBase, int height, Color color){
        super(topLeftBase, bottomRightBase, color);
        this.widthX = bottomRightBase.getX() - topLeftBase.getX();
        this.lengthY = topLeftBase.getY() -  bottomRightBase.getY();
        this.heightZ = height;
    }

    public Rectangle3D(Point2D topLeftBase, Point2D bottomRightBase, int height, String color) throws ColorException {
        this(topLeftBase, bottomRightBase, height, Color.colorFromString(color));
    }

    public Rectangle3D(int width, int length, int height, Color color){
        super(width, length, color);
        this.widthX = width;
        this.lengthY = length;
        this.heightZ = height;
    }

    public Rectangle3D(int width, int length, int height, String color) throws ColorException {
        this(width, length, height, Color.colorFromString(color));
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
                Double.compare(that.heightZ, heightZ) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), widthX, lengthY, heightZ);
    }
}
