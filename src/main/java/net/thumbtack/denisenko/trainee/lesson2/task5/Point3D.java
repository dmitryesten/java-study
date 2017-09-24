package net.thumbtack.denisenko.trainee.lesson2.task5;

import net.thumbtack.denisenko.trainee.introduction.task7.Point2D;

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


    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

}
