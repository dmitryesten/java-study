package net.thumbtack.denisenko.trainee.nio.read;

import net.thumbtack.denisenko.trainee.exceptions.FileException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ByteBufferReaderTest {

    private File file;

    @Before
    public void setUp() throws Exception {
        this.file = new File("rec2.dat");
    }

    @After
    public void tearDown() throws Exception {
        this.file.delete();
    }

    @Test(expected = FileException.class)
    public void read() throws Exception {
        ByteBufferReader byteBufferReader = mock(ByteBufferReader.class);
        when(byteBufferReader.read(file)).thenReturn(new StringBuilder("test"));
        when(byteBufferReader.read(file)).thenThrow(new FileException());
        byteBufferReader.read(file);
        verify(byteBufferReader).read(file);
    }


}