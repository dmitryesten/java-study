package net.thumbtack.denisenko.trainee.figure.geometry.geometry2D;

import net.thumbtack.denisenko.trainee.figure.Color;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    Point2D center = new Point2D(4, 5);
    Circle circle = new Circle(center, 2, (Color) null);


    @Test
    public void printCoordinats() throws Exception {
        assertEquals(
                "Координаты ("+4.0+"; "+5.0+ "), радиус = "+2.0,
                circle.printCoordinates()
        );
    }


    @Test
    public void area() throws Exception {
        assertEquals(12.5663, circle.area(), 0.0001);
    }


    @Test
    public void length() throws Exception {
        assertEquals(12.5663, circle.length(), 0.0001);
    }



    @Ignore
    public void isPointInCircle() throws Exception {
        Point2D point = new Point2D(3, 4);
        Point2D point2 = new Point2D(1, 1);
        //assertTrue(Circle.isPointInCircle(point, circle));
        assertFalse(circle.isPointInFigure(point2));
    }



    @Ignore
    public void isPointInCircle1() throws Exception {
        assertTrue(circle.isPointInFigure(3, 5));
        assertFalse(circle.isPointInFigure(1,1));
    }


    @Test
    public void move() throws Exception {
        circle.move(2,2);
        assertEquals(6, circle.getX(), 0.001);
        assertEquals(7, circle.getY(), 0.001);
    }

}