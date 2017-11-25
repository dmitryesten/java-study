package net.thumbtack.denisenko.trainee.io.serialization;

import net.thumbtack.denisenko.trainee.exceptions.FileException;
import net.thumbtack.denisenko.trainee.exceptions.TraineeException;
import net.thumbtack.denisenko.trainee.trainee.Trainee;
import org.junit.*;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;
import static org.mockito.Mockito.*;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.*;

import static org.junit.Assert.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Serializable.class)
public class SerializableTraineeTest {

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();
    File file;
    private final Trainee trainee = new Trainee("Ivan", "Ivanov", 5);

    public SerializableTraineeTest() throws TraineeException {
    }


    @Before
    public void setUp() throws Exception {
        this.file = new File("binary.txt");
    }

    @After
    public void tearDown() throws Exception {
        file.delete();
    }

    @Test
    public void serializeToFile() throws Exception {
        PowerMockito.mockStatic(Serializable.class);
        PowerMockito.doNothing().when(Serializable.class);
        Serializable.serializeToFile(trainee, folder.newFile("test.txt"));
        PowerMockito.verifyStatic();
    }

    @Test
    public void deserializeOfFile() throws Exception {
        PowerMockito.mockStatic(Serializable.class);
        Serializable.serializeToFile(trainee, file);
        PowerMockito.when(Serializable.deserializeOfFile(file)).thenReturn(trainee);
        Assert.assertEquals(trainee, Serializable.deserializeOfFile(file));
    }

    @Test
    public void serializeToBytes() throws Exception {
        byte [] bytes = trainee.toString().getBytes();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try (ObjectOutput out = new ObjectOutputStream(bos)) {
            out.writeObject(trainee);
            bos.toByteArray();
        }
        assertEquals(bos.toByteArray().length, Serializable.serializeToBytes(trainee).length);
    }


    @Test
    public void deserializeOfBytes() throws Exception {
        try (ByteArrayInputStream bis = new ByteArrayInputStream(Serializable.serializeToBytes(trainee));
             ObjectInput in = new ObjectInputStream(bis)) {
            assertEquals(in.readObject(), Serializable.deserializeOfBytes(Serializable.serializeToBytes(trainee)) );
        }
    }

    
}