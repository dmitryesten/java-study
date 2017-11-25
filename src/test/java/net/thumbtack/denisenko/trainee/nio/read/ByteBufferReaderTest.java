package net.thumbtack.denisenko.trainee.nio.read;

import net.thumbtack.denisenko.trainee.exceptions.FileException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.File;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest(ByteBufferReader.class)
public class ByteBufferReaderTest {

    private File file;

    @Before
    public void setUp() throws Exception {
        this.file = new File("fields.dat");
    }

    @After
    public void tearDown() throws Exception {
        this.file.delete();
    }

    @Test
    public void read() throws Exception {
        PowerMockito.mockStatic(ByteBufferReader.class);
        PowerMockito.when(ByteBufferReader.read(file)).thenReturn((new StringBuilder("test")));
        ByteBufferReader.read(file);
        PowerMockito.verifyStatic();
    }


}