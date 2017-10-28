package net.thumbtack.denisenko.trainee.figure.box;


import net.thumbtack.denisenko.trainee.enums.Color;
import net.thumbtack.denisenko.trainee.figure.geometry.Figure;
import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Circle;
import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Rectangle;
import org.junit.Test;

import static org.junit.Assert.*;

public class BoxTest {
    @Test
    public void create() throws Exception {
        Box<Rectangle> box = new Box<>(new Rectangle());
        try {
            assertEquals( new Rectangle(), box.create(new Rectangle()));
        } catch (InstantiationException ex){
            ex.printStackTrace();
        }

    }

    @Test
    public void square() throws Exception {
        Box<Rectangle> box = new Box <> (new Rectangle());
        assertEquals(1, box.square(), 0.001);
    }

    @Test
    public void isSameSquare() throws Exception {
        Box<Rectangle> b = new Box<>(new Rectangle());
        Box<Circle> b2 = new Box<>(new Circle(2,2,1, (Color) null));
        assertEquals(true, b2.isSameSquare(new Box<Figure>( new Circle(2,2,1, (Color) null)) ) );
    }


    @Test
    public void isSameSquareStatic() throws Exception {
        assertEquals(true, Box.isSameSquareStatic( new Box<Figure>(new Rectangle()), new Box<Figure>(new Rectangle())));
    }

}