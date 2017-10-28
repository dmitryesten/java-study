package net.thumbtack.denisenko.trainee.figure.geometry.geometry2D;


import net.thumbtack.denisenko.trainee.enums.Color;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {


    Point2D topLeft1 = new Point2D(1, 5);
    Point2D bottonRight2 = new Point2D(7, 2);
    Rectangle rect1 = new Rectangle(topLeft1, bottonRight2, (Color)null);



    @Ignore
    public void printCoordinatesRectangle() throws Exception {
        Rectangle r = new Rectangle();

        assertEquals(
                "Left-bottom angle: ("+0+ ", " +0+") " + "\r\n" +
                        "Right-bottom angle: ("+1+ ", " +0+ ") " + "\r\n"+
                        "Right-Up angle: ("+1+ ", " +1+ ") " + "\r\n" +
                        "Left-Up angle: ("+0+ ", " +1+ ") ",

               r.printCoordinates() );

    }

    @Ignore
    public void large() throws Exception {
        assertEquals(rect1, Rectangle.large(2));
    }


    @Test
    public void area() throws Exception {
        assertEquals(18.0, rect1.area(),0.001);
    }


    @Ignore
    public void isPointInFigure() throws Exception {
        Point2D topLeft1 = new Point2D(1, 5);
        Point2D bottonRight2 = new Point2D(7, 2);
        Rectangle rect = new Rectangle(topLeft1, bottonRight2, (Color)null);

        Point2D point1 = new Point2D(2,3);
        Point2D point2 = new Point2D(2,1);
        assertTrue(rect.isPointInFigure(point1));
        assertTrue(rect.isPointInFigure(point2));
    }


    @Ignore
    public void isRectangleContainedInOtherRectangle() throws Exception {
        Point2D topLeft1 = new Point2D(1, 5);
        Point2D bottonRight2 = new Point2D(7, 2);
        Rectangle rect = new Rectangle(topLeft1, bottonRight2, (Color)null);

        Point2D topLeft3 = new Point2D(2, 4);
        Point2D bottonRight4 = new Point2D(6, 3);
        Rectangle rect2 = new Rectangle(topLeft3, bottonRight4,(Color) null);

        assertFalse(Rectangle.isRectangleContainedInOtherRectangle(rect2, rect));
        assertTrue(Rectangle.isRectangleContainedInOtherRectangle(rect, rect2));
    }

    @Ignore
    public void isRectangleCrossingWithOtherRectangle() throws Exception {
        Point2D topLeft1 = new Point2D(1, 5);
        Point2D bottonRight2 = new Point2D(7, 2);
        Rectangle rect = new Rectangle(topLeft1, bottonRight2, (Color)null);

        Point2D topLeft3 = new Point2D(4, 6);
        Point2D bottonRight4 = new Point2D(5, 1);
        Rectangle rect2 = new Rectangle(topLeft3, bottonRight4,(Color) null);

        assertFalse(Rectangle.isRectangleContainedInOtherRectangle(rect2, rect));
        assertTrue(Rectangle.isRectangleContainedInOtherRectangle(rect, rect2));
    }


    @Test
    public void move() throws Exception {
        Point2D topLeft3 = new Point2D(4, 6);
        Point2D bottonRight4 = new Point2D(5, 1);
        Rectangle rect2 = new Rectangle(topLeft3, bottonRight4,(Color) null);

        rect2.move(1, 0);
        assertEquals(5.0, rect2.getTopLeftX(), 0.001);
        assertEquals(6.0, rect2.getBottomRightX(), 0.001);
        assertEquals(6.0, rect2.getTopLeftY(), 0.001);
        assertEquals(1.0, rect2.getBottomRightY(), 0.001);

    }

    @Test
    public void reduceRectangle() throws Exception {
        Point2D topLeft3 = new Point2D(4, 6);
        Point2D bottonRight4 = new Point2D(5, 1);
        Rectangle rect2 = new Rectangle(topLeft3, bottonRight4, (Color) null);
        rect2.reduceRectangle(0, 2);

        assertEquals(4, rect2.getTopLeftY(), 0.001);
        assertEquals(1, rect2.getBottomRightY(), 0.001);

    }

}