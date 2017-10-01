package net.thumbtack.denisenko.trainee.geometry2D;

import net.thumbtack.denisenko.trainee.geometry2D.Point2D;
import org.junit.Test;

import static org.junit.Assert.*;

public class Point2DTest {
    Point2D point2D = new Point2D(2,2);

    @Test
    public void printCoordinates() throws Exception {
        assertEquals("OX: "+ 2 +"; OY: " + 2 , point2D.printCoordinates());
    }

    @Test
    public void move() throws Exception {
        assertEquals(2, point2D.getX());
        assertEquals(2, point2D.getY());

        point2D.move(1, 1);

        assertEquals(3, point2D.getX());
        assertEquals(3, point2D.getY());
    }



}