package net.thumbtack.denisenko.trainee.figure.geometry3D;

import net.thumbtack.denisenko.trainee.figure.geometry2D.Point2D;
import java.util.Objects;

public class Point3D extends Point2D {

    private int z;


    public Point3D(){
        super(0, 0);
        this.z = 0;
    }


    public Point3D(int x, int y, int z){
        super(x, y);
        this.z = z;
    }

    public String printCoordinates(){
        return "X: "+super.getX()+"; Y: "+super.getY()+"; Z: "+getZ();
    }

    public String printCoordinates(Point3D p){
        return super.printCoordinates() +" Z: "+ p.getZ();
    }

    public void move(int x, int y, int z){
        super.move(x, y);
        setZ(getZ() + z);
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
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
