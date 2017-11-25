package net.thumbtack.denisenko.trainee.io.write;

import net.thumbtack.denisenko.trainee.exceptions.FileException;
import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Rectangle;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.File;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


@RunWith(PowerMockRunner.class)
@PrepareForTest(PrintStreamRectangle.class)
public class PrintStreamRectangleTest {
    private File file;
    private Rectangle rectangle = new Rectangle();
    @Before
    public void setUp() throws Exception {
        this.file = new File("test.dat");
    }

    @After
    public void tearDown() throws Exception {
        this.file.delete();
    }

    @Test
    public void printStream() throws Exception {
        PowerMockito.mockStatic(PrintStreamRectangle.class);
        PowerMockito.doThrow(new FileException()).when(PrintStreamRectangle.class);
        PrintStreamRectangle.printStream(rectangle, file);
        PowerMockito.verifyStatic();
    }

}