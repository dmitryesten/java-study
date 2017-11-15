package net.thumbtack.denisenko.trainee.figure.geometry.geometry2D;

import org.junit.Test;

import static org.junit.Assert.*;

public class Point2DTest {
    private Point2D point2D = new Point2D(2,2);
    private final static double delta = 0.01;
    @Test
    public void printCoordinates() throws Exception {
        assertEquals("OX: "+ 2.0 +"; OY: " + 2.0 , point2D.printCoordinates());
    }

    @Test
    public void move() throws Exception {
        assertEquals(2, point2D.getX(), delta);
        assertEquals(2, point2D.getY(), delta);

        point2D.move(1, 1);

        assertEquals(3, point2D.getX(), delta);
        assertEquals(3, point2D.getY(), delta);
    }



}