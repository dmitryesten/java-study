package net.thumbtack.denisenko.trainee.introduction;

import org.junit.Test;

import static org.junit.Assert.*;

public class Point2DTest {
    Point2D point2D = new Point2D(2,2);

    @Test
    public void movePoint() throws Exception {
        assertEquals(1 , point2D.getAbscissaOx());
        assertEquals(1, point2D.getOrdinateOy());

        point2D.movePoint(1, 1);

        assertEquals(2, point2D.getAbscissaOx());
        assertEquals(2, point2D.getOrdinateOy());
    }

    @Test
    public void printCoordinates() throws Exception {
        assertEquals("OX: "+ 1 +"; OY: " + 1 , Point2D.printCoordinates(point2D));
    }

}