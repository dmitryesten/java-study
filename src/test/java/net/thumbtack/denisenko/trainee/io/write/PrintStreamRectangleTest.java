package net.thumbtack.denisenko.trainee.io.write;

import net.thumbtack.denisenko.trainee.exceptions.FileException;
import net.thumbtack.denisenko.trainee.figure.geometry.geometry2D.Rectangle;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class PrintStreamRectangleTest {
    private File file;
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
        PrintStreamRectangle fakePrintStreamRectangle = mock(PrintStreamRectangle.class);
        fakePrintStreamRectangle.printStream(new Rectangle(), file);
        verify(fakePrintStreamRectangle).printStream(new Rectangle(), file);

    }

    @Test
    public void printStreamThrowException() throws Exception {
        PrintStreamRectangle fakePrintStreamRectangle = mock(PrintStreamRectangle.class);
        fakePrintStreamRectangle.printStream(new Rectangle(), null);
        doThrow(new FileException()).when(fakePrintStreamRectangle).printStream(new Rectangle(), null );

    }

}