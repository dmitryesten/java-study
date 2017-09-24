package net.thumbtack.denisenko.trainee.introduction.task8;

import net.thumbtack.denisenko.trainee.introduction.task7.Point2D;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {


    Point2D topLeft1 = new Point2D(1, 5);
    Point2D bottonRight2 = new Point2D(7, 2);
    Rectangle rect1 = new Rectangle(topLeft1, bottonRight2);



    @Test
    public void printCoordinatesRectangle() throws Exception {
        assertEquals(
                "Left-bottom angle: ("+1+ ", " +2+") " + "\r\n" +
                "Right-bottom angle: ("+7+ ", " +2+ ") " + "\r\n"+
                "Right-Up angle: ("+7+ ", " +5+ ") " + "\r\n" +
                "Left-Up angle: ("+1+ ", " +5+ ") ",

                "Left-bottom angle: ("+rect1.getTopLeftX()+ ", " + rect1.getBottomRightY()+") " + "\r\n" +
                "Right-bottom angle: ("+ rect1.getBottomRightX()+ ", " + rect1.getBottomRightY()+ ") " + "\r\n"+
                "Right-Up angle: ("+ rect1.getBottomRightX()+ ", " + rect1.getTopLeftY()+ ") " + "\r\n" +
                "Left-Up angle: ("+ rect1.getTopLeftX()+ ", " + rect1.getTopLeftY()+ ") " );

        assertNotEquals(
                "Left-bottom angle: ("+1+ ", " +1+") " + "\r\n" +
                        "Right-bottom angle: ("+7+ ", " +2+ ") " + "\r\n"+
                        "Right-Up angle: ("+7+ ", " +5+ ") " + "\r\n" +
                        "Left-Up angle: ("+1+ ", " +5+ ") ",

                "Left-bottom angle: ("+rect1.getTopLeftX()+ ", " + rect1.getBottomRightY()+") " + "\r\n" +
                        "Right-bottom angle: ("+ rect1.getBottomRightX()+ ", " + rect1.getBottomRightY()+ ") " + "\r\n"+
                        "Right-Up angle: ("+ rect1.getBottomRightX()+ ", " + rect1.getTopLeftY()+ ") " + "\r\n" +
                        "Left-Up angle: ("+ rect1.getTopLeftX()+ ", " + rect1.getTopLeftY()+ ") ");

    }

    @Test
    public void large() throws Exception {
        assertEquals(rect1, Rectangle.large(2, rect1));
    }


    @Test
    public void areaRectangle() throws Exception {
        assertEquals(18, Rectangle.areaRectangle(rect1));
    }


    @Test
    public void isPointContainedInRactangle() throws Exception {
        Point2D topLeft1 = new Point2D(1, 5);
        Point2D bottonRight2 = new Point2D(7, 2);
        Rectangle rect = new Rectangle(topLeft1, bottonRight2);

        Point2D point1 = new Point2D(2,3);
        Point2D point2 = new Point2D(2,1);
        assertTrue(Rectangle.isPointContainedInRactangle(point1, rect));
        assertFalse(Rectangle.isPointContainedInRactangle(point2, rect));
    }

    /*
    @Test
    public void isRectangleContainedInOtherRectangle() throws Exception {
        Point2D topLeft1 = new Point2D(1, 5);
        Point2D bottonRight2 = new Point2D(7, 2);
        Rectangle rect = new Rectangle(topLeft1, bottonRight2);

        Point2D topLeft3 = new Point2D(2, 4);
        Point2D bottonRight4 = new Point2D(6, 3);
        Rectangle rect2 = new Rectangle(topLeft3, bottonRight4);

        assertFalse(Rectangle.isRectangleContainedInOtherRectangle(rect2, rect));
        assertTrue(Rectangle.isRectangleContainedInOtherRectangle(rect, rect2));
    }

    @Test
    public void isRectangleCrossingWithOtherRectangle() throws Exception {
        Point2D topLeft1 = new Point2D(1, 5);
        Point2D bottonRight2 = new Point2D(7, 2);
        Rectangle rect = new Rectangle(topLeft1, bottonRight2);

        Point2D topLeft3 = new Point2D(4, 6);
        Point2D bottonRight4 = new Point2D(5, 1);
        Rectangle rect2 = new Rectangle(topLeft3, bottonRight4);

        assertFalse(Rectangle.isRectangleContainedInOtherRectangle(rect2, rect));
        assertTrue(Rectangle.isRectangleContainedInOtherRectangle(rect, rect2));
    }
    */

    @Test
    public void move() throws Exception {
        Point2D topLeft3 = new Point2D(4, 6);
        Point2D bottonRight4 = new Point2D(5, 1);
        Rectangle rect2 = new Rectangle(topLeft3, bottonRight4);

        rect2.move(1, 0);
        assertEquals(5, rect2.getTopLeftX());
        assertEquals(6, rect2.getBottomRightX());
        assertEquals(6, rect2.getTopLeftY());
        assertEquals(1, rect2.getBottomRightY());

    }

    @Test
    public void reduceRectangle() throws Exception {
        Point2D topLeft3 = new Point2D(4, 6);
        Point2D bottonRight4 = new Point2D(5, 1);
        Rectangle rect2 = new Rectangle(topLeft3, bottonRight4);
        rect2.reduceRectangle(0, 2);

        assertEquals(4, rect2.getTopLeftY());
        assertEquals(1, rect2.getBottomRightY());

    }

}