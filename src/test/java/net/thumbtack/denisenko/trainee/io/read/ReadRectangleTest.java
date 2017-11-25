package net.thumbtack.denisenko.trainee.io.read;


import net.thumbtack.denisenko.trainee.exceptions.FileException;
import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Rectangle;
import net.thumbtack.denisenko.trainee.io.write.WriteRectangle;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.File;

import static org.mockito.Matchers.anyString;


@RunWith(PowerMockRunner.class)
@PrepareForTest(ReadRectangle.class)
public class ReadRectangleTest {


    private File file;
    private Rectangle rectangle = new Rectangle();
    @Before
    public void setUp() throws Exception {
        this.file = new File("rectangleTest.bin");
        WriteRectangle.write(rectangle, file);
    }

    @After
    public void tearDown() throws Exception {
        file.delete();
    }

    @Test
    public void read() throws Exception {
        PowerMockito.mockStatic(ReadRectangle.class);
        PowerMockito.when(ReadRectangle.read(file)).thenReturn(new StringBuilder("test"));
        Assert.assertEquals(new StringBuilder("test").toString(), ReadRectangle.read(file).toString());
        PowerMockito.verifyStatic();
    }

    @Test(expected = FileException.class)
    public void readException() throws Exception {
        PowerMockito.mockStatic(ReadRectangle.class);
        PowerMockito.when(ReadRectangle.read(new File("null"))).thenThrow(new FileException());
        ReadRectangle.read(new File("null"));
        PowerMockito.verifyStatic();
    }


}