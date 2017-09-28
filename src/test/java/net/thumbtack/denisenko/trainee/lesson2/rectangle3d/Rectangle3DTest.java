package net.thumbtack.denisenko.trainee.lesson2.rectangle3d;

import org.junit.Test;

public class Rectangle3DTest {
    @Test
    public void printCoordinates() throws Exception {
        Rectangle3D r = new Rectangle3D(3, 2, 2);
        assertEquals(0, r.getTopLeftX() );
        assertEquals(2, r.getTopLeftY() );

        assertEquals(3, r.getBottomRightX() );
        assertEquals(0, r.getBottomRightY() );

        assertEquals(2, r.getHeightZ() );
    }

    @Test
    public void move() throws Exception {
        int n = 1;
        Rectangle3D r = new Rectangle3D(3, 2, 2);
        r.move(n, n);
        assertEquals(3 + n, r.getBottomRightX());
        assertEquals(0 + n, r.getBottomRightY());

        assertEquals(0 + n, r.getTopLeftX());
        assertEquals(2 + n, r.getTopLeftY());

        assertEquals(2, r.getHeightZ());
    }


    @Test
    public void reduceBase() throws Exception {
        int n = 1;
        Rectangle3D r = new Rectangle3D(3, 2, 2);
        r.reduceBase(n);
        assertEquals(3 - n, r.getBottomRightX() );
        assertEquals(2 - n, r.getTopLeftY() );
        assertEquals(2 - n, r.getHeightZ() );

    }



    @Test
    public void areaBase() throws Exception {
        Rectangle3D r = new Rectangle3D(3, 2, 2);
        assertEquals(6, Rectangle3D.areaBase(r));
    }



    @Test
    public void volume() throws Exception {
        Rectangle3D r = new Rectangle3D(3, 2, 2);
        assertEquals(12, Rectangle3D.volume(r));
    }

    @Test
    public void isPoint3DInRectangle() throws Exception {
        Point3D point3D = new Point3D(1, 1 ,1);
        Rectangle3D r = new Rectangle3D(3, 2, 2);
        assertTrue(Rectangle3D.isPoint3DInRectagle(point3D, r));
        assertTrue(Rectangle3D.isPoint3DInRectagle(1,1,1, r));
    }


    @Test
    public void isRect3DCrossingWithOtherRect3D() throws Exception {
        Rectangle3D r1 = new Rectangle3D(3, 3, 3);
        Rectangle3D r2 = new Rectangle3D(new Point2D(2,4), new Point2D(5,2),2 );
        assertTrue(Rectangle3D.isRect3DCrossingWithOtherRect3D(r1, r2));
    }

    @Test
    public void isRectangleContainedInOtherRectangle() throws Exception {
        Rectangle3D r1 = new Rectangle3D(2, 1, 1);
        Rectangle3D r2 = new Rectangle3D(3, 3, 3);

        assertTrue(Rectangle3D.isRectangleContainedInOtherRectangle(r1, r2));
    }
}