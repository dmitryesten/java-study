package net.thumbtack.denisenko.trainee.figure.geometry.geometry3D;

import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Point2D;
import java.util.Objects;

public class Point3D extends Point2D {

    private double z;

    public Point3D(double x, double y, double height){
        super(x, y);
        this.z = height;
    }


    final public String printCoordinates(){
        return "X: "+super.getX()+"; Y: "+super.getY()+"; Z: "+getZ();
    }


    public void move(double x, double y, double z){
        super.move(x, y);
        setZ(getZ() + z);
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Point3D point3D = (Point3D) o;
        return super.equals(o) && z == point3D.z ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), z);
    }
}
