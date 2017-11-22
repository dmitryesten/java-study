package net.thumbtack.denisenko.trainee.io.write;

import net.thumbtack.denisenko.trainee.exceptions.FileException;
import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Rectangle;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.io.File;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class WriteRectangleTest {

    private File file;
    @Before
    public void setUp() throws Exception {
        this.file = new File("test.txt");
    }

    @After
    public void tearDown() throws Exception {
        file.delete();
    }

    @Test
    public void write() throws Exception {
        WriteRectangle fakeWriteRectangle = mock(WriteRectangle.class);
        fakeWriteRectangle.write(new Rectangle(), file);
        verify(fakeWriteRectangle).write(new Rectangle(), file);
    }

    @Test(expected = FileException.class)
    public void writeThrowException() throws Exception {
        WriteRectangle fakeWriteRectangle = mock(WriteRectangle.class);

        doThrow(new FileException()).when(fakeWriteRectangle).write(new Rectangle(), file);
        fakeWriteRectangle.write(new Rectangle(), file);
    }

}