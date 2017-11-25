package net.thumbtack.denisenko.trainee.nio.read;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import java.io.File;



@RunWith(PowerMockRunner.class)
@PrepareForTest(MappedByteBufferReader.class)
public class MappedByteBufferReaderTest {

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
        PowerMockito.mockStatic(MappedByteBufferReader.class);
        PowerMockito.when(MappedByteBufferReader.read(file)).thenReturn(new StringBuilder("test"));
        MappedByteBufferReader.read(file);
        PowerMockito.verifyStatic();
    }


}