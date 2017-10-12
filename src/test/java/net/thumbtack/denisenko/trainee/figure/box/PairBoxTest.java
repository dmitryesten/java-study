package net.thumbtack.denisenko.trainee.figure.box;

import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Circle;
import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Rectangle;
import net.thumbtack.denisenko.trainee.figure.geometry.geometry3D.Rectangle3D;
import org.junit.Test;

import static org.junit.Assert.*;

public class PairBoxTest {
    @Test
    public void isSameSquare() throws Exception {
        PairBox<Rectangle, Circle> pairBox1 = new PairBox<>(new Rectangle(), new Circle(1,1,1));

        assertEquals(new Rectangle(), pairBox1.getContentRect() );
        assertEquals(new Circle(1,1,1), pairBox1.getContentCircle());

        PairBox<Rectangle, Rectangle> pairBox2 = new PairBox<>(new Rectangle(), new Rectangle3D());
        assertTrue(pairBox2.isSameSquare(pairBox2.getContentRect(), pairBox2.getContentRect()));
    }

}