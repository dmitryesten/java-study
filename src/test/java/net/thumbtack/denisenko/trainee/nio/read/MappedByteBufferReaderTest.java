package net.thumbtack.denisenko.trainee.nio.read;

import net.thumbtack.denisenko.trainee.exceptions.FileException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class MappedByteBufferReaderTest {

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
        MappedByteBufferReader fakeMappedByteBuffer = mock(MappedByteBufferReader.class);
        when(fakeMappedByteBuffer.read(file)).thenReturn(new StringBuilder("test"));
        when(fakeMappedByteBuffer.read(file)).thenThrow(new FileException());
        fakeMappedByteBuffer.read(file);
        verify(fakeMappedByteBuffer).read(file);
    }

}