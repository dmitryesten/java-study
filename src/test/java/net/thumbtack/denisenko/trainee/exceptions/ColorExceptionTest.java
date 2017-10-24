package net.thumbtack.denisenko.trainee.exceptions;

import net.thumbtack.denisenko.trainee.cars.Car;
import org.junit.Test;
import static org.junit.Assert.*;


public class ColorExceptionTest {

    @Test(expected = ColorException.class)
    public void testColorException() throws ColorException {
        final Car car = new Car("s", 4, 4,"RAD");
    }


}