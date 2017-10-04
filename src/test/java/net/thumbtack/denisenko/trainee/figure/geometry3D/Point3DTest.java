package net.thumbtack.denisenko.trainee.figure.geometry3D;

import org.junit.Test;

import static org.junit.Assert.*;

public class Point3DTest {

    Point3D point3D = new Point3D(1, 1,1);

    @Test
    public void printCoordinates() throws Exception {
        assertEquals("X: "+1+"; Y: "+1+"; Z: "+1, point3D.printCoordinates());
    }

    @Test
    public void move() throws Exception {
        point3D.move(2,2,2);
    }

}