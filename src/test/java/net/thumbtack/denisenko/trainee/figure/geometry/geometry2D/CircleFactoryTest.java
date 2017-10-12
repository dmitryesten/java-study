package net.thumbtack.denisenko.trainee.figure.geometry.geometry2D;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleFactoryTest {

    @Test
    public void createCircle() throws Exception {
        //assertEquals();
        Circle circle = new Circle(2,2,1);
        assertEquals(0, CircleFactory.getNumberInstances());
        assertEquals(circle, CircleFactory.createCircle(new Point2D(2,2),1));


        CircleFactory circleFactory2 = new CircleFactory();
        assertEquals(1, CircleFactory.getNumberInstances());
    }

}