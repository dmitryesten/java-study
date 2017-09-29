package net.thumbtack.denisenko.trainee.lesson2.cylinder;

import net.thumbtack.denisenko.trainee.introduction.circle.Circle;
import net.thumbtack.denisenko.trainee.introduction.point2d.Point2D;
import net.thumbtack.denisenko.trainee.lesson2.point3d.Point3D;

import java.util.Objects;

public class Cylinder extends Circle {

    private int height;


    public Cylinder(Point2D p, int radius, int height){
        super(p, radius);
        this.height = height;
    }


    public Cylinder(int x, int y, int radius, int height) {
        super(x, y, radius);
        this.height = height;
    }


    public static String printCoordinates(Cylinder c){
        return Circle.printCoordinats(c) + "\r\n Heigtht: "+c.height;
    }


    public static double areaBase(Cylinder c){
        return Circle.area(c);
    }


    public static double volume(Cylinder c){
        return Cylinder.areaBase(c) * c.height;
    }


    public void move(int x, int y){
        super.move(x, y);
    }


    public static boolean isPointInCylinder(int x, int y, int z, Cylinder c){
        return c.isPointInCircle(x, y) && z <= c.height;
    }


    public static boolean isPointInCylinder(Point3D point, Cylinder cylinder){
        return (Circle.isPointInCircle(point, cylinder) && point.getZ() <= cylinder.height );
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cylinder)) return false;
        if (!super.equals(o)) return false;
        Cylinder cylinder = (Cylinder) o;
        return height == cylinder.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height);
    }
}
