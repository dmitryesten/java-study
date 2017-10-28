package net.thumbtack.denisenko.trainee.figure.geometry.geometry3D;

import net.thumbtack.denisenko.trainee.enums.Color;
import org.junit.Test;

import static org.junit.Assert.*;

public class CylinderTest {

    @Test
    public void printCoordinates() throws Exception {
        Cylinder cylinder = new Cylinder(5, 5,3, 4,(Color) null);

        assertEquals(5, cylinder.getX(), 0.001);
        assertEquals(5, cylinder.getY(), 0.001);
        assertEquals(3, cylinder.getRadius(), 0.001);
        assertEquals(4, cylinder.getHeight(), 0.001);
    }


    @Test
    public void areaBase() throws Exception {
        Cylinder cylinder = new Cylinder(5, 5,3, 4,(Color) null);
        assertEquals(Math.PI *3*3, cylinder.area(), 0.001);
    }

    @Test
    public void volume() throws Exception {
        Cylinder cylinder = new Cylinder(5, 5,3, 4, (Color)null);
        assertEquals(Math.PI *3*3*4, cylinder.volume(), 0.001);
    }

    @Test
    public void move() throws Exception {
        Cylinder cylinder = new Cylinder(5, 5,3, 4,(Color) null);
        cylinder.move(2, 2);
        assertEquals(7, cylinder.getX(), 0.001);
        assertEquals(7, cylinder.getY(), 0.001);
    }

}