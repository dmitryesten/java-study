package net.thumbtack.denisenko.trainee.introduction.task10;

import net.thumbtack.denisenko.trainee.introduction.task7.Point2D;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    Point2D center = new Point2D(4, 5);
    Circle circle = new Circle(center, 2);



    @Test
    public void printCoordinats() throws Exception {
        assertEquals(
                "Координаты ("+4+"; "+5+ "), радиус = "+2,
                "Координаты ("+ circle.getX()+"; "+ circle.getY()+ "), радиус = "+circle.getRadius()
        );
    }


    @Test
    public void area() throws Exception {
        assertEquals(12.5663, Circle.area(circle), 0.0001);
    }


    @Test
    public void length() throws Exception {
        assertEquals(12.5663, Circle.length(circle), 0.0001);
    }


    @Test
    public void isPointInCircle() throws Exception {
        Point2D point = new Point2D(3, 4);
        Point2D point2 = new Point2D(1, 1);
        assertTrue(Circle.isPointInCircle(point, circle));
        assertFalse(Circle.isPointInCircle(point2, circle));
    }


    @Test
    public void isPointInCircle1() throws Exception {
        assertTrue(circle.isPointInCircle(3, 5));
        assertFalse(circle.isPointInCircle(1,1));
    }


    @Test
    public void move() throws Exception {
        circle.move(2,2);
        assertEquals(6, circle.getX());
        assertEquals(7, circle.getY());
    }

}