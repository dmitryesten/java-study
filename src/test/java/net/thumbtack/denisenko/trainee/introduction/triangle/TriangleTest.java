package net.thumbtack.denisenko.trainee.introduction.triangle;

import net.thumbtack.denisenko.trainee.introduction.point2d.Point2D;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    Point2D p1 = new Point2D(2,1);
    Point2D p2 = new Point2D(5,6);
    Point2D p3 = new Point2D(8,1);

    Point2D p4 = new Point2D(5,3);
    Point2D p5 = new Point2D(10,10);


    Triangle triangle = new Triangle(p1, p2, p3);

    @Test
    public void printCoordinates() throws Exception {
        assertEquals(
                "Angle_№1: ("+2.0+ ", " +1.0+") " + "\r\n" +
                "Angle_№2: ("+5.0+ ", " +6.0+ ") " + "\r\n"+
                "Angle_№3: ("+8.0+ ", " +1.0+ ") " + "\r\n",
                Triangle.printCoordinats(triangle)
        );

    }

    @Test
    public void pointInTriangle() throws Exception {
        assertTrue(Triangle.pointInTriangle(p1, triangle));

    }


    @Ignore
    public void pointInTriangle1() throws Exception {
        assertTrue(triangle.pointInTriangle(5.0, 3.0));
    }


    @Ignore
    public void isIsosceles() throws Exception {
        Triangle triangleIso = new Triangle(new Point2D(1,1),new Point2D(3,5),new Point2D(5,1));
        Triangle triangleNotIso = new Triangle(new Point2D(1,1),new Point2D(3,5),new Point2D(6,1));
        assertFalse(Triangle.isIsosceles(triangleNotIso));
        assertFalse(Triangle.isIsosceles(triangleIso));
    }

    @Test
    public void area() throws Exception {
        Triangle triangle = new Triangle(new Point2D(1,1),new Point2D(3,5),new Point2D(6,1));
        assertEquals(11.1178, Triangle.area(triangle), 0.001);
    }

    @Ignore
    public void move() throws Exception {
        Triangle triangle = new Triangle(new Point2D(1,1),new Point2D(3,5),new Point2D(6,1));
        triangle.move(1,1);
        assertEquals(2.0, triangle.getX1(),0.1);

    }

}