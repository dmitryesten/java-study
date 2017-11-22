package net.thumbtack.denisenko.trainee.io.read;

import net.thumbtack.denisenko.trainee.exceptions.FileException;
import net.thumbtack.denisenko.trainee.exceptions.TraineeException;
import net.thumbtack.denisenko.trainee.trainee.Trainee;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.File;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FileReaderTraineeTest {

    private File file;
    private Trainee trainee;

    @Before
    public void setUp() throws Exception {
        this.file = new File("rec2.dat");
        this.trainee = new Trainee("test", "test", 4);
    }

    @Test(expected = FileException.class)
    public void readLines() throws Exception {
        FileReaderTrainee readRectangle =mock(FileReaderTrainee.class);
        when(readRectangle.readLines(trainee, file)).thenThrow(new FileException());
        when(readRectangle.readLines(trainee, file)).thenReturn(new StringBuilder(" "));
        assertEquals(new StringBuilder(" "),readRectangle.readLines(trainee, file));
        Mockito.verify(readRectangle).readLines(trainee, file);
    }

}