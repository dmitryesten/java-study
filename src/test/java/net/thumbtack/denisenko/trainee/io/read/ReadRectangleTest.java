package net.thumbtack.denisenko.trainee.io.read;

import net.thumbtack.denisenko.trainee.exceptions.FileException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.File;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ReadRectangleTest {

    private File file;
    @Before
    public void setUp() throws Exception {
        this.file = new File("rec2.dat");
    }

    @After
    public void tearDown() throws Exception {
        file.delete();
    }


    @Test(expected = FileException.class)
    public void read() throws Exception {
        ReadRectangle readRectangle =mock(ReadRectangle.class);
        when(readRectangle.read(file)).thenThrow(new FileException());
        when(readRectangle.read(file)).thenReturn(new StringBuilder(" "));
        assertEquals(new StringBuilder(" "),readRectangle.read(file));
        verify(readRectangle).read(file);

    }

}