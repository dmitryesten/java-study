package net.thumbtack.denisenko.trainee.lesson2.cylinder;

import net.thumbtack.denisenko.trainee.introduction.circle.Circle;
import net.thumbtack.denisenko.trainee.introduction.point2d.Point2D;
import net.thumbtack.denisenko.trainee.lesson2.cylinder.Cylinder;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class CylinderTest {



    @Test
    public void printCoordinates() throws Exception {
        Cylinder cylinder = new Cylinder(5, 5,3, 4);

        assertEquals(5, cylinder.getX());
        assertEquals(5, cylinder.getY());
        assertEquals(3, cylinder.getRadius());
        assertEquals(4, cylinder.getHeight());
    }


    @Test
    public void areaBase() throws Exception {
        Cylinder cylinder = new Cylinder(5, 5,3, 4);
        assertEquals(Math.PI *3*3, Cylinder.areaBase(cylinder), 0.001);
    }

    @Test
    public void volume() throws Exception {
        Cylinder cylinder = new Cylinder(5, 5,3, 4);
        assertEquals(Math.PI *3*3*4, Cylinder.volume(cylinder), 0.001);
    }

    @Test
    public void move() throws Exception {
        Cylinder cylinder = new Cylinder(5, 5,3, 4);
        cylinder.move(2, 2);
        assertEquals(7, cylinder.getX());
        assertEquals(7, cylinder.getY());
    }

}