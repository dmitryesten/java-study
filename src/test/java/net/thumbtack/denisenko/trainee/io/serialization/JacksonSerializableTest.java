package net.thumbtack.denisenko.trainee.io.serialization;

import com.fasterxml.jackson.databind.ObjectMapper;
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

import static org.junit.Assert.assertEquals;

@RunWith(PowerMockRunner.class)
@PrepareForTest(JacksonSerializable.class)
public class JacksonSerializableTest {

    private File file;
    private Trainee trainee;
    private String expected = "{\"name\":\"Ilia\",\"surname\":\"Ilich\",\"rating\":4}";

    @Before
    public void setUp() throws Exception {
        this.file = new File("trainee.json");
        this.trainee = new Trainee("Ilia", "Ilich", 4);
    }

    @After
    public void tearDown() throws Exception {
        this.file.delete();
    }


    public JacksonSerializableTest() throws TraineeException {}

    @Test
    public void objectJackson() throws Exception {
        assertEquals(expected, JacksonSerializable.serializableJackson(trainee));
    }

    @Test
    public void write() throws Exception {
        PowerMockito.mockStatic(JacksonSerializable.class);
        PowerMockito.doNothing().when(JacksonSerializable.class);
        JacksonSerializable.write(trainee, file);
        PowerMockito.verifyStatic();
    }

    @Test
    public void read() throws Exception {
        JacksonSerializable.write(trainee, file);
        PowerMockito.mockStatic(JacksonSerializable.class);
        PowerMockito.when(JacksonSerializable.read(file)).thenReturn(new ObjectMapper());
        JacksonSerializable.read(file);
        PowerMockito.verifyStatic();
    }

}