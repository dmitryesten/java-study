package net.thumbtack.denisenko.trainee.io.read;


import net.thumbtack.denisenko.trainee.exceptions.FileException;
import net.thumbtack.denisenko.trainee.trainee.Trainee;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import java.io.File;


@RunWith(PowerMockRunner.class)
@PrepareForTest(FileReaderTrainee.class)

public class FileReaderTraineeTest {

    private File file;
    private Trainee trainee;

    @Before
    public void setUp() throws Exception {
        this.file = new File("rec2.dat");
        this.trainee = new Trainee("test", "test", 4);
    }

    @Test
    public void readLines() throws Exception {
        PowerMockito.mockStatic(FileReaderTrainee.class);
        PowerMockito.when(FileReaderTrainee.readLines(trainee, file)).thenReturn(new StringBuilder("test\ntest"));
        Assert.assertEquals(new StringBuilder("test\ntest").toString(), FileReaderTrainee.readLines(trainee, file).toString());
        //PowerMockito.verifyStatic();
    }

    @Test(expected = FileException.class)
    public void readLinesException() throws Exception {
        PowerMockito.mockStatic(FileReaderTrainee.class);
        PowerMockito.when(FileReaderTrainee.readLines(trainee,null)).thenThrow(new FileException());
        FileReaderTrainee.readLines(trainee, null);
        //PowerMockito.verifyStatic();
    }

    /*@Test(expected = FileException.class)
    public void readLines() throws Exception {
        FileReaderTrainee readRectangle =mock(FileReaderTrainee.class);
        when(readRectangle.readLines(trainee, file)).thenThrow(new FileException());
        when(readRectangle.readLines(trainee, file)).thenReturn(new StringBuilder(" "));
        assertEquals(new StringBuilder(" "),readRectangle.readLines(trainee, file));
        Mockito.verify(readRectangle).readLines(trainee, file);
    }*/

}