package net.thumbtack.denisenko.trainee.enums;

import net.thumbtack.denisenko.trainee.exceptions.ColorException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Color.class)
public class ColorTest {


    @Test(expected = ColorException.class)
    public void colorFromString() throws Exception {
        String color = "white";
        PowerMockito.mockStatic(Color.class);
        PowerMockito.when(Color.colorFromString(color)).thenReturn(Color.WHITE);
        PowerMockito.when(Color.colorFromString(null)).thenThrow(new ColorException(null));
        Color.colorFromString(color);
        Color.colorFromString(null);
        PowerMockito.verifyStatic(Mockito.times(2));
    }

}