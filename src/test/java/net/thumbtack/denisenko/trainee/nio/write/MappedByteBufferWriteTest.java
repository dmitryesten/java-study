package net.thumbtack.denisenko.trainee.nio.write;

import net.thumbtack.denisenko.trainee.exceptions.FileException;
import net.thumbtack.denisenko.trainee.nio.read.MappedByteBufferReader;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MappedByteBufferWriteTest {

    private File fileWriteNumber;

    @Before
    public void setUp() throws Exception {
        this.fileWriteNumber = new File("number099.txt");
    }

    @After
    public void tearDown() throws Exception {
        this.fileWriteNumber.delete();
    }

    @Test(expected = FileException.class)
    public void write() throws Exception {
        MappedByteBufferWrite fakeMappedByteBuffer = mock(MappedByteBufferWrite.class);
        doThrow(new FileException()).when(fakeMappedByteBuffer).write(fileWriteNumber);
        fakeMappedByteBuffer.write(fileWriteNumber);
        verify(fakeMappedByteBuffer).write(fileWriteNumber);
    }

}