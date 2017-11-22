package net.thumbtack.denisenko.trainee.io.write;

import net.thumbtack.denisenko.trainee.exceptions.FileException;
import net.thumbtack.denisenko.trainee.exceptions.TraineeException;
import net.thumbtack.denisenko.trainee.trainee.Trainee;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.File;


import static org.mockito.Mockito.*;


public class FileWriterTraineeTest {


    private File file;
    private Trainee trainee;

    @Before
    public void setUp() throws Exception {
        this.file = new File("test.dat");
        this.trainee = new Trainee("Kate", "Roll", 5);
    }

    @After
    public void tearDown() throws Exception {
        this.file.delete();
        this.trainee = null;

    }

    @Test
    public void fileWriter() throws Exception {
        FileWriterTrainee fakeFileWriterTrainee = mock(FileWriterTrainee.class);
        fakeFileWriterTrainee.write(trainee, file);
        verify(fakeFileWriterTrainee).write(trainee, file);
    }


    @Test(expected = TraineeException.class )
    public void fileWriterThrowException() throws Exception {
        FileWriterTrainee fakeFileWriterTrainee = mock(FileWriterTrainee.class);
        fakeFileWriterTrainee.write(new Trainee("", "Roll", 7), file);
        doThrow(new TraineeException()).when(fakeFileWriterTrainee).write(new Trainee("", "Roll", 7), file);

    }


    @Test
    public void writerMonoLine() throws Exception {
        FileWriterTrainee fakeFileWriterTrainee = mock(FileWriterTrainee.class);
        fakeFileWriterTrainee.writeMonoLine(trainee, file);
        verify(fakeFileWriterTrainee).writeMonoLine(trainee, file);
    }

    @Test(expected = TraineeException.class)
    public void writerMonoLineThrowException() throws Exception {
        FileWriterTrainee fakeFileWriterTrainee = mock(FileWriterTrainee.class);
        fakeFileWriterTrainee.writeMonoLine(new Trainee("asd", "Roll", 8), file);
        doThrow(new TraineeException()).when(fakeFileWriterTrainee).writeMonoLine(new Trainee("asd", "Roll", 8), file);

    }





}