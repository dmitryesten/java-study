package net.thumbtack.denisenko.trainee.io.write;


import net.thumbtack.denisenko.trainee.exceptions.TraineeException;
import net.thumbtack.denisenko.trainee.trainee.Trainee;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import java.io.File;


@RunWith(PowerMockRunner.class)
@PrepareForTest(FileWriterTrainee.class)
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
        PowerMockito.mockStatic(FileWriterTrainee.class);
        PowerMockito.doNothing().when(FileWriterTrainee.class);
        FileWriterTrainee.write(trainee, file);
        PowerMockito.verifyStatic();
    }

    @Test(expected = TraineeException.class)
    public void fileWriterException() throws Exception {
        PowerMockito.mockStatic(FileWriterTrainee.class);
        PowerMockito.doThrow(new TraineeException()).when(FileWriterTrainee.class);
        FileWriterTrainee.write(new Trainee("", "",5), file);
        PowerMockito.verifyStatic();
    }



    @Test
    public void writerMonoLine() throws Exception {
        PowerMockito.mockStatic(FileWriterTrainee.class);
        PowerMockito.doNothing().when(FileWriterTrainee.class);
        FileWriterTrainee.writeMonoLine(trainee, file);
        PowerMockito.verifyStatic();
    }

    @Test(expected = TraineeException.class)
    public void writerMonoLineThrowException() throws Exception {
        PowerMockito.mockStatic(FileWriterTrainee.class);
        PowerMockito.doThrow(new TraineeException()).when(FileWriterTrainee.class);
        FileWriterTrainee.writeMonoLine(new Trainee("", "",5), file);
        PowerMockito.verifyStatic();
    }





}