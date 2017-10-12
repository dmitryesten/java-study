package net.thumbtack.denisenko.trainee.figure;

import net.thumbtack.denisenko.trainee.exceptions.ColorException;
import org.junit.Test;

import static org.junit.Assert.*;

public class ColorTest {

    @Test(expected = ColorException.class)
    public void colorFromString() throws Exception {
        Color color;
        assertEquals(Color.BLACK, Color.colorFromString("BLACK"));
        assertEquals(Color.GREEN, Color.colorFromString("green"));
        assertNotEquals(Color.GREEN, Color.colorFromString("grean"));
    }

}