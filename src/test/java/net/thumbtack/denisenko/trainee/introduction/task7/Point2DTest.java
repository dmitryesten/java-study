package net.thumbtack.denisenko.trainee.introduction.task7;

import net.thumbtack.denisenko.trainee.introduction.task7.Point2D;
import org.junit.Test;

import static org.junit.Assert.*;

public class Point2DTest {
    Point2D point2D = new Point2D(2,2);

    @Test
    public void move() throws Exception {
        assertEquals(1 , point2D.getX());
        assertEquals(1, point2D.getY());

        point2D.move(1, 1);

        assertEquals(2, point2D.getX());
        assertEquals(2, point2D.getY());
    }

    @Test
    public void printCoordinates() throws Exception {
        assertEquals("OX: "+ 1 +"; OY: " + 1 , Point2D.printCoordinates(point2D));
    }

}