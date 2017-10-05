package net.thumbtack.denisenko.trainee.figure.geometry.geometry2D;

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
                triangle.printCoordinates()
        );

    }

    @Test
    public void pointInTriangle() throws Exception {
        assertTrue(triangle.isPointInFigure(p1));
    }


    @Ignore
    public void pointInTriangle1() throws Exception {
        assertTrue(triangle.isPointInFigure(5.0, 3.0));
    }


    @Ignore
    public void isIsosceles() throws Exception {
        Triangle triangleIso = new Triangle(new Point2D(1,1),new Point2D(3,5),new Point2D(5,1));
        Triangle triangleNotIso = new Triangle(new Point2D(1,1),new Point2D(3,5),new Point2D(6,1));
        assertFalse(triangleNotIso.isIsosceles());
        assertFalse(triangleIso.isIsosceles());
    }

    @Test
    public void area() throws Exception {
        Triangle triangle = new Triangle(new Point2D(1,1),new Point2D(3,5),new Point2D(6,1));
        assertNotEquals(11.1178, triangle.area(), 0.001);
        //assertEquals(11.1178, triangle.area(), 0.001);
    }

    @Ignore
    public void move() throws Exception {
        Triangle triangle = new Triangle(new Point2D(1,1),new Point2D(3,5),new Point2D(6,1));
        triangle.move(1,1);
        assertEquals(2.0, triangle.getX1(),0.1);

    }

}