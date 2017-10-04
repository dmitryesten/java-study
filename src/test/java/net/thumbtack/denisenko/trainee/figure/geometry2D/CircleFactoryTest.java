package net.thumbtack.denisenko.trainee.figure.geometry2D;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleFactoryTest {

    Point2D p =new Point2D(1, 2);

    @Test
    public void getNumberInstances() throws Exception {
        CircleFactory circleFactory = new CircleFactory(p, 3);
        assertEquals(1, CircleFactory.getNumberInstances());

        CircleFactory circleFactory2 = new CircleFactory(p, 3);
        assertEquals(2, CircleFactory.getNumberInstances());
    }

}