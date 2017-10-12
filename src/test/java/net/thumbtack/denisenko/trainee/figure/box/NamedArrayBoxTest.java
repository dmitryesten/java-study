package net.thumbtack.denisenko.trainee.figure.box;

import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Rectangle;
import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Triangle;
import org.junit.Test;

import static org.junit.Assert.*;

public class NamedArrayBoxTest {

    @Test
    public void getNameBox() throws Exception {

        NamedArrayBox <Rectangle> namedArrayBox = new NamedArrayBox<>(new Rectangle[1]);
        assertEquals(null, namedArrayBox.getNameBox() );
        namedArrayBox.setNameBox("Коробка с прямоугольниками");
        assertEquals("Коробка с прямоугольниками", namedArrayBox.getNameBox());
    }

}