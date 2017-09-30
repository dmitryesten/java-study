package net.thumbtack.denisenko.trainee.lesson2.rectangle3d;

import net.thumbtack.denisenko.trainee.introduction.point2d.Point2D;
import net.thumbtack.denisenko.trainee.introduction.rectangle.Rectangle;
import net.thumbtack.denisenko.trainee.lesson2.point3d.Point3D;

import java.util.Objects;

public class Rectangle3D extends Rectangle {

    private double widthX;
    private double lengthY;
    private double heightZ;


    public Rectangle3D(){
        this(1, 1, 1);
    }


    public Rectangle3D(Point2D topLeftBase, Point2D bottomRightBase, int height){
        super(topLeftBase, bottomRightBase);
        this.widthX = bottomRightBase.getX() - topLeftBase.getX();
        this.lengthY = topLeftBase.getY() -  bottomRightBase.getY();
        this.heightZ = height;
    }


    public Rectangle3D(int width, int length, int height){
        super(width, length);
        this.widthX = width;
        this.lengthY = length;
        this.heightZ = height;
    }



    public static String printCoordinates(Rectangle3D r){
        return Rectangle3D.printCoordinatesRectangle(r) + "\r\nHeight: "+ r.heightZ;
    }

    public void move(int newX, int newY){
        super.move(newX, newY);
    }

    public void reduceBase(int n){
        super.reduceRectangle(n, n);
    }

    public static double areaBase(Rectangle3D r){
        return Rectangle.areaRectangle(r);
    }


    public static double volume (Rectangle3D p){
        return p.widthX * p.lengthY * p.heightZ;
    }

    public static boolean isPoint3DInRectagle(int x, int y, int z, Rectangle3D r){
        return Rectangle3D.isPointContainedInRactangle(new Point2D(x, y), r) && r.heightZ >= z;
    }

    public static boolean isPoint3DInRectangle(Point3D p, Rectangle3D r){
        return Rectangle3D.isPointContainedInRactangle(p, r) && r.heightZ >= p.getZ();
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
        return widthX == that.widthX &&
                lengthY == that.lengthY &&
                heightZ == that.heightZ;
    }


    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), widthX, lengthY, heightZ);
    }
}
