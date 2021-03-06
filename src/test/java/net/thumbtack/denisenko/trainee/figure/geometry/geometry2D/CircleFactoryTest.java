package net.thumbtack.denisenko.trainee.figure.geometry.geometry2D;

import net.thumbtack.denisenko.trainee.enums.Color;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleFactoryTest {

    @Test
    public void createCircle() throws Exception {
        //assertEquals();
        Circle circle = new Circle(2,2,1, (Color) null);
        assertEquals(0, CircleFactory.getNumberInstances());
        assertEquals(circle, CircleFactory.createCircle(new Point2D(2,2),1, null));

        CircleFactory circleFactory2 = new CircleFactory();
        assertEquals(1, CircleFactory.getNumberInstances());
    }

}