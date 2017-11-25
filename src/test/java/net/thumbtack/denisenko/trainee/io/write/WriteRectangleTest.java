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
import static org.mockito.Mockito.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest(WriteRectangle.class)
public class WriteRectangleTest {

    private File file;
    private Rectangle rectangle = new Rectangle();
    @Before
    public void setUp() throws Exception {
        this.file = new File("binary.bin");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void write() throws Exception {
        PowerMockito.mockStatic(WriteRectangle.class);
        PowerMockito.doThrow(new FileException()).when(WriteRectangle.class);
        WriteRectangle.write(rectangle, file);
        PowerMockito.verifyStatic();
    }


    @Test
    public void getFields() throws Exception {
        PowerMockito.mockStatic(WriteRectangle.class);
        PowerMockito.when(WriteRectangle.class, "getFields", rectangle).thenReturn(anyList());
    }

}